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
import customer.tcrj.com.myproject.adpater.QyListAdapter;
import customer.tcrj.com.myproject.adpater.flfgListAdapter;
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.bean.flfgInfo;
import customer.tcrj.com.myproject.bean.qyListInfo;
import customer.tcrj.com.myproject.bean.sweetInfo;
import customer.tcrj.com.myproject.first.flfgListInfoActivity;
import customer.tcrj.com.myproject.first.qyListInfoActivity;
import customer.tcrj.com.myproject.first.scbzListActivity;
import customer.tcrj.com.myproject.first.zsListActivity;
import customer.tcrj.com.myproject.net.ApiConstants;
import customer.tcrj.com.myproject.widget.CustomLoadMoreView;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.PtrHandler;

public class flfgListActivity extends BaseActivity implements BaseQuickAdapter.OnItemClickListener {

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
    @BindView(R.id.rl)
    RelativeLayout rl;


    private MyOkHttp mMyOkhttp;
    private flfgListAdapter detailAdapter;
    private List<flfgInfo.DataBean> beanList;

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
        title_tv.setText(getResources().getString(R.string.flfgname));
        edtsearch.setHint("请输入法规标题");

        btnback.setOnClickListener(this);
        tv_currentstatenumber.setOnClickListener(this);
        layout_search_result.setOnClickListener(this);
        tv_currentstatenumber.setVisibility(View.VISIBLE);
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
        mRecyclerView.setAdapter(detailAdapter = new flfgListAdapter(beanList, this));
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
        getData(pageNum,string,CurrentStateNumber);

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
    private void getData(final int num,String qyname,String type) {

        Log.e("TAG","key："+key);
        mMyOkhttp.post()
                .url(ApiConstants.flfglistApi+key)
                .addParam("Status",type == null? "":type)
//                .addParam("MenuName",qyname == null? "":qyname)
                .addParam("Title",qyname == null? "":qyname)
//                .addParam("PublishMessage",qyname == null? "":qyname)
//                .addParam("OrParam",qyname == null? "":qyname)

                .addParam("pageSize","10")
                .addParam("pageIndex",num+"")
                .tag(this)
                .enqueue(new GsonResponseHandler<flfgInfo>() {
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
                    public void onSuccess(int statusCode, flfgInfo response) {
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
                                Utils.toLogin(flfgListActivity.this);
                            }
                        }



                    }
                });



    }

    //上拉加载更多数据
    private void loadMoreData(flfgInfo response,boolean isError) {

        if (response == null) {
            if(isError){

                detailAdapter.loadMoreFail();
                Toast.makeText(flfgListActivity.this, getResources().getString(R.string.data_failed), Toast.LENGTH_SHORT).show();
            }else{
                detailAdapter.loadMoreFail();
            }

        } else {

            if(pageNum > response.getTotalPageCount()){//没有更多数据
                detailAdapter.loadMoreFail();
                Toast.makeText(flfgListActivity.this, getResources().getString(R.string.data_nomore), Toast.LENGTH_SHORT).show();
            }else{
                pageNum++;
                detailAdapter.addData(response.getData());
                detailAdapter.loadMoreComplete();
            }

        }




    }

    //下拉刷新
    private void loadData(List<flfgInfo.DataBean> response,boolean isError) {

        if (response == null  || response.size() <= 0) {
            if(mPtrFrameLayout != null){
                mPtrFrameLayout.refreshComplete();
            }
            if(isError){
//                Toast.makeText(flfgListActivity.this, getResources().getString(R.string.data_failed), Toast.LENGTH_SHORT).show();
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
    private TextView tvPopuMove;
//    private TextView tvPopuSeas;

    private String CurrentStateNumber = null;




    //搜索框内容
    private String string;
    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnback:
                finish();
                break;
            case R.id.tv_currentstatenumber:

                getSXDataFromNet();
                break;
            case R.id.layout_search_result:
                string = edtsearch.getText().toString();
                if(string.equals("")){
                    Toast.makeText(this, "请输入要查询的内容", Toast.LENGTH_SHORT).show();
                }else{
                    CurrentStateNumber = null;
                    pageNum = 1;
                    getType();
                }

                break;
        }
    }


    List<flfgInfo.DataBean> onclicresponse;
    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

        if(onclicresponse != null){
            flfgInfo.DataBean dataBean1 = onclicresponse.get(position);
            Bundle bundle = new Bundle();
            bundle.putSerializable("flfginfo",dataBean1);
            toClass(this,flfgListInfoActivity.class,bundle);
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

    private SweetSheet mSweetSheet;
    private void getSXDataFromNet() {
        mMyOkhttp.post()
                .url(ApiConstants.zdlistApi+key)
                .addParam("Path",".16.")
                .tag(this)
                .enqueue(new GsonResponseHandler<sweetInfo>() {
                    @Override
                    public void onFailure(int statusCode, String error_msg) {
                        Log.e("TAG","失败："+error_msg);
                        Toast.makeText(flfgListActivity.this, "获取数据失败", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onSuccess(int statusCode, sweetInfo response) {
//                      Toast.makeText(qyListActivity.this, response.toString(), Toast.LENGTH_SHORT).show();
                        if(response.getStat() == null){

                            Log.e("TAG","response：成功");
                            setupRecyclerView(response);


                        }else{

                            if(response.getStat().equals("101")){
                                Utils.toLogin(flfgListActivity.this);
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
                string = null;
                edtsearch.setText(null);
                getType();
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
