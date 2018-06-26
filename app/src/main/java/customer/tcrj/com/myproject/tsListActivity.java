package customer.tcrj.com.myproject;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.mingle.entity.MenuEntity;
import com.mingle.sweetpick.BlurEffect;
import com.mingle.sweetpick.RecyclerViewDelegate;
import com.mingle.sweetpick.SweetSheet;
import com.tsy.sdk.myokhttp.MyOkHttp;
import com.tsy.sdk.myokhttp.response.GsonResponseHandler;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import customer.tcrj.com.myproject.Utils.ACache;
import customer.tcrj.com.myproject.Utils.Utils;
import customer.tcrj.com.myproject.adpater.QjListAdapter;
import customer.tcrj.com.myproject.adpater.tsListAdapter;
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.bean.jlqjInfo;
import customer.tcrj.com.myproject.bean.sweetInfo;
import customer.tcrj.com.myproject.bean.tsjuInfo;
import customer.tcrj.com.myproject.first.qjListInfoActivity;
import customer.tcrj.com.myproject.net.ApiConstants;
import customer.tcrj.com.myproject.widget.CustomLoadMoreView;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.PtrHandler;

public class tsListActivity extends BaseActivity implements BaseQuickAdapter.OnItemClickListener {

    @BindView(R.id.txtTitle)
    public TextView title_tv;
    @BindView(R.id.recycler_view)
    public RecyclerView mRecyclerView;
    @BindView(R.id.mPtrFrameLayout)
    public PtrFrameLayout mPtrFrameLayout;

    @BindView(R.id.tv_currentstatenumber)
    TextView tv_currentstatenumber;

    @BindView(R.id.btnback)
    ImageView btnback;

    @BindView(R.id.rl)
    RelativeLayout rl;

    private MyOkHttp mMyOkhttp;
    private tsListAdapter detailAdapter;
    private List<tsjuInfo.DataBean> beanList;

    private int pageNum = 1;
    private boolean canPull = true;

    private int getDataType = 3;

    private String key;

    @Override
    protected int setLayout() {
        return R.layout.activity_ts_list;
    }

