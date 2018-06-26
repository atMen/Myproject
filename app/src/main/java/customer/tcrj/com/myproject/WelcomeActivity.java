package customer.tcrj.com.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

import customer.tcrj.com.myproject.Utils.ACache;
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.widget.SimpleMultiStateView;

public class WelcomeActivity extends BaseActivity {

    private Timer timer;
    private String key;
    private String first;

    @Override
    protected int setLayout() {
        return R.layout.activity_welcome;
    }

    @Override
    protected void setView() {
    }

    @Override
    protected void setData() {
        key = ACache.get(this).getAsString("Key");
        first = ACache.get(this).getAsString("first");

        Log.e("TAG","key:"+key);
        timer = new Timer();
        try {
            TimerTask task = new TimerTask() {
                @Override
                public void run() {

                    if(first != null){
                        if(key != null){
                            goMain();
                        }else{
                            goLogin();
                        }
                    }else{
                        goGuide();
                    }



                }
            };
            timer.schedule(task, 3000);
        } catch (Exception e) {
            goLogin();
        }
    }

    private void goGuide() {
        Intent intent = new Intent(WelcomeActivity.this, GuideActivity.class);
        startActivity(intent);
        finish();
    }

    private void goMain() {
        Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onClick(View v) {

    }

    private void goLogin() {
        Intent intent = new Intent(WelcomeActivity.this, OtherLoginAct.class);
        startActivity(intent);
        finish();
    }


}
