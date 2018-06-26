package customer.tcrj.com.myproject;


import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.tsy.sdk.myokhttp.MyOkHttp;
import com.tsy.sdk.myokhttp.response.GsonResponseHandler;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import customer.tcrj.com.myproject.Utils.ACache;
import customer.tcrj.com.myproject.Utils.Utils;
import customer.tcrj.com.myproject.adpater.scbzListAdapter;
import customer.tcrj.com.myproject.adpater.xzspListAdapter;
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.bean.scbzInfo;
import customer.tcrj.com.myproject.bean.xzspInfo;
import customer.tcrj.com.myproject.net.ApiConstants;
import customer.tcrj.com.myproject.widget.CustomLoadMoreView;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.PtrHandler;

public class xzspListActivity extends BaseActivity implements BaseQuickAdapter.OnItemClickListener {

    @BindView(R.id.txtTitle)
    public TextView title_tv;
    @BindView(R.id.recycler_view)
    public RecyclerView mRecyclerView;
    @BindView(R.id.mPtrFrameLayout)
    public PtrFrameLayout mPtrFrameLayout;
    @BindView(R.id.edt_search_result)
    EditText edtsearch;

    @BindView(R.id.layout_search_result)
    LinearLayout layout_search_result;

    @BindView(R.id.btnback)
    ImageView btnback;

    private MyOkHttp mMyOkhttp;
    private xzspListAdapter detailAdapter;
    private List<xzspInfo.DataBean> beanList;

    private int pageNum = 1;
    private boolean canPull = true;


    private String key;


    @Override
    protected int setLayout() {
        return R.layout.activity_xzsp_list;
    }

