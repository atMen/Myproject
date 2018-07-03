package customer.tcrj.com.myproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.bean.qycx;

public class qyryListInfoActivity extends BaseActivity {




    @BindView(R.id.tv_title1)
    TextView title1;
    @BindView(R.id.text_fzjga)
    public TextView text_syqya;
    @BindView(R.id.text_fzjgb)
    public TextView text_syqyb;
    @BindView(R.id.text_fzjgc)
    public TextView text_syqyc;
    @BindView(R.id.text_fzjgd)
    public TextView text_syqyd;

    @BindView(R.id.tv_title2)
    TextView title2;
    @BindView(R.id.text_czjga)
    public TextView text_qya;
    @BindView(R.id.text_czjgb)
    public TextView text_qyb;
    @BindView(R.id.text_czjgc)
    public TextView text_qyc;
    @BindView(R.id.text_czjgd)
    public TextView text_qyd;
    @BindView(R.id.text_czjge)
    public TextView text_qye;
    @BindView(R.id.text_czjgf)
    public TextView text_qyf;
    @BindView(R.id.text_czjgg)
    public TextView text_qyg;




    @BindView(R.id.txtTitle)
    public TextView txtTitle;
    @BindView(R.id.btnback)
    public ImageView btnback;


    private qycx.DataBean sbinfo =null;

    @Override
    protected int setLayout() {
        return R.layout.activity_ry_list_info;
    }

    @Override
    protected void setView() {
        sbinfo= (qycx.DataBean) getIntent().getSerializableExtra("ycxinfo");
        btnback.setOnClickListener(this);
    }

    @Override
    protected void setData() {
        txtTitle.setText("企业诚信信息详情");

        title1.setText("企业信息");
        title2.setText("名单信息");




        if(sbinfo != null){

            qycx.DataBean.QyxxBean fzjgInfo = sbinfo.getQyxx();
            if(fzjgInfo != null){
                text_syqya.setText("企业名称："+fzjgInfo.getQYMC());
                text_syqyb.setText("法人姓名："+fzjgInfo.getFDDBRXM());
                text_syqyc.setText("法人证件号码："+fzjgInfo.getFDDBRZJHM());
                text_syqyd.setText("统一社会信用代码："+fzjgInfo.getTYSHXYDM());
            }

            text_qya.setText("荣誉名称："+sbinfo.getMC());
            text_qyb.setText("文号/证书编号："+sbinfo.getWHBH());
            text_qyc.setText("奖惩类别："+sbinfo.getJCLB());
            text_qyd.setText("认定日期："+sbinfo.getPDRQ());
            text_qye.setText("认定单位："+sbinfo.getPDDW());
            text_qyf.setText("地方编码："+sbinfo.getDFBM());
            text_qyg.setText(sbinfo.getRYSXNR());

        }

    }

    @Override
    public void onClick(View v) {
finish();
    }
}
