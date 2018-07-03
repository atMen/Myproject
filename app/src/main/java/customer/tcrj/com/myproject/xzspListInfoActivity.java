package customer.tcrj.com.myproject;


import android.graphics.drawable.ColorDrawable;
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
import customer.tcrj.com.myproject.adpater.qycxListAdapter;
import customer.tcrj.com.myproject.adpater.xzsplcListAdapter;
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.bean.qycx;
import customer.tcrj.com.myproject.bean.shebeiInfo;
import customer.tcrj.com.myproject.bean.sweetInfo;
import customer.tcrj.com.myproject.bean.xzspInfo;
import customer.tcrj.com.myproject.bean.xzspLCInfo;
import customer.tcrj.com.myproject.net.ApiConstants;
import customer.tcrj.com.myproject.widget.CustomLoadMoreView;
import customer.tcrj.com.myproject.widget.SuperScrollView;
import in.srain.cube.views.ptr.PtrDefaultHandler;
import in.srain.cube.views.ptr.PtrFrameLayout;
import in.srain.cube.views.ptr.PtrHandler;

public class xzspListInfoActivity extends BaseActivity{

    @BindView(R.id.qy_texta)
    public TextView texta;
    @BindView(R.id.qy_textb)
    public TextView textb;
    @BindView(R.id.qy_textc)
    public TextView textc;
    @BindView(R.id.qy_textd)
    public TextView textd;
    @BindView(R.id.qy_texte)
    public TextView texte;
    @BindView(R.id.qy_textf)
    public TextView textf;
    @BindView(R.id.qy_textg)
    public TextView textg;
    @BindView(R.id.qy_texth)
    public TextView texth;
    @BindView(R.id.qy_texti)
    public TextView texti;
    @BindView(R.id.qy_textj)
    public TextView textj;
    @BindView(R.id.qy_textk)
    public TextView textk;
    @BindView(R.id.qy_textl)
    public TextView textl;
    @BindView(R.id.qy_textm)
    public TextView textm;
    @BindView(R.id.qy_textn)
    public TextView textn;
    @BindView(R.id.qy_texto)
    public TextView texto;
    @BindView(R.id.qy_textp)
    public TextView textp;
    @BindView(R.id.qy_textq)
    public TextView textq;
    @BindView(R.id.qy_textr)
    public TextView textr;
    @BindView(R.id.qy_texts)
    public TextView texts;
    @BindView(R.id.qy_textt)
    public TextView textt;
    @BindView(R.id.qy_textu)
    public TextView textu;
    @BindView(R.id.qy_textv)
    public TextView textv;
    @BindView(R.id.qy_textw)
    public TextView textw;
    @BindView(R.id.qy_textx)
    public TextView textx;
    @BindView(R.id.qy_texty)
    public TextView texty;
    @BindView(R.id.qy_textz)
    public TextView textz;
    @BindView(R.id.qy_text)
    public TextView text;

    @BindView(R.id.tv_one)
    public TextView tv_one;
    @BindView(R.id.tv_two)
    public TextView tv_two;
    @BindView(R.id.tv_three)
    public TextView tv_three;
    @BindView(R.id.recycler_view)
    public RecyclerView mRecyclerView;

    @BindView(R.id.ll_jbxx)
    LinearLayout include;
    @BindView(R.id.ll_lcjd)
    LinearLayout ll_lcjd;
    @BindView(R.id.scrollview)
    SuperScrollView scrollview;
    @BindView(R.id.btnback)
    ImageView btnback;


    @BindView(R.id.text_syqya)
    public TextView text_syqya;
    @BindView(R.id.text_syqyb)
    public TextView text_syqyb;
    @BindView(R.id.text_syqyc)
    public TextView text_syqyc;
    @BindView(R.id.text_syqyd)
    public TextView text_syqyd;

    @BindView(R.id.text_qya)
    public TextView text_qya;
    @BindView(R.id.text_qyb)
    public TextView text_qyb;
    @BindView(R.id.text_qyc)
    public TextView text_qyc;
    @BindView(R.id.text_qyd)
    public TextView text_qyd;

