package customer.tcrj.com.myproject.first;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.bean.jlqjInfo;
import customer.tcrj.com.myproject.bean.qyListInfo;
import customer.tcrj.com.myproject.bean.shebeiInfo;

public class qjListInfoActivity extends BaseActivity {

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

    @BindView(R.id.btnback)
    public ImageView btnback;

//    @BindView(R.id.qy_textv)
//    public TextView textv;
//    @BindView(R.id.qy_textw)
//    public TextView textw;
//    @BindView(R.id.qy_textx)
//    public TextView textx;



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

    @BindView(R.id.syqy)
    LinearLayout syqy;
    @BindView(R.id.scqy)
    LinearLayout scqy;
    @BindView(R.id.ll_syr)
    LinearLayout ll_syr;

    @BindView(R.id.txtTitle)
    public TextView txtTitle;
    private jlqjInfo.DataBean sbinfo =null;

    @Override
    protected int setLayout() {
        return R.layout.activity_qj_list_info;
    }

    @Override
    protected void setView() {
        sbinfo= (jlqjInfo.DataBean) getIntent().getSerializableExtra("jlinfo");
        btnback.setOnClickListener(this);
    }

    @Override
    protected void setData() {
        txtTitle.setText("计量器具信息");
        if(sbinfo != null){
//            boolean sfjk = sbinfo.isSFJK();
//            boolean sfjk = sbinfo.isSFNJ();
//            boolean sfjk = sbinfo.isSFQJ();
//            boolean sfjk = sbinfo.isSFQJHC();
//            boolean sfjk = sbinfo.isSFWDXKH();
//            boolean sfjk = sbinfo.isSFZJ();


            texta.setText("名称："+sbinfo.getZJCPInfo().getMC());
            textb.setVisibility(View.GONE);
            textc.setText("周期："+sbinfo.getZQ());
            textd.setText("编码："+sbinfo.getZJCPInfo().getBM());
            texte.setText("分类："+sbinfo.getZJCPInfo().getFL());
            textf.setText("规格型号："+sbinfo.getZJCPInfo().getGGXH());
            textg.setText("出厂编号："+sbinfo.getCCBH());
            texth.setText("条形码："+sbinfo.getTXM());
            texti.setText("检定周期："+sbinfo.getJDZQ());
            textj.setText("有效期："+sbinfo.getYXQ());
            textk.setText("开始日期："+sbinfo.getKSRQ());
            textl.setText("结束日期："+sbinfo.getJSRQ());
            textm.setText("是否进口："+(sbinfo.isSFJK()? "是" : "否"));
            textn.setText("是否强检："+(sbinfo.isSFQJ()? "是" : "否"));
            texto.setText("是否周检："+(sbinfo.isSFZJ()? "是" : "否"));
            textp.setText("是否内检："+(sbinfo.isSFNJ()? "是" : "否"));
            textq.setText("是否期间检查："+(sbinfo.isSFQJHC()? "是" : "否"));
            textr.setText("是否稳定性检查："+(sbinfo.isSFWDXKH()? "是" : "否"));
            texts.setText("测量范围："+sbinfo.getCLFW());
            textt.setText("不确定度："+sbinfo.getBQDD());
            textu.setText(sbinfo.getBZ());

//            jlqjInfo.DataBean.ZJCPInfoBean.SYDWInfoBean sydwInfo = sbinfo.getZJCPInfo().getSYDWInfo();
//            if(sydwInfo != null){
//                text_syqya.setText("企业名称："+sbinfo.getZJCPInfo().getSYDWInfo().getQYMC());
//                text_syqyb.setText("法人姓名："+sbinfo.getZJCPInfo().getSYDWInfo().getFDDBRXM());
//                text_syqyc.setText("法人证件号码："+sbinfo.getZJCPInfo().getSYDWInfo().getFDDBRZJHM());
//                text_syqyd.setText("统一社会信用代码："+sbinfo.getZJCPInfo().getSYDWInfo().getTYSHXYDM());
//            }
//            jlqjInfo.DataBean.ZJCPInfoBean.SCDWInfoBean scdwInfo = sbinfo.getZJCPInfo().getSCDWInfo();
//            if(scdwInfo != null){
//                text_qya.setText("企业名称："+sbinfo.getZJCPInfo().getSCDWInfo().getQYMC());
//                text_qyb.setText("法人姓名："+sbinfo.getZJCPInfo().getSCDWInfo().getFDDBRXM());
//                text_qyc.setText("法人证件号码："+sbinfo.getZJCPInfo().getSCDWInfo().getFDDBRZJHM());
//                text_qyd.setText("统一社会信用代码："+sbinfo.getZJCPInfo().getSCDWInfo().getTYSHXYDM());
//            }

            jlqjInfo.DataBean.ZJCPInfoBean.SYRInfoBean syrInfo =  sbinfo.getZJCPInfo().getSYRInfo();
            if(syrInfo.getXM() != null){
                ll_syr.setVisibility(View.VISIBLE);
                text_syra.setText("姓名:"+syrInfo.getXM());
                String xb = syrInfo.getXB();
                    text_syrb.setText("性别："+xb);
                text_syrc.setText("出生年月:"+syrInfo.getCSNY());
                text_syrd.setText("手机号码:"+syrInfo.getSJH());
            }else {
                text_syra.setText("姓名:");
                text_syrb.setText("性别：");
                text_syrc.setText("出生年月:");
                text_syrd.setText("手机号码:");
            }


            jlqjInfo.DataBean.ZJCPInfoBean.SYDWInfoBean scdwInfo = sbinfo.getZJCPInfo().getSYDWInfo();
            jlqjInfo.DataBean.ZJCPInfoBean.SCDWInfoBean sydwInfo = sbinfo.getZJCPInfo().getSCDWInfo();


            if(sydwInfo.getQYMC() != null){
                syqy.setVisibility(View.VISIBLE);
                text_syqya.setText("企业名称："+sydwInfo.getQYMC());
                text_syqyb.setText("法人姓名："+sydwInfo.getFDDBRXM());
                text_syqyc.setText("法人证件号码："+sydwInfo.getFDDBRZJHM());
                text_syqyd.setText("统一社会信用代码："+sydwInfo.getTYSHXYDM());
            }else {
                text_syqya.setText("企业名称：");
                text_syqyb.setText("法人姓名：");
                text_syqyc.setText("法人证件号码：");
                text_syqyd.setText("统一社会信用代码：");
            }


            if(scdwInfo.getQYMC() != null){
                scqy.setVisibility(View.VISIBLE);
                text_qya.setText("企业名称："+scdwInfo.getQYMC());
                text_qyb.setText("法人姓名："+scdwInfo.getFDDBRXM());
                text_qyc.setText("法人证件号码："+scdwInfo.getFDDBRZJHM());
                text_qyd.setText("统一社会信用代码："+scdwInfo.getTYSHXYDM());
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
