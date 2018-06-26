package customer.tcrj.com.myproject.base;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.Utils.AppManager;
import customer.tcrj.com.myproject.Utils.DialogHelper;
import customer.tcrj.com.myproject.widget.MultiStateView;
import customer.tcrj.com.myproject.widget.SimpleMultiStateView;

/**
 * Created by leict on 2018/3/23.
 */

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    @Nullable
    @BindView(R.id.SimpleMultiStateView)
    SimpleMultiStateView mSimpleMultiStateView;

    protected Dialog mLoadingDialog = null;
    protected View mRootView;
    Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mRootView = createView(null, null, savedInstanceState);
        setContentView(mRootView);

        AppManager.getAppManager().addActivity(this);
        mLoadingDialog = DialogHelper.getLoadingDialog(this);
        setView();
        initStateView();
        setData();

    }

    public View createView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = getLayoutInflater().inflate(setLayout(), container);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }


    private void initStateView() {
        if (mSimpleMultiStateView == null) return;
        mSimpleMultiStateView.setEmptyResource(R.layout.view_empty)
                .setRetryResource(R.layout.view_retry)
                .setLoadingResource(R.layout.view_loading)
                .setNoNetResource(R.layout.view_nonet)
                .build()
                .setonReLoadlistener(new MultiStateView.onReLoadlistener() {
                    @Override
                    public void onReload() {
                        onRetry();
                    }
                });
    }

    public void showLoading() {
        if (mSimpleMultiStateView != null) {
            mSimpleMultiStateView.showLoadingView();

        }
    }
    public void showEmptyView() {
        if (mSimpleMultiStateView != null) {
            mSimpleMultiStateView.showEmptyView();

        }
    }
    public void showSuccess() {
        if (mSimpleMultiStateView != null) {
            mSimpleMultiStateView.showContent();
        }
    }

    public void showFaild() {
        if (mSimpleMultiStateView != null) {
            mSimpleMultiStateView.showErrorView();
        }
    }

    public void showNoNet() {
        if (mSimpleMultiStateView != null) {
            mSimpleMultiStateView.showNoNetView();
        }
    }


    public void onRetry(){};
    /**
     * 绑定布局
     * @return
     */
    protected abstract int  setLayout();

    /**
     * 初始化组件
     */
    protected abstract void setView();

    /**
     * 设置数据等逻辑代码
     */
    protected abstract void setData();

    /**
     * 简化findViewById()
     * @param resId
     * @param <T>
     * @return
     */
    protected <T extends View> T fvbi(int resId){
        return (T) findViewById(resId);
    }

    /**
     * Intent跳转
     * @param context
     * @param clazz
     */
    protected void toClass(Context context, Class<? extends BaseActivity> clazz){
        toClass(context,clazz,null);
    }

    /**
     * Intent带值跳转
     * @param context
     * @param clazz
     * @param bundle
     */
    protected void toClass(Context context, Class clazz, Bundle bundle){

        Intent intent = new Intent(context,clazz);
        if(bundle != null){
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }

    /**
     * 带返回值的跳转
     * @param context
     * @param clazz
     * @param bundle
     * @param reuqestCode
     */
    protected void toClass(Context context, Class<? extends BaseActivity> clazz, Bundle bundle, int reuqestCode){
        Intent intent = new Intent(context,clazz);
        intent.putExtras(bundle);
        startActivityForResult(intent,reuqestCode);
    }

    protected void showLoadingDialog() {
        if (mLoadingDialog != null)
            mLoadingDialog.show();
    }

    protected void showLoadingDialog(String str) {
        if (mLoadingDialog != null) {
            TextView tv = (TextView) mLoadingDialog.findViewById(R.id.tv_load_dialog);
            tv.setText(str);
            mLoadingDialog.show();
        }
    }

    protected void hideLoadingDialog() {
        if (mLoadingDialog != null && mLoadingDialog.isShowing()) {
            mLoadingDialog.dismiss();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
        AppManager.getAppManager().finishActivity(this); //从栈中移除
    }

}
