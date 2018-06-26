package customer.tcrj.com.myproject.first;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.bean.jcInfo;
import customer.tcrj.com.myproject.bean.jycpInfo;

public class jcListInfoActivity extends BaseActivity {

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
    public TextView scinfo;
    @BindView(R.id.jdqy)
    public TextView jdqy;

    @BindView(R.id.syqy)
    LinearLayout syqy;
    @BindView(R.id.scqy)
    LinearLayout scqy;

    @BindView(R.id.txtTitle)
    public TextView txtTitle;
    @BindView(R.id.btnback)
    ImageView btnback;

    private jcInfo.DataBean sbinfo =null;

    @Override
    protected int setLayout() {
        return R.layout.activity_jc_list_info;
    }

    @Override
    protected void setView() {
        sbinfo= (jcInfo.DataBean) getIntent().getSerializableExtra("qyinfo");
        btnback.setOnClickListener(this);
    }

    @Override
    protected void setData() {
        txtTitle.setText("检验检测信息");
        jdqy.setText("质监产品信息");
        scinfo.setText("检定企业信息");

        if(sbinfo != null){

            texta.setText("检定项目名称："+sbinfo.getXMMC());
            textb.setText("检定项目编码："+sbinfo.getXMBM());
            textc.setText("检定部门："+sbinfo.getBMMC());
            textd.setText("检定类型："+sbinfo.getJDLX());
            texte.setText("检定人员："+sbinfo.getRYMC());
            textf.setText("检定人员编码："+sbinfo.getRYBM());
            textg.setText("检定人员联系电话："+sbinfo.getRYLXDH());
            texth.setText("检定报告编号："+sbinfo.getJYBGBH());
            texti.setText("送检时间："+sbinfo.getSJSJ());
            textj.setText("受理时间："+sbinfo.getSLSJ());
            textk.setText("检定起始日期："+sbinfo.getJDQSRQ());
            textl.setText("检定结束日期："+sbinfo.getJDJSRQ());
            textm.setText("检定结果："+sbinfo.getJDJG());
            textn.setText("打回原因："+sbinfo.getDHYY());
            texto.setText("退检原因："+sbinfo.getTJYY());
            textp.setText(sbinfo.getBZ());
            textq.setVisibility(View.GONE);

            jcInfo.DataBean.ZJCPInfoBean sydwInfo = sbinfo.getZJCPInfo();
            if(sbinfo.getZJCPInfo().getMC() != null){
                syqy.setVisibility(View.VISIBLE);
                text_syqya.setText("类型："+sbinfo.getZJCPInfo().getLX());
                text_syqyb.setText("分类："+sbinfo.getZJCPInfo().getFL());
                text_syqyc.setText("名称："+sbinfo.getZJCPInfo().getMC());
                text_syqyd.setText("编码："+sbinfo.getZJCPInfo().getBM());
            }else {
                text_syqya.setText("类型：");
                text_syqyb.setText("分类：");
                text_syqyc.setText("名称：");
                text_syqyd.setText("编码：");
            }

            jcInfo.DataBean.JDQYInfoBean scdwInfo = sbinfo.getJDQYInfo();
            if(sbinfo.getJDQYInfo().getQYMC() != null){
                scqy.setVisibility(View.VISIBLE);
                text_qya.setText("企业名称："+sbinfo.getJDQYInfo().getQYMC());
                text_qyb.setText("法人姓名："+sbinfo.getJDQYInfo().getFDDBRXM());
                text_qyc.setText("法人证件号码："+sbinfo.getJDQYInfo().getFDDBRZJHM());
                text_qyd.setText("统一社会信用代码："+sbinfo.getJDQYInfo().getTYSHXYDM());
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
