package customer.tcrj.com.myproject.mine;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.pgyersdk.javabean.AppBean;
import com.pgyersdk.update.PgyUpdateManager;
import com.pgyersdk.update.UpdateManagerListener;

import butterknife.BindView;
import customer.tcrj.com.myproject.MainActivity;
import customer.tcrj.com.myproject.MdifyPswActivity;
import customer.tcrj.com.myproject.OtherLoginAct;
import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.Utils.ACache;
import customer.tcrj.com.myproject.Utils.AppManager;
import customer.tcrj.com.myproject.WelcomeActivity;
import customer.tcrj.com.myproject.base.BaseFragment;
import customer.tcrj.com.myproject.checkUpdata.SweetAlertDialog;
import customer.tcrj.com.myproject.checkUpdata.UpdateManager;


/**
 * Created by leict on 2018/3/22.
 */

public class MineFragment extends BaseFragment implements View.OnClickListener {

    @BindView(R.id.modify_psw)
    public RelativeLayout rl_modify_psw;

    @BindView(R.id.rl_about)
    public RelativeLayout rl_about;

    @BindView(R.id.rl_zx)
    public RelativeLayout rl_zx;

    @BindView(R.id.rl_zxgx)
    public RelativeLayout rl_zxgx;

    @Override
    protected int setLayout() {
        return R.layout.mine_fragment;
    }

    @Override
    protected void setView() {
        rl_modify_psw.setOnClickListener(this);
        rl_about.setOnClickListener(this);
        rl_zx.setOnClickListener(this);
        rl_zxgx.setOnClickListener(this);
    }

    @Override
    protected void setData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.modify_psw:
                toClass(mContext,MdifyPswActivity.class);
                break;
            case R.id.rl_about:
                break;
            case R.id.rl_zxgx:
                init();
                break;
            case R.id.rl_zx:
                showUpdateDialog();
                break;
        }
    }

    private void init() {
        showLoadingDialog("正在检测更新..");
        PgyUpdateManager.setIsForced(true); //设置是否强制更新。true为强制更新；false为不强制更新（默认值）。
        PgyUpdateManager.register(getActivity(),
                new UpdateManagerListener() {

                    @Override
                    public void onUpdateAvailable(final String result) {

                        // 将新版本信息封装到AppBean中
                        final AppBean appBean = getAppBeanFromString(result);
                        new AlertDialog.Builder(getActivity())
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
                                                        getActivity(),
                                                        appBean.getDownloadURL());
                                            }
                                        }).show();
                    }

                    @Override
                    public void onNoUpdateAvailable() {
                        hideLoadingDialog();
                        Toast.makeText(mContext, "当前为最新版本", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void showUpdateDialog() {

/*		Intent intent = new Intent();
        intent.setClass(mContext, IsDownLoad.class);
		mContext.startActivity(intent);*/
        final SweetAlertDialog sad = new SweetAlertDialog(mContext);
        sad.setTitleText("注销登录");
        sad.setContentText("您确定要进行注销操作吗？");
        sad.setConfirmText("确定");
        sad.setCancelText("取消");
        sad.setCanceledOnTouchOutside(true);
        sad.setCancelable(true);
        sad.setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sweetAlertDialog) {
                sad.dismiss();


            }
        });
        sad.setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
            @Override
            public void onClick(SweetAlertDialog sweetAlertDialog) {
                sureZX();
                sad.dismiss();

            }
        });
        sad.show();
    }

    private void sureZX() {
        AppManager.getAppManager().finishAllActivity();
        ACache.get(mContext).clear();
        goLogin();
    }

    private void goLogin() {
        Intent intent = new Intent(mContext, OtherLoginAct.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    /**
     * 检查最新版本
     *
     * @return
     */
    private void CheckUpdate() {
        UpdateManager um = new UpdateManager(mContext);
        um.checkUpdate("", 0);
    }
}
