package customer.tcrj.com.myproject;

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.zhouwei.mzbanner.MZBannerView;
import com.zhouwei.mzbanner.holder.MZHolderCreator;
import com.zhouwei.mzbanner.holder.MZViewHolder;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import customer.tcrj.com.myproject.Utils.ACache;
import customer.tcrj.com.myproject.base.BaseActivity;

public class GuideActivity extends BaseActivity {

    public static final int[] BANNER = new int[]{R.mipmap.banner1, R.mipmap.banner2, R.mipmap.banner3};

    @BindView(R.id.banner)
    MZBannerView banner;
    @BindView(R.id.btn_guide)
    Button btnguide;


    @Override
    protected int setLayout() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);// 隐藏标题
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);// 设置全屏
        return R.layout.activity_guide;
    }

    @Override
    protected void setView() {
        setDBBannerData();
        btnguide.setOnClickListener(this);

        banner.addPageChangeLisnter(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                if(position == 2){
                    btnguide.setVisibility(View.VISIBLE);
                }else{
                    btnguide.setVisibility(View.GONE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    protected void setData() {

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_guide:
                goLogin();
                break;

        }
    }

    private void goLogin() {
        ACache.get(this).put("first","first");
        Intent intent = new Intent(GuideActivity.this, OtherLoginAct.class);
        startActivity(intent);
        finish();
    }

    private void setDBBannerData() {
        List<Integer> bannerList = new ArrayList<>();
        for (int i = 0; i < BANNER.length; i++) {
            bannerList.add(BANNER[i]);
        }
        banner.setIndicatorVisible(false);
        banner.setPages(bannerList, new MZHolderCreator<dbBannerViewHolder>() {
            @Override
            public dbBannerViewHolder createViewHolder() {
                return new dbBannerViewHolder();
            }
        });
    }

    public static class dbBannerViewHolder implements MZViewHolder<Integer> {
        private ImageView mImageView;

        @Override
        public View createView(Context context) {
            // 返回页面布局文件
            View view = LayoutInflater.from(context).inflate(R.layout.banner_item, null);
            mImageView = (ImageView) view.findViewById(R.id.banner_image);
            return view;
        }

        @Override
        public void onBind(Context context, int position, Integer data) {
            //数据绑定
            mImageView.setImageResource(data);
        }
    }
}
