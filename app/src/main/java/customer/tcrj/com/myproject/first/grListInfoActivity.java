package customer.tcrj.com.myproject.first;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.bean.peopleInfo;
import customer.tcrj.com.myproject.bean.qyListInfo;

public class grListInfoActivity extends BaseActivity {

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

    @BindView(R.id.txtTitle)
    TextView txtTitle;

    @BindView(R.id.btnback)
    ImageView btnback;

//    @BindView(R.id.qy_texts)
//    public TextView texts;
//    @BindView(R.id.qy_textt)
//    public TextView textt;
//    @BindView(R.id.qy_textu)
//    public TextView textu;
//    @BindView(R.id.qy_textv)
//    public TextView textv;
//    @BindView(R.id.qy_textw)
//    public TextView textw;
//    @BindView(R.id.qy_textx)
//    public TextView textx;

    private peopleInfo.DataBean dataBean1 =null;

    @Override
    protected int setLayout() {
        return R.layout.activity_gr_list_info;
    }

    @Override
    protected void setView() {
         dataBean1= (peopleInfo.DataBean) getIntent().getSerializableExtra("grinfo");
         btnback.setOnClickListener(this);
    }

    @Override
    protected void setData() {
        txtTitle.setText("人员信息详情");
        if(dataBean1 != null){
            String xb = dataBean1.getXB();
            texta.setText(""+dataBean1.getXM());
            textb.setText(""+dataBean1.getCYM());


            textc.setText(""+xb);



            textd.setText(""+dataBean1.getJG());
            texte.setText(""+dataBean1.getXL());
            textf.setText(""+dataBean1.getCSNY());
            textg.setText(""+dataBean1.getBYYX());
            texth.setText(""+dataBean1.getSXZY());
            texti.setText(""+dataBean1.getZZMM());
            textj.setText(""+dataBean1.getSJH());
            textk.setText(""+dataBean1.getZJZL());
            textl.setText(""+dataBean1.getZJH());
            textm.setText(""+dataBean1.getYXDZ());
            textn.setText(""+dataBean1.getJZDZ());
            texto.setVisibility(View.GONE);
            textp.setText(""+(dataBean1.isIsExamine()? "是" : "否"));
            textq.setText(""+dataBean1.getZPLJ());
            textq.setVisibility(View.GONE);
            textr.setText(""+dataBean1.getBZ());

        }

    }

    @Override
    public void onClick(View v) {
      finish();
    }
}
