package customer.tcrj.com.myproject.adpater;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.bean.flfgInfo;
import customer.tcrj.com.myproject.bean.qyListInfo;


/**
 * desc: .
 * author: Will .
 * date: 2017/9/27 .
 */
public class flfgListAdapter extends BaseQuickAdapter<flfgInfo.DataBean, BaseViewHolder>{
    private Context mContext;

    public flfgListAdapter(@Nullable List<flfgInfo.DataBean> data, Context context) {
        super(R.layout.item_qylist, data);
        this.mContext = context;
    }


    @Override
    protected void convert(BaseViewHolder helper, flfgInfo.DataBean item) {
        helper.setText(R.id.tv_author, "目录名称："+item.getMenuName());
        helper.setText(R.id.tv_time, "法规标题："+item.getTitle());
        helper.setText(R.id.tv_content, "发文字号："+item.getPublishMessage());
        helper.setText(R.id.tv_phone, "状态："+item.getStatus());
    }
}
