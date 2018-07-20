package customer.tcrj.com.myproject;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.InfoWindow;
import com.baidu.mapapi.map.MapPoi;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapStatusUpdate;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.Marker;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.model.LatLng;
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
import customer.tcrj.com.myproject.map.BaiduMapUtil;
import customer.tcrj.com.myproject.net.ApiConstants;

public class BaiduMapActivity extends AppCompatActivity implements View.OnClickListener,
        BaiduMap.OnMapLoadedCallback, BaiduMap.OnMarkerClickListener, BaiduMap.OnMapClickListener {

    private MapView mapView;
    BaiduMap mBaiduMap;
    private boolean isFrist;
    private TextView nameTV;
    private TextView addrTV;


    private TextView txtTitle;
    private EditText edt_search_result;
    private LinearLayout layout_search_result;
    private ImageView btnback;
    protected Dialog mLoadingDialog = null;
    private MyOkHttp mMyOkhttp;
    private String key;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baidu_map);
        showLoadingDialog();
        initview();
        initMapview();//设置地图中心位置
        AppManager.getAppManager().addActivity(this);
        key = ACache.get(this).getAsString("Key");
        mMyOkhttp = MyApp.getInstance().getMyOkHttp();
        mLoadingDialog = DialogHelper.getLoadingDialog(this);

        mBaiduMap.setOnMarkerClickListener(this);
        mBaiduMap.setOnMapClickListener(this);


    }


    private void initMapview(){
        LatLng cenpt = new LatLng(34.349445,108.946142); //设定中心点坐标

        MapStatus mMapStatus = new MapStatus.Builder()//定义地图状态
                .target(cenpt)
                .zoom(8.0f)
                .build();  //定义MapStatusUpdate对象，以便描述地图状态将要发生的变化
        MapStatusUpdate mMapStatusUpdate = MapStatusUpdateFactory.newMapStatus(mMapStatus);
        mBaiduMap.setMapStatus(mMapStatusUpdate);//改变地图状态
    }




    @Override
    public void onMapLoaded() {
        hideLoadingDialog();
        Log.e("ATG","onMapLoaded");

    }

    private void initview() {
        btnback = (ImageView)findViewById(R.id.btnback);
        layout_search_result = (LinearLayout)findViewById(R.id.layout_search_result);
        edt_search_result = (EditText)findViewById(R.id.edt_search_result);
        mapView = (MapView) findViewById(R.id.mapview);
        mBaiduMap = mapView.getMap();

        txtTitle = (TextView)findViewById(R.id.txtTitle);

        btnback.setOnClickListener(this);
        layout_search_result.setOnClickListener(this);
        mBaiduMap.setOnMapLoadedCallback(this);

        txtTitle.setText("企业位置信息");
        edt_search_result.setHint("请输入企业名称/组织机构代码");
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



    private void showMark(final List<qyListInfo.DataBean> list) {
        clearOverlay(null);

        if(list.size() > 0){
            for (qyListInfo.DataBean latLng : list) {

                mBaiduMap.addOverlay(new BaiduMapUtil().setMarker(latLng));
            }

            if (isFrist) {
                mBaiduMap.setOnMapLoadedCallback(new BaiduMap.OnMapLoadedCallback() {

                    @Override
                    public void onMapLoaded() {
                        isFrist=false;
                        mBaiduMap.animateMapStatus(new BaiduMapUtil().setLatLngBounds(list, mapView));
                    }
                });
            }else{
                mBaiduMap.animateMapStatus(new BaiduMapUtil().setLatLngBounds(list, mapView));
            }
        }else {
            Toast.makeText(this, "未发现相关信息", Toast.LENGTH_SHORT).show();
        }


    }
    /**
     * 清除所有Overlay
     *
     * @param view
     */
    public void clearOverlay(View view) {
        mBaiduMap.clear();
    }

    /**
     * 重新添加Overlay
     *
     * @param view
     */
    public void resetOverlay(View view) {
        clearOverlay(null);
//        initOverlay();
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

    @Override
    public boolean onMarkerClick(Marker marker) {
        curShowWindowMarker = marker;

        LatLng position = marker.getPosition();
        Bundle extraInfo = marker.getExtraInfo();
        String title = extraInfo.getString("title");
        String address = extraInfo.getString("address");

        View view = LayoutInflater.from(this).inflate(R.layout.view_infowindow, null);
        nameTV = (TextView) view.findViewById(R.id.name);
        addrTV = (TextView) view.findViewById(R.id.addr);

        nameTV.setText(title);
        addrTV.setText(address);



//        Log.e("TAG","title:"+title+"address:"+address);
//        Button button = new Button(getApplicationContext());
//        button.setBackgroundResource(R.drawable.popup);
        //创建InfoWindow , 传入 view， 地理坐标， y 轴偏移量
        InfoWindow mInfoWindow = new InfoWindow(view, position, -210);

        //显示InfoWindow
        mBaiduMap.showInfoWindow(mInfoWindow);
        return false;
    }


    private Marker curShowWindowMarker;



    @Override
    public boolean onMapPoiClick(MapPoi mapPoi) {
        return false;
    }

    @Override
    public void onMapClick(LatLng latLng) {
        //点击其它地方隐藏infoWindow
        if(curShowWindowMarker!=null){
            mBaiduMap.hideInfoWindow();
        }
    }



}