    @BindView(R.id.text_syra)
    public TextView text_syra;
    @BindView(R.id.text_syrb)
    public TextView text_syrb;
    @BindView(R.id.text_syrc)
    public TextView text_syrc;
    @BindView(R.id.text_syrd)
    public TextView text_syrd;

    @BindView(R.id.scinfo)
    TextView scinfo;
    @BindView(R.id.jdqy)
    TextView jdqy;
    @BindView(R.id.syr)
    TextView syr;
    @BindView(R.id.spxx)
    TextView spxx;

    @BindView(R.id.syqy)
    LinearLayout syqy;
    @BindView(R.id.scqy)
    LinearLayout scqy;
    @BindView(R.id.ll_syr)
    LinearLayout ll_syr;


    @BindView(R.id.tv_currentstatenumber)
    TextView tv_currentstatenumber;
    private MyOkHttp mMyOkhttp;
    private xzsplcListAdapter detailAdapter;
    private List<xzspLCInfo.DataBean> beanList;

    private String key;
    xzspInfo.DataBean xzspinfo;

    @Override
    protected int setLayout() {
        return R.layout.activity_xzspinfo_list;
    }

    @Override
    protected void setView() {

        xzspinfo = (xzspInfo.DataBean) getIntent().getSerializableExtra("xzspinfo");

        mMyOkhttp = MyApp.getInstance().getMyOkHttp();
        key = ACache.get(this).getAsString("Key");
        tv_one.setSelected(true);
        tv_one.setText("基本信息");
        tv_two.setText("流程节点");
        scinfo.setText("许可单位信息");
        jdqy.setText("申请单位信息");
        syr.setText("申请人信息");
        spxx.setText("审批信息 ");
        scqy.setVisibility(View.GONE);
        btnback.setOnClickListener(this);
        tv_currentstatenumber.setVisibility(View.GONE);
        tv_one.setOnClickListener(this);
        tv_two.setOnClickListener(this);
        tv_three.setOnClickListener(this);


        beanList = new ArrayList<>();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(detailAdapter = new xzsplcListAdapter(beanList, this));
        detailAdapter.setEnableLoadMore(false);


    }

    private void getType() {
        getSXDataFromNet(string);
    }


    //错误页面的点击回调，重新加载数据
    @Override
    public void onRetry() {
        getType();
    }


    @Override
    protected void setData() {
        setjbInfoData(xzspinfo);
        string = xzspinfo.getSPID()+"";
        Log.e("TAG","spid"+string);
        getType();

    }


    private String lx = "2";

