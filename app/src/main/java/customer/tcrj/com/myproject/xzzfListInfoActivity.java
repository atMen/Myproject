package customer.tcrj.com.myproject;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tsy.sdk.myokhttp.MyOkHttp;
import com.tsy.sdk.myokhttp.response.GsonResponseHandler;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import customer.tcrj.com.myproject.Utils.ACache;
import customer.tcrj.com.myproject.Utils.Utils;
import customer.tcrj.com.myproject.adpater.xzsplcListAdapter;
import customer.tcrj.com.myproject.adpater.xzzflcListAdapter;
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.bean.xzspInfo;
import customer.tcrj.com.myproject.bean.xzspLCInfo;
import customer.tcrj.com.myproject.bean.xzzfInfo;
import customer.tcrj.com.myproject.bean.xzzfLCInfo;
import customer.tcrj.com.myproject.net.ApiConstants;
import customer.tcrj.com.myproject.widget.SuperScrollView;

public class xzzfListInfoActivity extends BaseActivity{

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
//    @BindView(R.id.qy_text1)
//    public TextView text1;

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
    @BindView(R.id.scrollview)
    SuperScrollView scrollview;

    @BindView(R.id.ll_lcjd)
    LinearLayout ll_lcjd;

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
    @BindView(R.id.bz)
    TextView bz;
    @BindView(R.id.bz01)
    TextView bz01;
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
    private xzzflcListAdapter detailAdapter;
    private List<xzzfLCInfo.DataBean> beanList;

    private String key;
    xzzfInfo.DataBean dataBean1;

    @Override
    protected int setLayout() {
        return R.layout.activity_xzspinfo_list;
    }

    @Override
    protected void setView() {
        bz.setVisibility(View.VISIBLE);
        bz01.setVisibility(View.GONE);
        dataBean1 = (xzzfInfo.DataBean) getIntent().getSerializableExtra("xzzfinfo");

        mMyOkhttp = MyApp.getInstance().getMyOkHttp();
        key = ACache.get(this).getAsString("Key");
        tv_one.setSelected(true);
        tv_one.setText("基本信息");
        tv_two.setText("流程节点");

        scinfo.setText("检查机关信息");
        jdqy.setText("受检单位信息");
        syr.setText("受检产品信息");
        spxx.setText("执法信息");

        btnback.setOnClickListener(this);
        tv_currentstatenumber.setVisibility(View.GONE);
        tv_one.setOnClickListener(this);
        tv_two.setOnClickListener(this);
        tv_three.setOnClickListener(this);

        beanList = new ArrayList<>();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(detailAdapter = new xzzflcListAdapter(beanList, this));
        detailAdapter.setEnableLoadMore(false);


    }

    private void setjbInfoData() {
        if(dataBean1 != null){


            xzzfInfo.DataBean.JCJIGInfoBean xkdwInfo1 = dataBean1.getJCJIGInfo();
            if(xkdwInfo1.getQYMC() != null){
                scqy.setVisibility(View.VISIBLE);
                text_qya.setText("企业名称："+xkdwInfo1.getQYMC());
                text_qyb.setText("统一社会信用代码："+xkdwInfo1.getTYSHXYDM());
                text_qyc.setText("法人姓名: "+xkdwInfo1.getFDDBRXM());
                text_qyd.setText("法人证件号码: "+xkdwInfo1.getFDDBRZJHM());
            }else {
                text_qya.setText("企业名称：");
                text_qyb.setText("统一社会信用代码：");
                text_qyc.setText("法人姓名: ");
                text_qyd.setText("法人证件号码: ");
            }
            xzzfInfo.DataBean.SJDWInfoBean sqdwInfo1 = dataBean1.getSJDWInfo();
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
            xzzfInfo.DataBean.SSCPInfoBean sqrInfo1 = dataBean1.getSSCPInfo();
            if(sqrInfo1.getMC() != null){
                ll_syr.setVisibility(View.VISIBLE);
                text_syra.setText("类型："+sqrInfo1.getLX());
                text_syrb.setText("分类："+sqrInfo1.getFL());
                text_syrc.setText("名称："+sqrInfo1.getMC());
                text_syrd.setText("编码："+sqrInfo1.getBM());
            }else {
                text_syra.setText("类型：");
                text_syrb.setText("分类：");
                text_syrc.setText("名称：");
                text_syrd.setText("编码：");
            }


            texta.setText("案件编号："+dataBean1.getAJBH());
            textb.setText("案件来源："+dataBean1.getAJLY());
            textc.setText("案由："+dataBean1.getAY());
            textd.setText("受理时间："+dataBean1.getSLSJ());
            texte.setText("受理人："+dataBean1.getSLR());
            textf.setText("地方编码："+dataBean1.getDFBM());
                textg.setVisibility(View.GONE);
                texth.setVisibility(View.GONE);
            texti.setText("检查事项名称："+dataBean1.getJCSXMC());
            textj.setText("检查内容："+dataBean1.getJCNR());
            textk.setText("检查类型："+dataBean1.getJCLX());
            textl.setText("检查机关："+dataBean1.getJCJIGInfo().getQYMC());
            textm.setText("检查结果："+dataBean1.getJCJIEG());
            textn.setText("检查完成日期："+dataBean1.getJCWCRQ());
            texto.setText("行政处罚书文号："+dataBean1.getXZCFJDSWH());
            textp.setText("处罚名称："+dataBean1.getCFMC());
            textq.setText("处罚类别1："+dataBean1.getCFLB1());
            textr.setText("处罚类别2："+dataBean1.getCFLB2());
            texts.setText("处罚金额（元）："+dataBean1.getCFJE());
            textt.setText("处罚事由："+dataBean1.getCFSY());
            textu.setText("处罚依据："+dataBean1.getCFYJ());
            textv.setText("处罚结果："+dataBean1.getCFJIEG());
            textw.setText("处罚决定日期："+dataBean1.getCFJDRQ());
            textx.setText("处罚机关："+dataBean1.getCFJIG());
            texty.setText("当前状态："+dataBean1.getDQZT());
            textz.setText("办结时间："+dataBean1.getBJSJ());
            text.setText(dataBean1.getBZ());
//            text1.setText("企业名称："+dataBean1.getQYMC());
        }
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
        setjbInfoData();
        string = dataBean1.getZFID()+"";
        Log.e("TAG","zfid"+string);
        getType();

    }


    private String lx = "2";


    private void getSXDataFromNet(String s) {
        mMyOkhttp.post()
                .url(ApiConstants.xzzflclistApi+key+"&ZFID="+s)
                .tag(this)
                .enqueue(new GsonResponseHandler<xzzfLCInfo>() {
                    @Override
                    public void onFailure(int statusCode, String error_msg) {
                        Log.e("TAG","失败："+error_msg);
//                      Toast.makeText(qyListActivity.this, error_msg, Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onSuccess(int statusCode, xzzfLCInfo response) {
//                        Toast.makeText(qyListActivity.this, response.toString(), Toast.LENGTH_SHORT).show();


                        if(response.getStat() == null){

                            detailAdapter.setNewData(response.getData());
                            showSuccess();


                        }else{

                            if(response.getStat().equals("101")){
                                Utils.toLogin(xzzfListInfoActivity.this);
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
