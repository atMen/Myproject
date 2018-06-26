package customer.tcrj.com.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.multilevel.treelist.Node;
import com.multilevel.treelist.TreeListViewAdapter;
import com.multilevel.treelist.bean;
import com.tsy.sdk.myokhttp.MyOkHttp;
import com.tsy.sdk.myokhttp.response.GsonResponseHandler;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import customer.tcrj.com.myproject.Utils.ACache;
import customer.tcrj.com.myproject.Utils.Utils;
import customer.tcrj.com.myproject.adpater.SimpleTreeAdapter;
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.bean.loginInfo;
import customer.tcrj.com.myproject.first.zsListActivity;
import customer.tcrj.com.myproject.net.ApiConstants;

public class LxActivity extends BaseActivity {

    @BindView(R.id.lv_tree)
    public ListView mTree;
    @BindView(R.id.txtTitle)
    public TextView title;
    @BindView(R.id.btnback)
    ImageView btnback;
    @BindView(R.id.tv_currentstatenumber)
    public TextView tv_currentstatenumber;


    protected List<Node> mDatas = new ArrayList<Node>();

    private MyOkHttp mMyOkhttp;
    private String key;
    private String path;

    private TreeListViewAdapter mAdapter;

    @Override
    protected int setLayout() {
        return R.layout.activity_lx;
    }

    @Override
    protected void setView() {
        mMyOkhttp = MyApp.getInstance().getMyOkHttp();
        tv_currentstatenumber.setVisibility(View.VISIBLE);
        title.setText("类型");
        tv_currentstatenumber.setText("确定");
        tv_currentstatenumber.setOnClickListener(this);
        btnback.setOnClickListener(this);
    }

    @Override
    protected void setData() {
        path = getIntent().getStringExtra("path");
        key = ACache.get(this).getAsString("Key");
        getDatafromNet();

//        mTree.setAdapter(mAdapter);

    }

    private void getDatafromNet() {
        Log.e("TAG","获取类型数据");
        showLoadingDialog();

        mMyOkhttp.post()
                .url(ApiConstants.lxlistApi+key)
                .addParam("Path",path)
                .enqueue(new GsonResponseHandler<bean>() {
                    @Override
                    public void onFailure(int statusCode, String error_msg) {
                        Log.e("TAG","失败");
                        hideLoadingDialog();
                        Toast.makeText(LxActivity.this, "服务器连接错误", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onSuccess(int statusCode, bean response) {


                        mDatas = response.getData();





                        if(response.getStat() == null){

                            mDatas.add(0,new Node("-1", "-1", "全部信息"));
                            Log.e("TAG","成功"+mDatas.get(0).getName());

                            mAdapter = new SimpleTreeAdapter(mTree, LxActivity.this,
                                    mDatas, 0,R.mipmap.tree_ex,R.mipmap.tree_ec);
                            mTree.setAdapter(mAdapter);


                        }else{

                            if(response.getStat().equals("101")){
                                Utils.toLogin(LxActivity.this);
                            }
                        }

                    }
                });
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.tv_currentstatenumber:
                clickShow();

                break;

            case R.id.btnback:
                finish();
                break;
        }
    }


    /**
     * 显示选中数据
     */
    public void clickShow() {
        final List<Node> allNodes = mAdapter.getAllNodes();
        String id = null;
        String code = null;
        for (int i = 0; i < allNodes.size(); i++) {
            if (allNodes.get(i).isChecked()) {
//                Toast.makeText(this, allNodes.get(i).getId()+"", Toast.LENGTH_SHORT).show();
                id = allNodes.get(i).getId()+"";
                code = allNodes.get(i).getDataCode()+"";
                back(id,code);
                return;
            }
        }



    }

    private void back(String id,String code) {
        Intent intent=new Intent();
        intent.putExtra("id",id);
        intent.putExtra("datacode",code);
        setResult(RESULT_OK,intent);
        finish();
    }

}