    private void setjbInfoData(xzspInfo.DataBean dataBean1) {
        if(dataBean1 != null){

//            xzspInfo.DataBean.XKDWInfoBean xkdwInfo1 = dataBean1.getXKDWInfo();
//            if(xkdwInfo1.getQYMC() != null){
//                scqy.setVisibility(View.VISIBLE);
//                text_qya.setText("企业名称："+xkdwInfo1.getQYMC());
//                text_qyb.setText("统一社会信用代码："+xkdwInfo1.getTYSHXYDM());
//                text_qyc.setText("法人姓名: "+xkdwInfo1.getFDDBRXM());
//                text_qyd.setText("法人证件号码: "+xkdwInfo1.getFDDBRZJHM());
//            }else {
//                text_qya.setText("企业名称：");
//                text_qyb.setText("统一社会信用代码：");
//                text_qyc.setText("法人姓名: ");
//                text_qyd.setText("法人证件号码: ");
//            }


            xzspInfo.DataBean.SQDWInfoBean sqdwInfo1 = dataBean1.getSQDWInfo();
            if(sqdwInfo1.getQYMC() != null){
                syqy.setVisibility(View.VISIBLE);
                text_syqya.setText("企业名称: "+sqdwInfo1.getQYMC());
                text_syqyb.setText("统一社会信用代码: "+sqdwInfo1.getTYSHXYDM());
                text_syqyc.setText("法人姓名: "+sqdwInfo1.getFDDBRXM());
                text_syqyd.setText("法人证件号码: "+sqdwInfo1.getFDDBRZJHM());
            }else {
                text_syqya.setText("企业名称: ");
                text_syqyb.setText("统一社会信用代码: ");
                text_syqyc.setText("法人姓名: ");
                text_syqyd.setText("法人证件号码: ");
            }


            xzspInfo.DataBean.SQRInfoBean sqrInfo1 = dataBean1.getSQRInfo();
            if(sqrInfo1.getXM() != null){
                ll_syr.setVisibility(View.VISIBLE);
                text_syra.setText("姓名："+sqrInfo1.getXM());
                text_syrb.setText("性别："+sqrInfo1.getXB());
                text_syrc.setText("证件号："+sqrInfo1.getZJH());
                text_syrd.setText("手机号："+sqrInfo1.getSJH());
            }else {
                text_syra.setText("姓名：");
                text_syrb.setText("性别：");
                text_syrc.setText("证件号：");
                text_syrd.setText("手机号：");
            }


            texta.setText("受理单号："+dataBean1.getSLDH());
            textb.setText("事项编码："+dataBean1.getSXBM());
            textc.setText("事项名称："+dataBean1.getSXMC());
            textd.setVisibility(View.GONE);
            texte.setVisibility(View.GONE);
            textf.setText("受理时间："+dataBean1.getSLSJ());
            textg.setText("受理人："+dataBean1.getSLR());
            texth.setText("办结时间："+dataBean1.getBJSJ());
            texti.setText("申请方式："+dataBean1.getSQFS());
            textj.setText("行政许可决定文书号："+dataBean1.getXZXKJDWSH());
            textk.setText("项目名称："+dataBean1.getXMMC());
            textl.setVisibility(View.GONE);
            textm.setText("许可内容："+dataBean1.getXKNR());
            textn.setText("许可决定日期："+dataBean1.getXKJDRQ());
            texto.setText("许可截止日期："+dataBean1.getXKJZRQ());

            xzspInfo.DataBean.XKDWInfoBean xkdwInfo = dataBean1.getXKDWInfo();
            if(xkdwInfo != null){
                textp.setText("许可单位："+dataBean1.getXKDWInfo().getQYMC());
            }

            textq.setText("地方编码："+dataBean1.getDFBM());
            textr.setText(dataBean1.getBZ());
            texts.setVisibility(View.GONE);
            textt.setVisibility(View.GONE);
            textu.setVisibility(View.GONE);
            textv.setVisibility(View.GONE);
            textw.setVisibility(View.GONE);
            textx.setVisibility(View.GONE);
            texty.setVisibility(View.GONE);
            textz.setVisibility(View.GONE);
            text.setVisibility(View.GONE);
//            text1.setText("企业名称："+dataBean1.getQYMC());
        }
    }
    private void getSXDataFromNet(String s) {
        mMyOkhttp.post()
                .url(ApiConstants.xzsplclistApi+key+"&SPID="+s)
                .tag(this)
                .enqueue(new GsonResponseHandler<xzspLCInfo>() {
                    @Override
                    public void onFailure(int statusCode, String error_msg) {
                        Log.e("TAG","失败："+error_msg);
//                      Toast.makeText(qyListActivity.this, error_msg, Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onSuccess(int statusCode, xzspLCInfo response) {
//                        Toast.makeText(qyListActivity.this, response.toString(), Toast.LENGTH_SHORT).show();

                        Log.e("TAG","response：成功");

                        if(response.getStat() == null){

                            detailAdapter.setNewData(response.getData());
                            showSuccess();


                        }else{

                            if(response.getStat().equals("101")){
                                Utils.toLogin(xzspListInfoActivity.this);
                            }
                        }

                    }
                });


    }

    //pid
    private String string;
    @Override
    public void onClick(View v) {
        switch (v.getId()) {


            case R.id.btnback:
                finish();
                break;

            case R.id.tv_one:
                tv_one.setSelected(true);
                tv_two.setSelected(false);

                lx = "2";
                include.setVisibility(View.VISIBLE);
                ll_lcjd.setVisibility(View.GONE);
                scrollview.setVisibility(View.VISIBLE);
                break;
            case R.id.tv_two:
                tv_one.setSelected(false);
                tv_two.setSelected(true);
                include.setVisibility(View.GONE);
                ll_lcjd.setVisibility(View.VISIBLE);
                scrollview.setVisibility(View.GONE);
                lx = "1";
                getType();
                break;


        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMyOkhttp.cancel(this);
    }

}
