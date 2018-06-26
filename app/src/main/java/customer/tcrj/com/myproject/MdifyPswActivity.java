package customer.tcrj.com.myproject;


import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.tsy.sdk.myokhttp.MyOkHttp;
import com.tsy.sdk.myokhttp.response.GsonResponseHandler;

import butterknife.BindView;
import customer.tcrj.com.myproject.Utils.ACache;
import customer.tcrj.com.myproject.Utils.Utils;
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.bean.loginInfo;
import customer.tcrj.com.myproject.bean.xgPsw;
import customer.tcrj.com.myproject.first.jycpListActivity;
import customer.tcrj.com.myproject.net.ApiConstants;

public class MdifyPswActivity extends BaseActivity {

    @BindView(R.id.edt_Account)
    public EditText edt_Account;

    @BindView(R.id.edt_Password)
    public EditText edt_Password;

    @BindView(R.id.edt_Password2)
    public EditText edt_Password2;

    @BindView(R.id.btn_true)
    public Button btn_true;

    @BindView(R.id.txtTitle)
    public TextView txtTitle;

    @BindView(R.id.btnback)
    public ImageView btnback;


    private MyOkHttp mMyOkhttp;

    @Override
    protected int setLayout() {
        return R.layout.activity_mdify_psw;
    }

    @Override
    protected void setView() {
        mMyOkhttp = MyApp.getInstance().getMyOkHttp();
        btn_true.setOnClickListener(this);
        btnback.setOnClickListener(this);
        txtTitle.setText("修改密码");
    }

    @Override
    protected void setData() {
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_true:
                isOk();
                break;
            case R.id.btnback:
                finish();
                break;
        }
    }



    public void getDataFromNet(String psw1, String psw2, String psw3) {
        String Key = ACache.get(this).getAsString("Key");
        String userid = ACache.get(this).getAsString("userid");


        mMyOkhttp.post()
                .url(ApiConstants.mdifyPswApi+Key)
                .addParam("UserName",userid)
                .addParam("OLDPWD",psw1)
                .addParam("NEWPWD",psw2)
                .enqueue(new GsonResponseHandler<xgPsw>() {
                    @Override
                    public void onFailure(int statusCode, String error_msg) {
                        Toast.makeText(MdifyPswActivity.this, error_msg, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onSuccess(int statusCode, xgPsw response) {

                        int stat = response.getStat();
                        Log.e("TAG","stat:"+stat);
                        Toast.makeText(MdifyPswActivity.this, response.getMsg(), Toast.LENGTH_SHORT).show();
                        if(stat == 101){
                            Utils.toLogin(MdifyPswActivity.this);
                        }else if(stat == 1){
                            Utils.toLogin(MdifyPswActivity.this);
                        }

                    }
                });
    }

    //信息输入是否符合规格
    private void isOk() {
        String psw1 = edt_Account.getText().toString();
        String psw2 = edt_Password.getText().toString();
        String psw3 = edt_Password2.getText().toString();

        if(psw1.equals("") || psw2.equals("") || psw3.equals("")){
            Toast.makeText(this, "请将数据填写完整", Toast.LENGTH_SHORT).show();
        }else if(!psw2.equals(psw3)){
            Toast.makeText(this, "新密码输入不一致", Toast.LENGTH_SHORT).show();
        }else {
            getDataFromNet(psw1,psw2,psw3);
        }


    }
}
