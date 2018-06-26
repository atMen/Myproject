package customer.tcrj.com.myproject;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.MapView;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.animation.Animation;
import com.amap.api.maps.model.animation.ScaleAnimation;
import com.amap.api.maps.model.animation.TranslateAnimation;
import com.tsy.sdk.myokhttp.MyOkHttp;
import com.tsy.sdk.myokhttp.response.GsonResponseHandler;

import java.util.ArrayList;
import java.util.List;

import customer.tcrj.com.myproject.Utils.ACache;
import customer.tcrj.com.myproject.Utils.AppManager;
import customer.tcrj.com.myproject.Utils.DialogHelper;
import customer.tcrj.com.myproject.Utils.Utils;
import customer.tcrj.com.myproject.adpater.InfoWinAdapter;
import customer.tcrj.com.myproject.bean.jlqjInfo;
import customer.tcrj.com.myproject.bean.qyListInfo;
import customer.tcrj.com.myproject.first.qjListActivity;
import customer.tcrj.com.myproject.net.ApiConstants;

public class BaiduMapActivity extends AppCompatActivity implements AMap.OnMapTouchListener, AMap.OnMapLoadedListener, View.OnClickListener, AMap.OnMapClickListener {

    private MapView mapView;
    private TextView txtTitle;
    private AMap aMap;
    private EditText edt_search_result;
    private LinearLayout layout_search_result;
    private ImageView btnback;
    protected Dialog mLoadingDialog = null;
    InfoWinAdapter adapter;
    private MyOkHttp mMyOkhttp;
    private String key;
    //自定义定位小蓝点的Marker
    private Marker locationMarker;
    private BaiduMapActivity.MyCancelCallback myCancelCallback = new BaiduMapActivity.MyCancelCallback();
    ArrayList<MarkerOptions> markers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baidu_map);

        AppManager.getAppManager().addActivity(this);
        key = ACache.get(this).getAsString("Key");
        mMyOkhttp = MyApp.getInstance().getMyOkHttp();
        mLoadingDialog = DialogHelper.getLoadingDialog(this);
        initview();
        //初始化地图
        initMap(savedInstanceState);
//        initData();
    }

