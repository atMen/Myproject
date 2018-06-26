package customer.tcrj.com.myproject.first;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.tsy.sdk.myokhttp.MyOkHttp;
import com.tsy.sdk.myokhttp.response.GsonResponseHandler;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import customer.tcrj.com.myproject.BaiduMapActivity;
import customer.tcrj.com.myproject.MyApp;
import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.Utils.ACache;
import customer.tcrj.com.myproject.adpater.MainMenuAdapter;
import customer.tcrj.com.myproject.adpater.MainMenuListAdapter;
import customer.tcrj.com.myproject.base.BaseFragment;
import customer.tcrj.com.myproject.bean.MenuEntity;
import customer.tcrj.com.myproject.bean.tzInfo;
import customer.tcrj.com.myproject.flfgListActivity;
import customer.tcrj.com.myproject.jpush.PushMessageActivity;
import customer.tcrj.com.myproject.message.pushMessageActivity;
import customer.tcrj.com.myproject.net.ApiConstants;
import customer.tcrj.com.myproject.qycxListActivity;
import customer.tcrj.com.myproject.tsListActivity;
import customer.tcrj.com.myproject.widget.MyGridView;
import customer.tcrj.com.myproject.widget.MyListView;
import customer.tcrj.com.myproject.xzspListActivity;
import customer.tcrj.com.myproject.xzzfListActivity;

import static customer.tcrj.com.myproject.R.id.content;


/**
 * Created by leict on 2018/3/22.
 */

public class FirstFragment extends BaseFragment implements AdapterView.OnItemClickListener, View.OnClickListener {


    @BindView(R.id.btnback)
    public ImageView btnback;

    @BindView(R.id.txtTitle)
    public TextView txtTitle;

    @BindView(R.id.more)
    TextView more;

    @BindView(R.id.noData)
    TextView noData;

    @BindView(R.id.listview_my)
    MyListView listview_my;

    @BindView(R.id.grid_sign)
    public MyGridView myGridView;

    MainMenuAdapter adapter1;
    MainMenuListAdapter adapterlist;
    private MyOkHttp mMyOkhttp;
    private String key;

    @Override
    protected int setLayout() {
        return R.layout.first_fragment;
    }

    @Override
    protected void setView() {
        mMyOkhttp = MyApp.getInstance().getMyOkHttp();
        key = ACache.get(mContext).getAsString("Key");
        txtTitle.setText("首页");
        btnback.setVisibility(View.GONE);
        more.setOnClickListener(this);

    }

    @Override
    protected void setData() {
        getDataFromNet();
        CharSequence[] sign = this.getResources().getStringArray(R.array.firdt_btn_name);
        TypedArray imagesign = this.getResources().obtainTypedArray(R.array.image_menu_sign);
        List<MenuEntity> dataList = new ArrayList<>();
        adapter1 = new MainMenuAdapter(mContext);

        for (int i = 0; i < sign.length; i++) {
            MenuEntity quick = new MenuEntity();
            quick.setMenuId(i);
            quick.setImageId(imagesign.getResourceId(i, 0));
            quick.setMenuName(sign[i].toString());
            dataList.add(quick);
        }

        adapter1.setData(dataList);
        myGridView.setAdapter(adapter1);
        myGridView.setOnItemClickListener(this);
        listview_my.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tzInfo.DataBean dataBean = content.get(position);
                Bundle bundle = new Bundle();
                bundle.putSerializable("ztinfo",dataBean);
                toClass(mContext, PushMessageActivity.class,bundle);
            }
        });

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.e("TAG","position:"+position);
        switch (position){
            case 0:
                toClass(mContext,QyInfoActivity.class);//企业基本信息
                break;
            case 1:
                toClass(mContext,qycxListActivity.class);//企业诚信
                break;
            case 2:
                toClass(mContext,xzspListActivity.class);//行政审批
                break;
            case 3:
                toClass(mContext,tsListActivity.class);//投诉
                break;
            case 4:
                toClass(mContext,djListActivity.class);//党建信息
                break;
            case 5:
                toClass(mContext,flfgListActivity.class);//法律法规
                break;
            case 6:
                toClass(mContext,xzzfListActivity.class);//行政执法
                break;
            case 7:
                toClass(mContext,BaiduMapActivity.class);//地图位置
                break;
        }
    }

    List<tzInfo.DataBean> content;
    public void getDataFromNet() {

        showLoadingDialog("加载中..");
        mMyOkhttp.post()
                .url(ApiConstants.tzlistApi+key)
                .addParam("pageSize","3")
                .addParam("pageIndex","1")
                .enqueue(new GsonResponseHandler<tzInfo>() {
                    @Override
                    public void onFailure(int statusCode, String error_msg) {
                        Log.e("TAG","失败");
                        hideLoadingDialog();
//                      Toast.makeText(mContext, "服务器连接错误", Toast.LENGTH_SHORT).show();
                        listview_my.setVisibility(View.GONE);
                        noData.setVisibility(View.VISIBLE);
                    }

                    @Override
                    public void onSuccess(int statusCode, tzInfo response) {
                        Log.e("TAG","info:"+response.toString());
                        hideLoadingDialog();
                        content = response.getData();
                        if(content != null && content.size() > 0){
                            listview_my.setVisibility(View.VISIBLE);
                            noData.setVisibility(View.GONE);
                            adapterlist = new MainMenuListAdapter(mContext);
                            adapterlist.setData(response);
                            listview_my.setAdapter(adapterlist);
                        }else{
                            listview_my.setVisibility(View.GONE);
                            noData.setVisibility(View.VISIBLE);
                        }


                    }
                });
    }


    @Override
    public void onClick(View v) {
        Intent pushIntent = new Intent();
        pushIntent.setClass(mContext, pushMessageActivity.class);
        pushIntent.putExtra("fromPush", true);
        mContext.startActivity(pushIntent);
    }
}
