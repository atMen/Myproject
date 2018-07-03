package customer.tcrj.com.myproject;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.BindView;
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.bean.qycx;
import customer.tcrj.com.myproject.bean.zsInfo;

public class qycxListInfoActivity extends BaseActivity {

    @BindView(R.id.zs_info)
    public LinearLayout zs_info;



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

    @BindView(R.id.tv_title3)
    TextView title3;
    @BindView(R.id.text_czgra)
    public TextView text_czgra;
    @BindView(R.id.text_czgrb)
    public TextView text_czgrb;
    @BindView(R.id.text_czgrc)
    public TextView text_czgrc;
    @BindView(R.id.text_czgrd)
    public TextView text_czgrd;

    @BindView(R.id.tv_title4)
    TextView title4;
    @BindView(R.id.text_sscpa)
    public TextView text_sscpa;
    @BindView(R.id.text_sscpb)
    public TextView text_sscpb;
    @BindView(R.id.text_sscpc)
    public TextView text_sscpc;
    @BindView(R.id.text_sscpd)
    public TextView text_sscpd;



    @BindView(R.id.txtTitle)
    public TextView txtTitle;
    @BindView(R.id.btnback)
    public ImageView btnback;


    private qycx.DataBean sbinfo =null;

    @Override
    protected int setLayout() {
        return R.layout.activity_zs_list_info;
    }

    @Override
    protected void setView() {
        sbinfo= (qycx.DataBean) getIntent().getSerializableExtra("ycxinfo");
        btnback.setOnClickListener(this);
    }

    @Override
    protected void setData() {
        txtTitle.setText("企业诚信信息详情");
        zs_info.setVisibility(View.GONE);

//        text_syqyc.setVisibility(View.GONE);
//        text_syqyd.setVisibility(View.GONE);

        text_qyc.setVisibility(View.GONE);
        text_qyd.setVisibility(View.GONE);

        text_sscpd.setVisibility(View.GONE);

        title1.setText("企业信息");
        title2.setText("名单信息");
        title3.setText("列入信息");
        title4.setText("移出信息");



        if(sbinfo != null){

            qycx.DataBean.QyxxBean fzjgInfo = sbinfo.getQyxx();
            if(fzjgInfo != null){
                text_syqya.setText("企业名称："+fzjgInfo.getQYMC());
                text_syqyb.setText("法人姓名："+fzjgInfo.getFDDBRXM());
                text_syqyc.setText("法人证件号码："+fzjgInfo.getFDDBRZJHM());
                text_syqyd.setText("统一社会信用代码："+fzjgInfo.getTYSHXYDM());
            }

                text_qya.setText("守（失）信领域："+sbinfo.getMC());
                text_qyb.setText("公示期限："+sbinfo.getGSQX());

                text_czgra.setText("认定机关："+sbinfo.getRDJG());
                text_czgrb.setText("列入文号："+sbinfo.getLRWH());
                text_czgrc.setText("列入日期："+sbinfo.getLRRQ());
                text_czgrd.setText("列入事由："+sbinfo.getLRSY());


                text_sscpa.setText("移出决定机关："+sbinfo.getYCJDJG());
                text_sscpb.setText("移出日期："+sbinfo.getYCRQ());
                text_sscpc.setText("移出原因："+sbinfo.getYCYY());


        }

    }

    @Override
    public void onClick(View v) {
finish();
    }
}
