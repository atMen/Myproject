package customer.tcrj.com.myproject.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.bean.qyListInfo;
import customer.tcrj.com.myproject.bean.shebeiInfo;

public class qyListInfoActivity extends BaseActivity {

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

    @BindView(R.id.txtTitle)
    TextView txtTitle;
    @BindView(R.id.btnback)
    ImageView btnback;



    private qyListInfo.DataBean dataBean1 =null;

    @Override
    protected int setLayout() {
        return R.layout.activity_qy_list_info;
    }

    @Override
    protected void setView() {
         dataBean1= (qyListInfo.DataBean) getIntent().getSerializableExtra("qyinfo");
        btnback.setOnClickListener(this);
    }

    @Override
    protected void setData() {
        txtTitle.setText("企业详情");
        textw.setVisibility(View.GONE);
        textx.setVisibility(View.GONE);
        if(dataBean1 != null){
            texta.setText(dataBean1.getQYMC());
            textb.setText(""+dataBean1.getZT());
            textc.setText(""+dataBean1.getWZ());
            textd.setText(""+dataBean1.getFDDBRXM());
            texte.setText(""+dataBean1.getDHHM());
            textf.setText(""+dataBean1.getZCZJ());
            textg.setText(""+dataBean1.getZCDZ());
            texth.setText(""+dataBean1.getCLRQ());
            texti.setText(""+dataBean1.getJYFW());
            textj.setText(""+dataBean1.getJYQXZI());
            textk.setText(""+dataBean1.getJYQXZHI());
            textl.setText(""+dataBean1.getFDCBRZJLX());
            textm.setText(""+dataBean1.getFDDBRZJHM());
            textn.setText(""+dataBean1.getZZJGDM());
            texto.setText(""+dataBean1.getDJGLBMMC());
            textp.setText(""+dataBean1.getZCDZXZQHDM());
            textq.setText(""+dataBean1.getZCDZYZBM());
            textr.setText(""+dataBean1.getSCJYDZXZQHDM());
            texts.setText(""+dataBean1.getTYSHXYDM());
            textt.setText(""+dataBean1.getZXJG());
            textu.setText(""+dataBean1.getZXRQ());
            textv.setText(""+dataBean1.getZXYY());
//            textw.setText("企业名称："+dataBean1.getQYMC());
        }

    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
