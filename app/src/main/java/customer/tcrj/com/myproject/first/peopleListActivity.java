package customer.tcrj.com.myproject.first;


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
import customer.tcrj.com.myproject.MyApp;
import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.Utils.ACache;
import customer.tcrj.com.myproject.Utils.Utils;
import customer.tcrj.com.myproject.adpater.QyListAdapter;
import customer.tcrj.com.myproject.adpater.grListAdapter;
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.bean.peopleInfo;
import customer.tcrj.com.myproject.bean.qyListInfo;
import customer.tcrj.com.myproject.net.ApiConstants;
import customer.tcrj.com.myproject.widget.CustomLoadMoreView;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.PtrHandler;

public class peopleListActivity extends BaseActivity implements BaseQuickAdapter.OnItemClickListener {

    @BindView(R.id.txtTitle)
    public TextView title_tv;
    @BindView(R.id.recycler_view)
    public RecyclerView mRecyclerView;
    @BindView(R.id.mPtrFrameLayout)
    public PtrFrameLayout mPtrFrameLayout;
    @BindView(R.id.edt_search_result)
    EditText edtsearch;
    @BindView(R.id.tv_currentstatenumber)
    TextView tv_currentstatenumber;
    @BindView(R.id.layout_search_result)
    LinearLayout layout_search_result;

    @BindView(R.id.btnback)
    ImageView btnback;


    private MyOkHttp mMyOkhttp;
    private grListAdapter detailAdapter;
    private List<peopleInfo.DataBean> beanList;

    private int pageNum = 1;
    private boolean canPull = true;

    private int getDataType = 3;

    private String key;


    @Override
    protected int setLayout() {
        return R.layout.activity_xzsp_list;
    }

    @Override
    protected void setView() {
        key = ACache.get(this).getAsString("Key");
        title_tv.setText(getResources().getString(R.string.grinfo));
        edtsearch.setHint("请输入姓名/证件号");
        tv_currentstatenumber.setOnClickListener(this);
        layout_search_result.setOnClickListener(this);
        btnback.setOnClickListener(this);
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
                getData(pageNum,string);

            }
        });
        beanList = new ArrayList<>();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(detailAdapter = new grListAdapter(beanList, this));
        detailAdapter.setEnableLoadMore(true);
        detailAdapter.setPreLoadNumber(1);
        detailAdapter.setLoadMoreView(new CustomLoadMoreView());
        detailAdapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
        detailAdapter.setOnItemClickListener(this);
        detailAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
            @Override
            public void onLoadMoreRequested() {
                Log.e("TAG","点击重新加载数据");

                getData(pageNum,string);


            }
        }, mRecyclerView);

    }


    //错误页面的点击回调，重新加载数据
    @Override
    public void onRetry() {
        getData(pageNum,string);
    }


    @Override
    protected void setData() {
        getData(pageNum,string);

    }


    //获取网络数据
    private void getData(final int num,String qyname) {


        Log.e("TAG","qyname："+qyname+"xycode："+qyname);
        mMyOkhttp.post()
                .url(ApiConstants.grlistApi+key)
//                .addParam("ZJH",qyname == null? "":qyname)
//                .addParam("XM",qyname == null? "":qyname)
                .addParam("OrParam",qyname == null? "":qyname)

                .addParam("pageSize","10")
                .addParam("pageIndex",num+"")
                .tag(this)
                .enqueue(new GsonResponseHandler<peopleInfo>() {
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
                    public void onSuccess(int statusCode, peopleInfo response) {
//                        Toast.makeText(qyListActivity.this, response.toString(), Toast.LENGTH_SHORT).show();

                        Log.e("TAG","response："+response.getStat());

                        if(response.getStat() == null){

                            if(num > 1){//上拉加载
                                loadMoreData(response,false);
                            }else{//下拉刷新
                                loadData(response.getData(),false);
                            }

                        }else{

                            if(response.getStat().equals("101")){
                                Utils.toLogin(peopleListActivity.this);
                            }
                        }



                    }
                });



    }

    //上拉加载更多数据
    private void loadMoreData(peopleInfo response,boolean isError) {

        if (response == null) {
            if(isError){

                detailAdapter.loadMoreFail();
                Toast.makeText(peopleListActivity.this, getResources().getString(R.string.data_failed), Toast.LENGTH_SHORT).show();
            }else{
                detailAdapter.loadMoreFail();
            }

        } else {

            if(pageNum > response.getTotalPageCount()){//没有更多数据
                detailAdapter.loadMoreFail();
                Toast.makeText(peopleListActivity.this, getResources().getString(R.string.data_nomore), Toast.LENGTH_SHORT).show();
            }else{
                pageNum++;
                detailAdapter.addData(response.getData());
                detailAdapter.loadMoreComplete();
            }

        }




    }

    //下拉刷新
    private void loadData(List<peopleInfo.DataBean> response,boolean isError) {

        if (response == null  || response.size() <= 0) {
            if(mPtrFrameLayout != null){
                mPtrFrameLayout.refreshComplete();
            }
            if(isError){
//                Toast.makeText(peopleListActivity.this, getResources().getString(R.string.data_failed), Toast.LENGTH_SHORT).show();
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

    private PopupWindow mPopTop;
    private TextView tvPopuReport;
    private TextView tvPopuShare;
//    private TextView tvPopuMove;
//    private TextView tvPopuSeas;

    private int CurrentStateNumber = 0;



    //搜索框内容
    private String string;
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_currentstatenumber:
                //弹窗改变项目状态参数
                mPopTop.showAsDropDown(tv_currentstatenumber);
                break;
            case R.id.layout_search_result:
                string = edtsearch.getText().toString();
                if(string.equals("")){
                    Toast.makeText(this, "请输入要查询的内容", Toast.LENGTH_SHORT).show();
                }else{
                    pageNum = 1;
                    getDataType = CurrentStateNumber;
                    getData(pageNum,string);
                }

                break;

            case R.id.btnback:
                finish();
                break;
        }
    }


    List<peopleInfo.DataBean> onclicresponse;
    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

        if(onclicresponse != null){
            peopleInfo.DataBean dataBean1 = onclicresponse.get(position);
            Bundle bundle = new Bundle();
            bundle.putSerializable("grinfo",dataBean1);
            toClass(this,grListInfoActivity.class,bundle);
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
