package customer.tcrj.com.myproject.message;

import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import customer.tcrj.com.myproject.adpater.FreshNewsAdapter;
import customer.tcrj.com.myproject.adpater.QyListAdapter;
import customer.tcrj.com.myproject.base.BaseFragment;
import customer.tcrj.com.myproject.bean.Book;
import customer.tcrj.com.myproject.bean.qyListInfo;
import customer.tcrj.com.myproject.bean.tzInfo;
import customer.tcrj.com.myproject.first.qyListActivity;
import customer.tcrj.com.myproject.jpush.PushMessageActivity;
import customer.tcrj.com.myproject.net.ApiConstants;
import customer.tcrj.com.myproject.tsListActivity;
import customer.tcrj.com.myproject.widget.CustomLoadMoreView;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.PtrHandler;


/**
 * Created by leict on 2018/3/22.
 */

public class MessageFragment extends BaseFragment implements FreshNewsAdapter.OnItemClickListener {


    @BindView(R.id.btnback)
    public ImageView btnback;

    @BindView(R.id.txtTitle)
    public TextView title_tv;
    @BindView(R.id.recycler_view)
    public RecyclerView mRecyclerView;
    @BindView(R.id.mPtrFrameLayout)
    PtrFrameLayout mPtrFrameLayout;

    private MyOkHttp mMyOkhttp;
    private FreshNewsAdapter detailAdapter;
    private List<tzInfo.DataBean> beanList;

    private int pageNum = 1;
    private boolean canPull = true;

    @Override
    protected int setLayout() {
        return R.layout.message_fragment;
    }

    @Override
    protected void setView() {
        mMyOkhttp = MyApp.getInstance().getMyOkHttp();

        title_tv.setText("消息");
        btnback.setVisibility(View.GONE);

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
                 getData(pageNum);

            }
        });
        beanList = new ArrayList<>();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mRecyclerView.setAdapter(detailAdapter = new FreshNewsAdapter(beanList, mContext));
        detailAdapter.setPreLoadNumber(1);
        detailAdapter.setLoadMoreView(new CustomLoadMoreView());
        detailAdapter.setEnableLoadMore(true);
        detailAdapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
        detailAdapter.setOnItemRlClickListener(this);
        detailAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
            @Override
            public void onLoadMoreRequested() {
                Log.e("TAG","点击重新加载数据");
                getData(pageNum);
            }
        }, mRecyclerView);

    }

    //错误页面的点击回调，重新加载数据
    @Override
    public void onRetry() {
        getData(pageNum);
    }

    @Override
    protected void setData() {
       getData(pageNum);
    }


    //获取网络数据
    private void getData(final int num) {
        mMyOkhttp.post()
                .url(ApiConstants.tzlistApi)
                .addParam("pageSize","20")
                .addParam("pageIndex",num+"")
                .enqueue(new GsonResponseHandler<tzInfo>() {
                    @Override
                    public void onFailure(int statusCode, String error_msg) {

                        Toast.makeText(mContext, error_msg, Toast.LENGTH_SHORT).show();

                        if(num > 1){
                            loadMoreData(null,true);
                        }else{
                            loadData(null,true);

                        }
                    }

                    @Override
                    public void onSuccess(int statusCode, tzInfo response) {
//                        Toast.makeText(mContext, response.toString(), Toast.LENGTH_SHORT).show();
                        if(num > 1){//上拉加载
                            loadMoreData(response,false);
                        }else{//下拉刷新
                            loadData(response.getData(),false);
                        }



                    }
                });

    }

    //上拉加载更多数据
    private void loadMoreData(tzInfo response,boolean isError) {

        if (response == null) {
            if(isError){

                detailAdapter.loadMoreFail();
                Toast.makeText(mContext, getResources().getString(R.string.data_failed), Toast.LENGTH_SHORT).show();
            }else{
                detailAdapter.loadMoreFail();
            }

        } else {

            if(pageNum > response.getTotalPageCount()){//没有更多数据
                detailAdapter.loadMoreFail();
                Toast.makeText(mContext, getResources().getString(R.string.data_nomore), Toast.LENGTH_SHORT).show();
            }else{
                pageNum++;
                detailAdapter.addData(response.getData());
                detailAdapter.loadMoreComplete();
            }

        }

    }

    List<tzInfo.DataBean> data = null;
    //下拉刷新
    private void loadData(List<tzInfo.DataBean> response,boolean isError) {
//        Log.e("TAG","loda"+response.size());
        Log.e("TAG","response :"+response);
        if (response == null || response.size() == 0) {
            Log.e("TAG","response == null");
            if(isError){
                showFaild();
            }else{
                Log.e("TAG","response == null kong");
                showEmptyView();
            }
            canPull = false;

        } else {
            Log.e("TAG","response != null");
            data = response;
            canPull = true;
            pageNum++;
            detailAdapter.setNewData(response);
            mPtrFrameLayout.refreshComplete();
            showSuccess();
            disableLoadMoreIfNotFullPage(mRecyclerView,response.size());
        }
    }


    @Override
    public void OnItemClick(tzInfo.DataBean item) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("ztinfo",item);
        toClass(mContext, PushMessageActivity.class,bundle);
    }

    public void disableLoadMoreIfNotFullPage(RecyclerView recyclerView, final int size) {
        detailAdapter.setEnableLoadMore(false);
        if (recyclerView == null) return;
        RecyclerView.LayoutManager manager = recyclerView.getLayoutManager();
        if (manager == null) return;
        if (manager instanceof LinearLayoutManager) {
            final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) manager;
            Log.e("TAG","ishidden"+ishidden);
                recyclerView.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        //要等到列表显示出来才可以去获取：findLastCompletelyVisibleItemPosition
                        if ((linearLayoutManager.findLastCompletelyVisibleItemPosition() + 1) != size) {
                            detailAdapter.setEnableLoadMore(true);
                        }

                        Log.e("TAG","测试："+(linearLayoutManager.findLastCompletelyVisibleItemPosition() + 1));
                    }
                }, 1000);


        }
    }


    private boolean ishidden;
    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        Log.e("TAG","hidden"+hidden);

        if(!hidden){
            Log.e("TAG","刷新消息");
            getData(1);
        }

        ishidden = hidden;
//        if(data != null && !hidden){
//            disableLoadMoreIfNotFullPage(mRecyclerView,data.size());
//        }

    }


}
