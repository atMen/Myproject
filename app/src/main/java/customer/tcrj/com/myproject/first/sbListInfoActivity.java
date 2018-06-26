package customer.tcrj.com.myproject.first;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.bean.jycpInfo;
import customer.tcrj.com.myproject.bean.shebeiInfo;

public class sbListInfoActivity extends BaseActivity {

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

    @BindView(R.id.texta)
    public TextView texta;
    @BindView(R.id.textb)
    public TextView textb;
    @BindView(R.id.textc)
    public TextView textc;
    @BindView(R.id.textd)
    public TextView textd;
    @BindView(R.id.texte)
    public TextView texte;
    @BindView(R.id.textf)
    public TextView textf;
    @BindView(R.id.textg)
    public TextView textg;
    @BindView(R.id.texth)
    public TextView texth;
    @BindView(R.id.texti)
    public TextView texti;
    @BindView(R.id.textj)
    public TextView textj;
    @BindView(R.id.textk)
    public TextView textk;
    @BindView(R.id.textl)
    public TextView textl;
    @BindView(R.id.text_ywjk)
    public TextView text_ywjk;

    @BindView(R.id.textdz)
    public TextView textdz;
    @BindView(R.id.textzt)
    public TextView textzt;

    @BindView(R.id.scinfo)
    public TextView scinfo;
    @BindView(R.id.jdqy)
    public TextView jdqy;

    @BindView(R.id.syqy)
    LinearLayout syqy;
    @BindView(R.id.scqy)
    LinearLayout scqy;
    @BindView(R.id.ll_syr)
    LinearLayout ll_syr;

    @BindView(R.id.text_syra)
    public TextView text_syra;
    @BindView(R.id.text_syrb)
    public TextView text_syrb;
    @BindView(R.id.text_syrc)
    public TextView text_syrc;
    @BindView(R.id.text_syrd)
    public TextView text_syrd;


    @BindView(R.id.txtTitle)
    TextView txtTitle;
    @BindView(R.id.btnback)
    public ImageView btnback;
    shebeiInfo.DataBean sbinfo = null;

    @Override
    protected int setLayout() {
        return R.layout.activity_sb_list_info;
    }

    @Override
    protected void setView() {
        sbinfo = (shebeiInfo.DataBean) getIntent().getSerializableExtra("sbinfo");
        btnback.setOnClickListener(this);
        jdqy.setText("使用企业信息");
        scinfo.setText("生产企业信息");
    }

    @Override
    protected void setData() {
        txtTitle.setText("特种设备信息详情");
        if(sbinfo != null){

            shebeiInfo.DataBean.ZJCPInfoBean.SYRInfoBean syrInfo =  sbinfo.getZJCPInfo().getSYRInfo();
            if(syrInfo.getXM() != null){
                ll_syr.setVisibility(View.VISIBLE);
                text_syra.setText("姓名:"+syrInfo.getXM());

                String xb = syrInfo.getXB();
                    text_syrb.setText("性别："+xb);
                text_syrc.setText("出生年月:"+syrInfo.getCSNY());
                text_syrd.setText("手机号码:"+syrInfo.getSJH());
            }else{
                text_syra.setText("姓名:");
                text_syrb.setText("性别：");
                text_syrc.setText("出生年月:");
                text_syrd.setText("手机号码:");
            }


            shebeiInfo.DataBean.ZJCPInfoBean.SYDWInfoBean sydwInfo = sbinfo.getZJCPInfo().getSYDWInfo();
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

            shebeiInfo.DataBean.ZJCPInfoBean.SCDWInfoBean scdwInfo = sbinfo.getZJCPInfo().getSCDWInfo();
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

//            shebeiInfo.DataBean.ZJCPInfoBean.SYDWInfoBean sydwInfo = sbinfo.getZJCPInfo().getSYDWInfo();
//            if(sydwInfo != null){
//                text_syqya.setText("企业名称："+sbinfo.getZJCPInfo().getSYDWInfo().getQYMC());
//                text_syqyb.setText("法人姓名："+sbinfo.getZJCPInfo().getSYDWInfo().getFDDBRXM());
//                text_syqyc.setText("法人证件号码："+sbinfo.getZJCPInfo().getSYDWInfo().getFDDBRZJHM());
//                text_syqyd.setText("统一社会信用代码："+sbinfo.getZJCPInfo().getSYDWInfo().getTYSHXYDM());
//            }
//            shebeiInfo.DataBean.ZJCPInfoBean.SCDWInfoBean scdwInfo = sbinfo.getZJCPInfo().getSCDWInfo();
//            if(scdwInfo != null){
//                text_qya.setText("企业名称："+sbinfo.getZJCPInfo().getSCDWInfo().getQYMC());
//                text_qyb.setText("法人姓名："+sbinfo.getZJCPInfo().getSCDWInfo().getFDDBRXM());
//                text_qyc.setText("法人证件号码："+sbinfo.getZJCPInfo().getSCDWInfo().getFDDBRZJHM());
//                text_qyd.setText("统一社会信用代码："+sbinfo.getZJCPInfo().getSCDWInfo().getTYSHXYDM());
//            }



            texta.setText("分类："+sbinfo.getZJCPInfo().getFL());
            textb.setText("名称："+sbinfo.getZJCPInfo().getMC());
            textc.setText("编码："+sbinfo.getZJCPInfo().getBM());
            textd.setText("识别码："+sbinfo.getSBM());
            texte.setText("规格型号："+sbinfo.getZJCPInfo().getGGXH());
            textf.setText("设备数量："+sbinfo.getSBSL());
            textg.setText("设备级别："+sbinfo.getSBJB());
            texth.setText("制造日期："+sbinfo.getZZRQ());
            texti.setText("安装日期："+sbinfo.getAZRQ());

            textzt.setText("使用状态："+sbinfo.getZJCPInfo().getSYZT());
            textdz.setText("使用地址："+sbinfo.getZJCPInfo().getSYDZ());
            text_ywjk.setText("有无监控："+(sbinfo.isYWJK()? "有" : "无"));
            textj.setText("设计使用年限："+sbinfo.getSJSYNX());
            textk.setText("施工单位名称："+sbinfo.getSGDWMC());
            textl.setText("制造许可证编号："+sbinfo.getZZXKZBH());

        }
    }

    @Override
    public void onClick(View v) {

        finish();
    }
}
