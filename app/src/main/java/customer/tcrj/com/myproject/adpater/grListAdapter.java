package customer.tcrj.com.myproject.adpater;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.bean.peopleInfo;
import customer.tcrj.com.myproject.bean.qyListInfo;


/**
 * desc: .
 * author: Will .
 * date: 2017/9/27 .
 */
public class grListAdapter extends BaseQuickAdapter<peopleInfo.DataBean, BaseViewHolder>{
    private Context mContext;

    public grListAdapter(@Nullable List<peopleInfo.DataBean> data, Context context) {
        super(R.layout.item_qylist, data);
        this.mContext = context;
    }


    @Override
    protected void convert(BaseViewHolder helper, peopleInfo.DataBean item) {

        String xb = item.getXB();
        helper.setText(R.id.tv_author, item.getXM());

            helper.setText(R.id.tv_time, "性别："+xb);


        helper.setText(R.id.tv_content, "证件号："+item.getZJH());
        helper.setText(R.id.tv_phone, "手机号："+item.getSJH());
    }
}