    @Override
    protected void setView() {
        key = ACache.get(this).getAsString("Key");
        title_tv.setText(getResources().getString(R.string.xzxkname));
        btnback.setOnClickListener(this);
        layout_search_result.setOnClickListener(this);
        edtsearch.setHint("请输入受理编号 / 行政许可决定文书号");
        mMyOkhttp = MyApp.getInstance().getMyOkHttp();
        mPtrFrameLayout.disableWhenHorizontalMove(true);
        mPtrFrameLayout.setPtrHandler(new PtrHandler() {
            @Override
            public boolean checkCanDoRefresh(PtrFrameLayout frame, View content, View header) {

                if(!canPull){
                    return false;
                }
                return PtrDefaultHandler.checkContentCanBePulledDown(frame, mRecyclerView, header);
            }

            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                pageNum = 1;
                getType();

            }
        });
        beanList = new ArrayList<>();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(detailAdapter = new xzspListAdapter(beanList, this));
        detailAdapter.setEnableLoadMore(true);
        detailAdapter.setPreLoadNumber(1);
        detailAdapter.setLoadMoreView(new CustomLoadMoreView());
        detailAdapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
        detailAdapter.setOnItemClickListener(this);
        detailAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
            @Override
            public void onLoadMoreRequested() {
                Log.e("TAG","点击重新加载数据");

               getType();

            }
        }, mRecyclerView);

    }

    private void getType() {
        getData(pageNum,string,string,null);
//        if(getDataType == 0){
//
//        }else if(getDataType == 1){
//            getData(pageNum,null,string,null);
//        }else if(getDataType == 2){
//            getData(pageNum,null,null,string);
//        }else if(getDataType == 3){
//            getData(pageNum,null,null,null);
//        }
    }


    //错误页面的点击回调，重新加载数据
    @Override
    public void onRetry() {
        getType();
    }


    @Override
    protected void setData() {
        getType();

    }


    //获取网络数据
    private void getData(final int num,String qyname,String xycode,String zzjgcode) {


        Log.e("TAG","key："+key);
        mMyOkhttp.post()
                .url(ApiConstants.xzsplistApi+key)
//                .addParam("SLDH",qyname == null? "":qyname)
//                .addParam("XZXKJDWSH",xycode == null? "":xycode)
                .addParam("OrParam",qyname == null? "":qyname)

//                .addParam("ZT",zzjgcode)
                .addParam("pageSize","10")
                .addParam("pageIndex",num+"")
                .tag(this)
                .enqueue(new GsonResponseHandler<xzspInfo>() {
                    @Override
                    public void onFailure(int statusCode, String error_msg) {
                        Log.e("TAG","失败："+error_msg);
//                        Toast.makeText(qyListActivity.this, error_msg, Toast.LENGTH_SHORT).show();

                        if(num > 1){
                            loadMoreData(null,true);
                        }else{
                            loadData(null,true);

                        }
                    }

                    @Override
                    public void onSuccess(int statusCode, xzspInfo response) {
//                        Toast.makeText(qyListActivity.this, response.toString(), Toast.LENGTH_SHORT).show();

                        Log.e("TAG","response："+response.getStat()+"num:"+num);

                        if(response.getStat() == null){

                            if(num > 1){//上拉加载
                                loadMoreData(response,false);
                            }else{//下拉刷新
                                loadData(response.getData(),false);
                            }

                        }else{

                            if(response.getStat().equals("101")){
                                Utils.toLogin(xzspListActivity.this);
                            }
                        }



                    }
                });



    }

    //上拉加载更多数据
    private void loadMoreData(xzspInfo response,boolean isError) {

        if (response == null) {
            if(isError){

                detailAdapter.loadMoreFail();
                Toast.makeText(xzspListActivity.this, getResources().getString(R.string.data_failed), Toast.LENGTH_SHORT).show();
            }else{
                detailAdapter.loadMoreFail();
            }

        } else {

            if(pageNum > response.getTotalPageCount()){//没有更多数据
                detailAdapter.loadMoreFail();
                Toast.makeText(xzspListActivity.this, getResources().getString(R.string.data_nomore), Toast.LENGTH_SHORT).show();
            }else{
                pageNum++;
                detailAdapter.addData(response.getData());
                detailAdapter.loadMoreComplete();
            }

        }




    }

    //下拉刷新
    private void loadData(List<xzspInfo.DataBean> response,boolean isError) {

        if (response == null  || response.size() <= 0) {
            if(mPtrFrameLayout != null){
                mPtrFrameLayout.refreshComplete();
            }
            if(isError){
//                Toast.makeText(xzspListActivity.this, getResources().getString(R.string.data_failed), Toast.LENGTH_SHORT).show();
                showFaild();
            }else{
                showEmptyView();
            }
            canPull = false;

        } else {
            onclicresponse = response;

            canPull = true;
            pageNum++;
            detailAdapter.setNewData(response);
            mPtrFrameLayout.refreshComplete();
            showSuccess();
            disableLoadMoreIfNotFullPage(mRecyclerView,response.size());
        }
    }



    //搜索框内容
    private String string;
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.layout_search_result:
                string = edtsearch.getText().toString();
                if(string.equals("")){
                    Toast.makeText(this, "请输入要查询的内容", Toast.LENGTH_SHORT).show();
                }else{
                    pageNum = 1;
                    getType();
                }

                break;


            case R.id.btnback:
                finish();
                break;

        }
    }


    List<xzspInfo.DataBean> onclicresponse;
    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

        if(onclicresponse != null){
            xzspInfo.DataBean dataBean1 = onclicresponse.get(position);
            Bundle bundle = new Bundle();
            bundle.putSerializable("xzspinfo",dataBean1);
            toClass(this,xzspListInfoActivity.class,bundle);
        }

    }

    public void disableLoadMoreIfNotFullPage(RecyclerView recyclerView, final int size) {
        detailAdapter.setEnableLoadMore(false);
        if (recyclerView == null) return;
        RecyclerView.LayoutManager manager = recyclerView.getLayoutManager();
        if (manager == null) return;
        if (manager instanceof LinearLayoutManager) {
            final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) manager;
            recyclerView.postDelayed(new Runnable() {
                @Override
                public void run() {

                    //要等到列表显示出来才可以去获取：findLastCompletelyVisibleItemPosition
                    if ((linearLayoutManager.findLastCompletelyVisibleItemPosition() + 1) != size) {
                        detailAdapter.setEnableLoadMore(true);
                    }else if ((linearLayoutManager.findLastCompletelyVisibleItemPosition()) == -1){
                        detailAdapter.setEnableLoadMore(true);
                    }

                    Log.e("TAG","测试："+(linearLayoutManager.findLastCompletelyVisibleItemPosition() + 1));
                }
            }, 1000);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMyOkhttp.cancel(this);
    }
}
