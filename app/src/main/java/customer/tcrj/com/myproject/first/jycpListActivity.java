package customer.tcrj.com.myproject.first;


import android.content.Intent;
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
import customer.tcrj.com.myproject.LxActivity;
import customer.tcrj.com.myproject.MyApp;
import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.Utils.ACache;
import customer.tcrj.com.myproject.Utils.Utils;
import customer.tcrj.com.myproject.adpater.grListAdapter;
import customer.tcrj.com.myproject.adpater.jycpListAdapter;
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.bean.jycpInfo;
import customer.tcrj.com.myproject.bean.peopleInfo;
import customer.tcrj.com.myproject.net.ApiConstants;
import customer.tcrj.com.myproject.widget.CustomLoadMoreView;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.PtrHandler;

public class jycpListActivity extends BaseActivity implements BaseQuickAdapter.OnItemClickListener {

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
    private jycpListAdapter detailAdapter;
    private List<jycpInfo.DataBean> beanList;

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
        title_tv.setText(getResources().getString(R.string.jycpinfo));
        btnback.setOnClickListener(this);
        tv_currentstatenumber.setVisibility(View.VISIBLE);
        edtsearch.setHint("请输入产品名称 / 使用(生产)单位名称");
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
                getTypeData();

            }
        });
        beanList = new ArrayList<>();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(detailAdapter = new jycpListAdapter(beanList, this));
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
    private void getData(final int num,String qyname,String fl) {


        Log.e("TAG","qyname："+qyname);
        mMyOkhttp.post()
                .url(ApiConstants.jycplistApi+key)
                .addParam("FL",fl == null? "":fl)
//                .addParam("CPMC",qyname == null? "":qyname)
//                .addParam("SCDW",qyname == null? "":qyname)
//                .addParam("SYDW",qyname == null? "":qyname)
                .addParam("OrParam",qyname == null? "":qyname)

                .addParam("pageSize","10")
                .addParam("pageIndex",num+"")
                .tag(this)
                .enqueue(new GsonResponseHandler<jycpInfo>() {
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
                    public void onSuccess(int statusCode, jycpInfo response) {
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
                                Utils.toLogin(jycpListActivity.this);
                            }
                        }



                    }
                });



    }

    //上拉加载更多数据
    private void loadMoreData(jycpInfo response,boolean isError) {

        if (response == null) {
            if(isError){

                detailAdapter.loadMoreFail();
                Toast.makeText(jycpListActivity.this, getResources().getString(R.string.data_failed), Toast.LENGTH_SHORT).show();
            }else{
                detailAdapter.loadMoreFail();
            }

        } else {

            if(pageNum > response.getTotalPageCount()){//没有更多数据
                detailAdapter.loadMoreFail();
                Toast.makeText(jycpListActivity.this, getResources().getString(R.string.data_nomore), Toast.LENGTH_SHORT).show();
            }else{
                pageNum++;
                detailAdapter.addData(response.getData());
                detailAdapter.loadMoreComplete();
            }

        }




    }

    //下拉刷新
    private void loadData(List<jycpInfo.DataBean> response,boolean isError) {

        if (response == null  || response.size() <= 0) {
            if(mPtrFrameLayout != null){
                mPtrFrameLayout.refreshComplete();
            }
            if(isError){
//                Toast.makeText(jycpListActivity.this, getResources().getString(R.string.data_failed), Toast.LENGTH_SHORT).show();
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
//
//    private PopupWindow mPopTop;
//    private TextView tvPopuReport;
//    private TextView tvPopuShare;
//    private TextView tvPopuMove;
////    private TextView tvPopuSeas;
//
//    private int CurrentStateNumber = 0;

//    /**
//     * 弹出框样式设置
//     */
//    private void setPopuWindow() {
//        mPopTop = new PopupWindow(this);
//        int w = Utils.getWidth(this);
//        mPopTop.setWidth(w / 2);
//        mPopTop.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
//        mPopTop.setFocusable(true);//TODO 获取焦点
//        mPopTop.setTouchable(true);
//        mPopTop.setOutsideTouchable(true);//TODO 设置popupwindow外部可点击
//        ColorDrawable dw = new ColorDrawable(0000000000);// TODO 实例化一个ColorDrawable颜色为半透明
//        mPopTop.setBackgroundDrawable(dw);// TODO 点back键和其他地方使其消失,设置了这个才能触发OnDismisslistener ，设置其他控件变化等操作
////        mPopTop.setAnimationStyle(R.style.mystyle);//TODO 设置显示和消失动画
//        View conentView = Utils.getLayoutInflater(this).inflate(R.layout.item_popu_jycp, null);
//        setConentViewClickListener(conentView);
//        mPopTop.setContentView(conentView);
//    }
//
//    /**
//     * 事件
//     *
//     * @param v
//     */
//    private void setConentViewClickListener(View v) {
//        tvPopuReport = (TextView) v.findViewById(R.id.tv_popu_report);
//        tvPopuShare = (TextView) v.findViewById(R.id.tv_popu_share);
//        tvPopuMove = (TextView) v.findViewById(R.id.tv_popu_move);
////        tvPopuSeas = (TextView) v.findViewById(R.id.tv_popu_seas);
//
//        tvPopuReport.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mPopTop.dismiss();
//                tv_currentstatenumber.setText(getResources().getString(R.string.cpname));
//                CurrentStateNumber = 0;
//            }
//        });
//        tvPopuShare.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mPopTop.dismiss();
//                tv_currentstatenumber.setText(getResources().getString(R.string.scdw));
//                CurrentStateNumber = 1;
//            }
//        });
//        tvPopuMove.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mPopTop.dismiss();
//                tv_currentstatenumber.setText(getResources().getString(R.string.sydw));
//                CurrentStateNumber = 2;
//            }
//        });
////        tvPopuSeas.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                mPopTop.dismiss();
////                tv_currentstatenumber.setText(getResources().getString(R.string.all));
////                CurrentStateNumber = 3;
////            }
////        });
//    }

    //搜索框内容
    private String string;
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_currentstatenumber:
                Bundle bundle = new Bundle();
                bundle.putString("path",".36.");
                toClass(this,LxActivity.class,bundle,REQUEST_GET_TIME);
                break;
            case R.id.layout_search_result:
                string = edtsearch.getText().toString();
                if(string.equals("")){
                    Toast.makeText(this, "请输入要查询的内容", Toast.LENGTH_SHORT).show();
                }else{
                    type = null;
                    pageNum = 1;
                    getTypeData();
                }

                break;

            case R.id.btnback:
                finish();
                break;
        }
    }


    List<jycpInfo.DataBean> onclicresponse;
    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

        if(onclicresponse != null){
            jycpInfo.DataBean dataBean1 = onclicresponse.get(position);
            Bundle bundle = new Bundle();
            bundle.putSerializable("jycpinfo",dataBean1);
            toClass(this,jycpListInfoActivity.class,bundle);
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
    private int REQUEST_GET_TIME=0;
    private String type = null;
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_GET_TIME&&resultCode==RESULT_OK){
            String id = data.getStringExtra("id");
            String datacode = data.getStringExtra("datacode");
            Log.e("TAG","id:"+id+"  code:"+datacode);

            string = null;
            edtsearch.setText(null);
            if(!id.equals("-1")){
                Log.e("TAG","ssxx");
                type = id;
                pageNum = 1;
            }else{
                Log.e("TAG","qbxx");
                type = null;
                pageNum = 1;
            }

            getTypeData();
        }
    }

    private void getTypeData() {
            getData(pageNum,string,type);
    }
}
