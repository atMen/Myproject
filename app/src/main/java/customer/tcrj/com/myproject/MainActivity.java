package customer.tcrj.com.myproject;

import android.*;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.pgyersdk.crash.PgyCrashManager;
import com.pgyersdk.javabean.AppBean;
import com.pgyersdk.update.PgyUpdateManager;
import com.pgyersdk.update.UpdateManagerListener;
import com.tbruyelle.rxpermissions2.RxPermissions;

import customer.tcrj.com.myproject.Utils.AppManager;
import customer.tcrj.com.myproject.first.FirstFragment;
import customer.tcrj.com.myproject.message.MessageFragment;
import customer.tcrj.com.myproject.mine.MineFragment;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private FragmentManager fragmentManager;
    private MineFragment mineFragment;
    private FirstFragment newsFragment;
    private MessageFragment messageFragment;

    private TextView poiat;
    boolean fromPush;
    public boolean isgx = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initprermmission();
        init();
        AppManager.getAppManager().addActivity(this);
        fromPush = getIntent().getBooleanExtra("fromPush", false);
        initview();
    }

    private void initprermmission() {
        // 清空图片缓存，包括裁剪、压缩后的图片 注意:必须要在上传完成后调用 必须要获取权限
        RxPermissions permissions = new RxPermissions(this);
        permissions.request(android.Manifest.permission.WRITE_EXTERNAL_STORAGE).subscribe(new Observer<Boolean>() {
            @Override
            public void onSubscribe(Disposable d) {
            }

            @Override
            public void onNext(Boolean aBoolean) {

                isgx = aBoolean;
                if (aBoolean) {

                } else {

                }
            }

            @Override
            public void onError(Throwable e) {
            }

            @Override
            public void onComplete() {
            }
        });
    }

    private void init() {
        PgyUpdateManager.setIsForced(true); //设置是否强制更新。true为强制更新；false为不强制更新（默认值）。
        PgyUpdateManager.register(MainActivity.this,
                new UpdateManagerListener() {

                    @Override
                    public void onUpdateAvailable(final String result) {

                        // 将新版本信息封装到AppBean中
                        final AppBean appBean = getAppBeanFromString(result);
                        new AlertDialog.Builder(MainActivity.this)
                                .setTitle("更新")
                                .setMessage(appBean.getReleaseNote())
                                .setNegativeButton(
                                        "确定",
                                        new DialogInterface.OnClickListener() {

                                            @Override
                                            public void onClick(



                                                    DialogInterface dialog,
                                                    int which) {
                                                startDownloadTask(
                                                        MainActivity.this,
                                                        appBean.getDownloadURL());
                                            }
                                        }).show();
                    }

                    @Override
                    public void onNoUpdateAvailable() {
                    }
                });
    }

    private void initview() {
        fragmentManager = getFragmentManager();
        BottomNavigationView navigationView = (BottomNavigationView) findViewById(R.id.bnve);

        //获取整个的NavigationView
        BottomNavigationMenuView menuView = (BottomNavigationMenuView) navigationView.getChildAt(0);

        //这里就是获取所添加的每一个Tab，
        View tab = menuView.getChildAt(1);
        BottomNavigationItemView itemView = (BottomNavigationItemView) tab;

        //加载我们的角标View，新创建的一个布局
        View badge = LayoutInflater.from(this).inflate(R.layout.menu_badge, menuView, false);
        poiat = (TextView) badge.findViewById(R.id.tv_msg_count);
        //添加到Tab上
//        itemView.addView(badge);

        navigationView.setOnNavigationItemSelectedListener(this);

        setTabSelection(0);


    }

    private int num = -1;
    private void setTabSelection(int index) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        hideFragments(transaction);
        switch (index) {
            case 0:
                    if (newsFragment == null) {
                        newsFragment = new FirstFragment();
                        transaction.add(R.id.contentContainer, newsFragment);
                    } else {
                        transaction.show(newsFragment);
                    }


                break;
            case 1:
                    if (messageFragment == null) {
                        messageFragment = new MessageFragment();
                        transaction.add(R.id.contentContainer, messageFragment);
                    } else {
                        transaction.show(messageFragment);
                }
                break;
            case 2:
                    if (mineFragment == null) {
                        mineFragment = new MineFragment();
                        transaction.add(R.id.contentContainer, mineFragment);
                    } else {
                        transaction.show(mineFragment);
                }
                break;

        }
        transaction.commit();
    }

    private void hideFragments(FragmentTransaction transaction) {
        if (mineFragment != null) {
            transaction.hide(mineFragment);
        }
        if (newsFragment != null) {
            transaction.hide(newsFragment);
        }
        if (messageFragment != null) {
            transaction.hide(messageFragment);
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_music:

                if(num != 0){
                    setTabSelection(0);
                }

                num = 0;
                return true;

            case R.id.menu_backup:

//                poiat.setVisibility(View.GONE);
                if(num != 1) {
                    setTabSelection(1);
                }
                num = 1;

                return true;

            case R.id.menu_friends:
                if(num != 2) {
                    setTabSelection(2);
                }
                num = 2;

                return true;
        }
        return false;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        PgyCrashManager.unregister();
        mHandler.removeCallbacksAndMessages(null);
        AppManager.getAppManager().finishActivity(this); //从栈中移除
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exit();
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void exit() {
        if (!isExit) {
            isExit = true;
            Toast.makeText(getApplicationContext(), "再按一次退出程序",
                    Toast.LENGTH_SHORT).show();
            // 利用handler延迟发送更改状态信息

            mHandler.sendEmptyMessageDelayed(0, 2000);
        } else {
            finish();
//            System.exit(0);
        }
    }

    //定义一个变量，
    //来标识是否退出
    private static boolean isExit = false;
    Handler mHandler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            isExit = false;
        }
    };
}
