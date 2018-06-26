package customer.tcrj.com.myproject.first;


import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.base.BaseActivity;

public class QyInfoActivity extends BaseActivity {

    @BindView(R.id.rl_01)
    RelativeLayout rl01;
    @BindView(R.id.rl_02)
    RelativeLayout rl02;
    @BindView(R.id.rl_03)
    RelativeLayout rl03;
    @BindView(R.id.rl_04)
    RelativeLayout rl04;
    @BindView(R.id.rl_05)
    RelativeLayout rl05;
    @BindView(R.id.rl_06)
    RelativeLayout rl06;
    @BindView(R.id.rl_07)
    RelativeLayout rl07;
    @BindView(R.id.rl_08)
    RelativeLayout rl08;

    @BindView(R.id.txtTitle)
    TextView txtTitle;

    @BindView(R.id.btnback)
    ImageView btnback;

    @Override
    protected int setLayout() {
        return R.layout.activity_qy_info;
    }

    @Override
    protected void setView() {
        txtTitle.setText("企业信息服务");
        btnback.setOnClickListener(this);
        rl01.setOnClickListener(this);
        rl02.setOnClickListener(this);
        rl03.setOnClickListener(this);
        rl04.setOnClickListener(this);
        rl05.setOnClickListener(this);
        rl06.setOnClickListener(this);
        rl07.setOnClickListener(this);
        rl08.setOnClickListener(this);
    }

    @Override
    protected void setData() {

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btnback:
                finish();
                break;

            case R.id.rl_01:
                toClass(this,qyListActivity.class);//企业基本信息
                break;
            case R.id.rl_02:
                toClass(this,jycpListActivity.class);//产品
                break;
            case R.id.rl_03:
                toClass(this,peopleListActivity.class);//人员
                break;
            case R.id.rl_04:
                toClass(this,zsListActivity.class);//证书
                break;
            case R.id.rl_05:
                toClass(this,sbListActivity.class);//设备
                break;
            case R.id.rl_06:
                toClass(this,qjListActivity.class);//器具
                break;
            case R.id.rl_07:
                toClass(this,jcListActivity.class);//检验检测信息
                break;
            case R.id.rl_08:
                toClass(this,scbzListActivity.class);//生产标准
                break;
        }
    }
}
