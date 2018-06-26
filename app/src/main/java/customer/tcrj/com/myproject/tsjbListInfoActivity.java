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
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.bean.tsjuInfo;
import customer.tcrj.com.myproject.bean.xzspInfo;
import customer.tcrj.com.myproject.bean.xzspLCInfo;
import customer.tcrj.com.myproject.net.ApiConstants;
import customer.tcrj.com.myproject.widget.SuperScrollView;

public class tsjbListInfoActivity extends BaseActivity{

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



    @BindView(R.id.scinfo)
    TextView scinfo;
    @BindView(R.id.jdqy)
    TextView jdqy;
    @BindView(R.id.spxx)
    TextView spxx;


    @BindView(R.id.tv_currentstatenumber)
    TextView tv_currentstatenumber;

    @BindView(R.id.txtTitle)
    TextView txtTitle;

    tsjuInfo.DataBean xzspinfo;

    @Override
    protected int setLayout() {
        return R.layout.activity_tsjbinfo_list;
    }

    @Override
    protected void setView() {
        xzspinfo = (tsjuInfo.DataBean) getIntent().getSerializableExtra("jlinfo");
        txtTitle.setText("投诉举报信息");
        scinfo.setText("企业信息");
        jdqy.setText("产品信息");
        spxx.setText("投诉信息");
        btnback.setOnClickListener(this);
        tv_currentstatenumber.setVisibility(View.GONE);
    }


    @Override
    protected void setData() {
        setjbInfoData(xzspinfo);
    }

    private void setjbInfoData(tsjuInfo.DataBean dataBean1) {
        if(dataBean1 != null){

            tsjuInfo.DataBean.TSQYInfoBean xkdwInfo1 = dataBean1.getTSQYInfo();
            if(xkdwInfo1 != null){
                text_qya.setText("企业名称："+xkdwInfo1.getQYMC());
                text_qyb.setText("统一社会信用代码："+xkdwInfo1.getTYSHXYDM());
                text_qyc.setText("法人姓名: "+xkdwInfo1.getFDDBRXM());
                text_qyd.setText("法人证件号码: "+xkdwInfo1.getFDDBRZJHM());
            }
            tsjuInfo.DataBean.TSCPInfoBean sqdwInfo1 = dataBean1.getTSCPInfo();
            if(sqdwInfo1 != null){
                text_syqya.setText("产品类型: "+sqdwInfo1.getLX());
                text_syqyb.setText("产品分类: "+sqdwInfo1.getFL());
                text_syqyc.setText("产品名称: "+sqdwInfo1.getMC());
                text_syqyd.setText("产品编码: "+sqdwInfo1.getBM());
            }

            texta.setText("投诉类型："+dataBean1.getTSLX());
            textb.setText("投诉人姓名："+dataBean1.getXM());
            textc.setText("投诉人电话："+dataBean1.getLXDH());
            textd.setVisibility(View.GONE);
            texte.setVisibility(View.GONE);
            textf.setText("受理人："+dataBean1.getSLR());
            textg.setText("受理时间："+dataBean1.getSLSJ());
            texth.setText("办理人："+dataBean1.getBLR());
            texti.setText("办理时间："+dataBean1.getBLSJ());
            textj.setText("投诉标题："+dataBean1.getBT());
            textk.setText("投诉内容："+dataBean1.getNR());
            textl.setVisibility(View.GONE);
            textm.setText("办理结果："+dataBean1.getBLJG());
            textn.setVisibility(View.GONE);
            texto.setVisibility(View.GONE);
            textp.setVisibility(View.GONE);
            textq.setVisibility(View.GONE);
            textr.setVisibility(View.GONE);
            texts.setVisibility(View.GONE);
            textt.setVisibility(View.GONE);
            textu.setVisibility(View.GONE);
            textv.setVisibility(View.GONE);
            textw.setVisibility(View.GONE);
            textx.setVisibility(View.GONE);
            texty.setVisibility(View.GONE);
            textz.setVisibility(View.GONE);
            text.setVisibility(View.GONE);
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnback:
                finish();
                break;
        }
    }




}