    @Override
    protected void setView() {
        key = ACache.get(this).getAsString("Key");
        title_tv.setText(getResources().getString(R.string.tstitlename));
        tv_currentstatenumber.setVisibility(View.VISIBLE);
        tv_currentstatenumber.setOnClickListener(this);
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
               getTypeData();

            }
        });
        beanList = new ArrayList<>();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(detailAdapter = new tsListAdapter(beanList, this));
        detailAdapter.setEnableLoadMore(true);
        detailAdapter.setPreLoadNumber(1);
        detailAdapter.setLoadMoreView(new CustomLoadMoreView());
        detailAdapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
        detailAdapter.setOnItemClickListener(this);
        detailAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
            @Override
            public void onLoadMoreRequested() {
                Log.e("TAG","点击重新加载数据");
                getTypeData();


            }
        }, mRecyclerView);

    }


    //错误页面的点击回调，重新加载数据
    @Override
    public void onRetry() {
        getTypeData();
    }


    @Override
    protected void setData() {
       getTypeData();
    }



    //获取网络数据
    private void getData(final int num,String type) {


        Log.e("TAG","key："+key);

        mMyOkhttp.post()
                .url(ApiConstants.tsjblistApi+key)
//                .addParam("JGMC",qyname == null? "":qyname)
//                .addParam("SCDW",qyname == null? "":qyname)
//                .addParam("SYDW",qyname == null? "":qyname)
                .addParam("TSLX",type == null? "":type)
                .addParam("pageSize","10")
                .addParam("pageIndex",num+"")
                .tag(this)
                .enqueue(new GsonResponseHandler<tsjuInfo>() {
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
                    public void onSuccess(int statusCode, tsjuInfo response) {
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
                                Utils.toLogin(tsListActivity.this);

                            }
                        }



                    }
                });



    }

    //上拉加载更多数据
    private void loadMoreData(tsjuInfo response,boolean isError) {

        if (response == null) {
            if(isError){

                detailAdapter.loadMoreFail();
                Toast.makeText(tsListActivity.this, getResources().getString(R.string.data_failed), Toast.LENGTH_SHORT).show();
            }else{
                detailAdapter.loadMoreFail();
            }

        } else {

            if(pageNum > response.getTotalPageCount()){//没有更多数据
                detailAdapter.loadMoreFail();
                Toast.makeText(tsListActivity.this, getResources().getString(R.string.data_nomore), Toast.LENGTH_SHORT).show();
            }else{
                pageNum++;
                detailAdapter.addData(response.getData());
                detailAdapter.loadMoreComplete();
            }

        }




    }

    //下拉刷新
    private void loadData(List<tsjuInfo.DataBean> response,boolean isError) {

        if (response == null  || response.size() <= 0) {
            if(mPtrFrameLayout != null){
                mPtrFrameLayout.refreshComplete();
            }
            if(isError){
//                Toast.makeText(tsListActivity.this, getResources().getString(R.string.data_failed), Toast.LENGTH_SHORT).show();
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


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnback:
                finish();
                break;

            case R.id.tv_currentstatenumber:

                getSXDataFromNet();
                break;
        }
    }


    List<tsjuInfo.DataBean>  onclicresponse = null;
    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

        if(onclicresponse != null){
            tsjuInfo.DataBean dataBean1 = onclicresponse.get(position);
//            Toast.makeText(this, dataBean1.getQYID(), Toast.LENGTH_SHORT).show();
            Bundle bundle = new Bundle();
            bundle.putSerializable("jlinfo",dataBean1);
            toClass(this,tsjbListInfoActivity.class,bundle);
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

    private void getTypeData() {
        getData(pageNum,CurrentStateNumber);
    }

    private String CurrentStateNumber = null;
    private SweetSheet mSweetSheet;
    private void getSXDataFromNet() {
        mMyOkhttp.post()
                .url(ApiConstants.zdlistApi+key)
                .addParam("Path",".6772.")
                .tag(this)
                .enqueue(new GsonResponseHandler<sweetInfo>() {
                    @Override
                    public void onFailure(int statusCode, String error_msg) {
                        Log.e("TAG","失败："+error_msg);
                        Toast.makeText(tsListActivity.this, "获取数据失败", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onSuccess(int statusCode, sweetInfo response) {
//                      Toast.makeText(qyListActivity.this, response.toString(), Toast.LENGTH_SHORT).show();
                        if(response.getStat() == null){

                            Log.e("TAG","response：成功");
                            setupRecyclerView(response);


                        }else{

                            if(response.getStat().equals("101")){
                                Utils.toLogin(tsListActivity.this);
                            }
                        }

                    }
                });
    }
    private void setupRecyclerView(sweetInfo response) {

        final List<MenuEntity> list = new ArrayList<>();

        List<sweetInfo.DataBean> data = response.getData();
        MenuEntity menuEntity1 = new MenuEntity();
        menuEntity1.titleColor = 0xff000000;
        menuEntity1.title = "全部";
        menuEntity1.dataCode = "";
        list.add(0,menuEntity1);
        for(int i = 0;i < data.size();i++){
            MenuEntity menuEntity = new MenuEntity();
            menuEntity.titleColor = 0xff000000;
            menuEntity.title = data.get(i).getName();
            menuEntity.dataCode = data.get(i).getDataCode();
            Log.e("TAG","测试：弹出来"+data.get(i).getName());
            list.add(menuEntity);
        }

        // SweetSheet 控件,根据 rl 确认位置
        mSweetSheet = new SweetSheet(rl);

        //设置数据源 (数据源支持设置 list 数组,也支持从菜单中获取)
        mSweetSheet.setMenuList(list);
        //根据设置不同的 Delegate 来显示不同的风格.
        mSweetSheet.setDelegate(new RecyclerViewDelegate(true));
        //根据设置不同Effect 来显示背景效果BlurEffect:模糊效果.DimEffect 变暗效果
        mSweetSheet.setBackgroundEffect(new BlurEffect(5));
        //设置点击事件
        mSweetSheet.setOnMenuItemClickListener(new SweetSheet.OnMenuItemClickListener() {
            @Override
            public boolean onItemClick(int position, MenuEntity menuEntity1) {
//                //即时改变当前项的颜色
//                list.get(position).titleColor = 0xff5823ff;
//                ((RecyclerViewDelegate) mSweetSheet.getDelegate()).notifyDataSetChanged();

                //根据返回值, true 会关闭 SweetSheet ,false 则不会.
//                Toast.makeText(qyListActivity.this, menuEntity1.title + "  " + position, Toast.LENGTH_SHORT).show();
                mSweetSheet.dismiss();
                Log.e("TAG","测试：弹出来"+menuEntity1.title);
                CurrentStateNumber = menuEntity1.dataCode;
                pageNum = 1;
                getTypeData();
                return false;
            }
        });
        mSweetSheet.show();

    }

    @Override
    public void onBackPressed() {

        if(mSweetSheet != null){
            if(mSweetSheet.isShow()){

                mSweetSheet.dismiss();
            }else{
                super.onBackPressed();
            }

        } else{
            super.onBackPressed();
        }
    }
}
