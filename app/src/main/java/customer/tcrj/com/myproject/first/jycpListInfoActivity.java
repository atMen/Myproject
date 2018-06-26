package customer.tcrj.com.myproject.first;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.bean.jcInfo;
import customer.tcrj.com.myproject.bean.jlqjInfo;
import customer.tcrj.com.myproject.bean.jycpInfo;

public class jycpListInfoActivity extends BaseActivity {

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


    @BindView(R.id.syqy)
    LinearLayout syqy;
    @BindView(R.id.scqy)
    LinearLayout scqy;

    @BindView(R.id.ll_syr)
    LinearLayout ll_syr;

    @BindView(R.id.txtTitle)
    public TextView txtTitle;
    @BindView(R.id.btnback)
    ImageView btnback;


    @BindView(R.id.scinfo)
    TextView scinfo;
    @BindView(R.id.jdqy)
    TextView jdqy;


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

    private jycpInfo.DataBean sbinfo =null;

    @Override
    protected int setLayout() {
        return R.layout.activity_jycp_list_info;
    }

    @Override
    protected void setView() {
        sbinfo= (jycpInfo.DataBean) getIntent().getSerializableExtra("jycpinfo");
        btnback.setOnClickListener(this);
    }

    @Override
    protected void setData() {
        txtTitle.setText("检验产品信息");
        scinfo.setText("生产企业信息");
        jdqy.setText("使用企业信息");
        textl.setVisibility(View.GONE);
        if(sbinfo != null){


            texta.setText("名称："+sbinfo.getZJCPInfo().getMC());
            textb.setText("分类："+sbinfo.getZJCPInfo().getFL());
            textc.setText("批号："+sbinfo.getPH());
            textd.setText("编码："+sbinfo.getZJCPInfo().getBM());
            texte.setText("商标："+sbinfo.getSB());
            textf.setText("规格型号："+sbinfo.getZJCPInfo().getGGXH());
            textg.setText("产品数量："+sbinfo.getCPSL());
            texth.setText("产品来源："+sbinfo.getCPLY());
            texti.setText("生产日期："+sbinfo.getSCRQ());
            textj.setText("产品等级："+sbinfo.getCPDJ());
            textk.setText("是否出口产品："+(sbinfo.isSFCKCP()? "是" : "否"));
//            textl.setText("结束日期："+sbinfo.getJSRQ());





            jycpInfo.DataBean.ZJCPInfoBean.SYRInfoBean syrInfo =  sbinfo.getZJCPInfo().getSYRInfo();
            if(syrInfo.getXM() != null){
                ll_syr.setVisibility(View.VISIBLE);
                text_syra.setText("姓名:"+syrInfo.getXM());
                String xb = syrInfo.getXB();
                if(xb != null){
                    text_syrb.setText("性别："+(xb.equals("1")? "男" : "女"));
                }

                text_syrc.setText("出生年月:"+syrInfo.getCSNY());
                text_syrd.setText("手机号码:"+syrInfo.getSJH());
            }else{
                text_syra.setText("姓名:");
                text_syrb.setText("性别：");
                text_syrc.setText("出生年月:");
                text_syrd.setText("手机号码:");
            }


            jycpInfo.DataBean.ZJCPInfoBean.SYDWInfoBean sydwInfo = sbinfo.getZJCPInfo().getSYDWInfo();
            if(sbinfo.getZJCPInfo().getSYDWInfo().getQYMC() != null){
                syqy.setVisibility(View.VISIBLE);
                text_syqya.setText("企业名称："+sbinfo.getZJCPInfo().getSYDWInfo().getQYMC());
                text_syqyb.setText("法人姓名："+sbinfo.getZJCPInfo().getSYDWInfo().getFDDBRXM());
                text_syqyc.setText("法人证件号码："+sbinfo.getZJCPInfo().getSYDWInfo().getFDDBRZJHM());
                text_syqyd.setText("统一社会信用代码："+sbinfo.getZJCPInfo().getSYDWInfo().getTYSHXYDM());

            }else {
                text_syqya.setText("企业名称：");
                text_syqyb.setText("法人姓名：");
                text_syqyc.setText("法人证件号码：");
                text_syqyd.setText("统一社会信用代码：");
            }

            jycpInfo.DataBean.ZJCPInfoBean.SCDWInfoBean scdwInfo = sbinfo.getZJCPInfo().getSCDWInfo();
            if(sbinfo.getZJCPInfo().getSCDWInfo().getQYMC() != null){
                scqy.setVisibility(View.VISIBLE);
                text_qya.setText("企业名称："+sbinfo.getZJCPInfo().getSCDWInfo().getQYMC());
                text_qyb.setText("法人姓名："+sbinfo.getZJCPInfo().getSCDWInfo().getFDDBRXM());
                text_qyc.setText("法人证件号码："+sbinfo.getZJCPInfo().getSCDWInfo().getFDDBRZJHM());
                text_qyd.setText("统一社会信用代码："+sbinfo.getZJCPInfo().getSCDWInfo().getTYSHXYDM());
            }else {
                text_qya.setText("企业名称：");
                text_qyb.setText("法人姓名：");
                text_qyc.setText("法人证件号码：");
                text_qyd.setText("统一社会信用代码：");
            }



        }

    }

    @Override
    public void onClick(View v) {
         finish();
    }
}
