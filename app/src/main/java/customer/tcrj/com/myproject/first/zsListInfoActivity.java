package customer.tcrj.com.myproject.first;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.airbnb.lottie.L;

import butterknife.BindView;
import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.bean.jycpInfo;
import customer.tcrj.com.myproject.bean.zsInfo;

public class zsListInfoActivity extends BaseActivity {

    @BindView(R.id.zs_texta)
    public TextView texta;
    @BindView(R.id.zs_textb)
    public TextView textb;
    @BindView(R.id.zs_textc)
    public TextView textc;
    @BindView(R.id.zs_textd)
    public TextView textd;
    @BindView(R.id.zs_texte)
    public TextView texte;
    @BindView(R.id.zs_textf)
    public TextView textf;
    @BindView(R.id.zs_textg)
    public TextView textg;

    @BindView(R.id.zs_zt)
    public TextView zs_zt;

    @BindView(R.id.text_fzjga)
    public TextView text_syqya;
    @BindView(R.id.text_fzjgb)
    public TextView text_syqyb;
    @BindView(R.id.text_fzjgc)
    public TextView text_syqyc;
    @BindView(R.id.text_fzjgd)
    public TextView text_syqyd;

    @BindView(R.id.text_czjga)
    public TextView text_qya;
    @BindView(R.id.text_czjgb)
    public TextView text_qyb;
    @BindView(R.id.text_czjgc)
    public TextView text_qyc;
    @BindView(R.id.text_czjgd)
    public TextView text_qyd;

    @BindView(R.id.text_czgra)
    public TextView text_czgra;
    @BindView(R.id.text_czgrb)
    public TextView text_czgrb;
    @BindView(R.id.text_czgrc)
    public TextView text_czgrc;
    @BindView(R.id.text_czgrd)
    public TextView text_czgrd;

    @BindView(R.id.text_sscpa)
    public TextView text_sscpa;
    @BindView(R.id.text_sscpb)
    public TextView text_sscpb;
    @BindView(R.id.text_sscpc)
    public TextView text_sscpc;
    @BindView(R.id.text_sscpd)
    public TextView text_sscpd;

    @BindView(R.id.ll_gson)
    LinearLayout ll_gson;
    @BindView(R.id.ll_czjg)
    LinearLayout ll_czjg;
    @BindView(R.id.ll_czgr)
    LinearLayout ll_czgr;
    @BindView(R.id.ll_ssgr)
    LinearLayout ll_ssgr;


    @BindView(R.id.txtTitle)
    public TextView txtTitle;
    @BindView(R.id.btnback)
    public ImageView btnback;


    private zsInfo.DataBean sbinfo =null;

    @Override
    protected int setLayout() {
        return R.layout.activity_zs_list_info;
    }

    @Override
    protected void setView() {
        sbinfo= (zsInfo.DataBean) getIntent().getSerializableExtra("zsinfo");
        btnback.setOnClickListener(this);
        zs_zt.setVisibility(View.VISIBLE);
    }

    @Override
    protected void setData() {
        txtTitle.setText("证书管理信息详情");
        if(sbinfo != null){

            texta.setText("证书类别："+sbinfo.getZSLB());
            textb.setText("证书编号："+sbinfo.getZSBH());
            textc.setText("证书名称："+sbinfo.getZSM());
            textd.setText("证书字："+sbinfo.getZSZ());
            texte.setText("发证日期："+sbinfo.getFZRQ());
            textf.setText("有效日期："+sbinfo.getYXRQ());
            textg.setText(""+sbinfo.getBZ());
            zs_zt.setText("证书状态："+sbinfo.getZT());

            zsInfo.DataBean.FZJGInfoBean fzjgInfo = sbinfo.getFZJGInfo();

            if(fzjgInfo != null & fzjgInfo.getQYMC() != null){
                ll_gson.setVisibility(View.VISIBLE);
                text_syqya.setText("企业名称："+fzjgInfo.getQYMC());
                text_syqyb.setText("法人姓名："+fzjgInfo.getFDDBRXM());
                text_syqyc.setText("法人证件号码："+fzjgInfo.getFDDBRZJHM());
                text_syqyd.setText("统一社会信用代码："+fzjgInfo.getTYSHXYDM());
            }else{
                text_syqya.setText("企业名称：");
                text_syqyb.setText("法人姓名：");
                text_syqyc.setText("法人证件号码：");
                text_syqyd.setText("统一社会信用代码：");
            }

            zsInfo.DataBean.CYJGInfoBean cyjgInfo = sbinfo.getCYJGInfo();
            if(cyjgInfo != null & cyjgInfo.getQYMC()!= null){
                ll_czjg.setVisibility(View.VISIBLE);
                text_qya.setText("企业名称："+cyjgInfo.getQYMC());
                text_qyb.setText("法人姓名："+cyjgInfo.getFDDBRXM());
                text_qyc.setText("法人证件号码："+cyjgInfo.getFDDBRZJHM());
                text_qyd.setText("统一社会信用代码："+cyjgInfo.getTYSHXYDM());

            }else {
                text_qya.setText("企业名称：");
                text_qyb.setText("法人姓名：");
                text_qyc.setText("法人证件号码：");
                text_qyd.setText("统一社会信用代码：");
            }

            zsInfo.DataBean.CYRInfoBean cyrInfo = sbinfo.getCYRInfo();
            if(cyrInfo != null & cyrInfo.getXM() != null){
                ll_czgr.setVisibility(View.VISIBLE);
                text_czgra.setText("姓名："+cyrInfo.getXM());
                String xb = cyrInfo.getXB();
                    text_czgrb.setText("性别："+xb);
                text_czgrc.setText("证件号："+cyrInfo.getZJH());
                text_czgrd.setText("手机号："+cyrInfo.getSJH());
            }else {
                text_czgra.setText("姓名：");
                text_czgrb.setText("性别：");
                text_czgrc.setText("证件号：");
                text_czgrd.setText("手机号：");
            }

            zsInfo.DataBean.SSCPInfoBean sscpInfo = sbinfo.getSSCPInfo();
            if(sscpInfo.getMC() != null){
                ll_ssgr.setVisibility(View.VISIBLE);
                text_sscpa.setText("类型："+sscpInfo.getLX());
                text_sscpb.setText("分类："+sscpInfo.getFL());
                text_sscpc.setText("名称："+sscpInfo.getMC());
                text_sscpd.setText("编码："+sscpInfo.getBM());
            }else{
                text_sscpa.setText("类型：");
                text_sscpb.setText("分类：");
                text_sscpc.setText("名称：");
                text_sscpd.setText("编码：");
            }

        }

    }

    @Override
    public void onClick(View v) {
finish();
    }
}