//    private void initData() {
//        MarkerOptions markerOption = new MarkerOptions();
//        markerOption.icon(BitmapDescriptorFactory
//                .fromResource(R.mipmap.ic_launcher))
//                .position(new LatLng(34.190863,108.869881))
//                .title("title")
//                .snippet("陕西")
//                .period(0)
//                .draggable(true);
//        markers.add(markerOption);
//
//        setInfoWindow();
//    }


    @Override
    public void onMapLoaded() {
        Log.e("TAG","地图加载成功");
        LatLng marker1 = new LatLng(34.190863, 108.869881);
        //设置中心点和缩放比例
        aMap.moveCamera(CameraUpdateFactory.changeLatLng(marker1));
        aMap.moveCamera(CameraUpdateFactory.zoomTo(8));
    }

    private void initview() {
        btnback = (ImageView)findViewById(R.id.btnback);
        layout_search_result = (LinearLayout)findViewById(R.id.layout_search_result);
        edt_search_result = (EditText)findViewById(R.id.edt_search_result);
        mapView = (MapView) findViewById(R.id.mapview);
        txtTitle = (TextView)findViewById(R.id.txtTitle);

        btnback.setOnClickListener(this);
        layout_search_result.setOnClickListener(this);

        txtTitle.setText("企业位置信息");
        edt_search_result.setHint("请输入企业名称/组织机构代码");
    }

    private void initMap(Bundle savedInstanceState) {
        //初始化高德地图
        mapView.onCreate(savedInstanceState);//此方法必须重写
        if (aMap == null) {
            aMap = mapView.getMap();
            Log.e("TAG","aMap"+aMap);
            aMap.setOnMapTouchListener(this);
            aMap.setOnMapLoadedListener(this);
            aMap.setOnInfoWindowClickListener(new AMap.OnInfoWindowClickListener() {
                @Override
                public void onInfoWindowClick(Marker marker) {
                    //标题框的点击事件
//                    Toast.makeText(GPSActivity.this, marker.getTitle(), Toast.LENGTH_SHORT).show();
                }
            });
        }

    }

    private void setInfoWindow() {

        aMap.clear();

        if(markers.size()>0){
            final ArrayList<Marker> list = aMap.addMarkers(markers, true);
            LatLngBounds.Builder boundsBuilder = new LatLngBounds.Builder();//存放所有点的经纬度

            for(int i=0;i<list.size();i++){
                boundsBuilder.include(markers.get(i).getPosition());//把所有点都include进去（LatLng类型）

//                Animation animation = new ScaleAnimation(0,1,0,1); //初始化生长效果动画
////
//                long duration = 1000L;
//                animation.setDuration(duration);
//                animation.setInterpolator(new LinearInterpolator());
//                list.get(i).setAnimation(animation);
//                list.get(i).startAnimation();

            }
            aMap.animateCamera(CameraUpdateFactory.newLatLngBounds(boundsBuilder.build(), 20));//第二个参数为四周留空宽度
            if(markers.size() == 1){
                Log.e("TAG","只有一条信息时限制缩放比例");
                aMap.moveCamera(CameraUpdateFactory.zoomTo(12));
            }

            aMap.setOnMapClickListener(this);
            adapter = new InfoWinAdapter();
            aMap.setInfoWindowAdapter(adapter);

//      marker的点击事件
            aMap.setOnMarkerClickListener(new AMap.OnMarkerClickListener() {
                @Override
                public boolean onMarkerClick(Marker marker) {

                    String title1 = marker.getTitle();

                    currentMarker=marker;
                    marker.showInfoWindow();
//                    map_layout.setVisibility(View.VISIBLE);
//                    tvAdress.setText(marker.getSnippet());
//                    tvName.setText(marker.getTitle());
//                    int period = marker.getPeriod();
//                    Log.e("TAG","时间："+period);
//                    tvTime.setText(mapLocation.get(period - 1).getAddDatetime());


                    return true;
                }
            });
        }else{
            Toast.makeText(this, "未发现相关企业信息", Toast.LENGTH_SHORT).show();
        }


    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.layout_search_result:
                String string = edt_search_result.getText().toString();
                if(string.equals("") || string == null){
                    Toast.makeText(this, "请输入要查询的内容", Toast.LENGTH_SHORT).show();
                }else{
                    getType(string);
                }
                break;
            case R.id.btnback:
                finish();
                break;

        }
    }

    private void getType(String string) {

        showLoadingDialog();
        Log.e("TAG","string："+string);
        mMyOkhttp.post()
                .url(ApiConstants.qylistApi+key)
//                .addParam("JGMC",string == null? "":string)
                .addParam("OrParam",string == null? "":string)
                .addParam("IsMap","1")
//                .addParam("ZZJGDM",string == null? "":string)
                .addParam("pageSize","10")
                .addParam("pageIndex","1")
                .tag(this)
                .enqueue(new GsonResponseHandler<qyListInfo>() {
                    @Override
                    public void onFailure(int statusCode, String error_msg) {
                        Log.e("TAG","失败："+error_msg);
                        markers.clear();
                        Toast.makeText(BaiduMapActivity.this, "数据加载失败", Toast.LENGTH_SHORT).show();
                        hideLoadingDialog();
                    }

                    @Override
                    public void onSuccess(int statusCode, qyListInfo response) {
                        hideLoadingDialog();

                        Log.e("TAG","response:"+response.getData().size());
//                        Log.e("TAG","数据量："+response.getData().size());
                        if(response.getStat() == null){
//                            double lat = response.getData().get(0).getLat();
//                            Log.e("TAG","经纬度："+lat+"   数据量："+response.getData().size());

                            showMark(response.getData());
                        }else{

                            if(response.getStat().equals("101")){
                                Utils.toLogin(BaiduMapActivity.this);
                            }
                        }



                    }
                });


    }


    private void showMark(List<qyListInfo.DataBean> list) {
        markers.clear();

        if(list.size() > 0){
            Log.e("TAG","showMark:"+list.size());
            for(int i=0;i<list.size();i++){
                qyListInfo.DataBean mapLocationBean = list.get(i);
                MarkerOptions markerOption = new MarkerOptions();
                markerOption.icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.map_icon))
                        .position(new LatLng( Double.valueOf(mapLocationBean.getLat()),Double.valueOf(mapLocationBean.getLng())))
                        .title(mapLocationBean.getQYMC())
                        .snippet(mapLocationBean.getZCDZ())
                        .zIndex(i)
                        .draggable(true);
                markers.add(markerOption);
            }
        }

        setInfoWindow();
    }


    private Marker currentMarker;
    @Override
    public void onMapClick(LatLng latLng) {
        if(currentMarker.isInfoWindowShown()){
            currentMarker.hideInfoWindow();//这个是隐藏infowindow窗口的方法
        }
    }

    /**
     * 监控地图动画移动情况，如果结束或者被打断，都需要执行响应的操作
     */
    class MyCancelCallback implements AMap.CancelableCallback {
        LatLng targetLatlng;

        public void setTargetLatlng(LatLng latlng) {
            this.targetLatlng = latlng;
        }

        @Override
        public void onFinish() {
            if (locationMarker != null && targetLatlng != null) {
                locationMarker.setPosition(targetLatlng);
            }
        }

        @Override
        public void onCancel() {
            if (locationMarker != null && targetLatlng != null) {
                locationMarker.setPosition(targetLatlng);
            }
        }
    }


    /**
     * 方法必须重写
     */
    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    /**
     * 方法必须重写
     */
    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }

    /**
     * 方法必须重写
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

    /**
     * 方法必须重写
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
        AppManager.getAppManager().finishActivity(this); //从栈中移除
    }

    @Override
    public void onTouch(MotionEvent motionEvent) {

    }
    protected void showLoadingDialog() {
        if (mLoadingDialog != null)
            mLoadingDialog.show();
    }

    protected void showLoadingDialog(String str) {
        if (mLoadingDialog != null) {
            TextView tv = (TextView) mLoadingDialog.findViewById(R.id.tv_load_dialog);
            tv.setText(str);
            mLoadingDialog.show();
        }
    }

    protected void hideLoadingDialog() {
        if (mLoadingDialog != null && mLoadingDialog.isShowing()) {
            mLoadingDialog.dismiss();
        }
    }

}
