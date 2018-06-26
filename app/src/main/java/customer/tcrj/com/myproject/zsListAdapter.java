package customer.tcrj.com.myproject;

import android.content.Context;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import customer.tcrj.com.myproject.bean.flfgInfo;
import customer.tcrj.com.myproject.bean.zsInfo;


/**
 * desc: .
 * author: Will .
 * date: 2017/9/27 .
 */
public class zsListAdapter extends BaseQuickAdapter<zsInfo.DataBean, BaseViewHolder>{
    private Context mContext;

    public zsListAdapter(@Nullable List<zsInfo.DataBean> data, Context context) {
        super(R.layout.item_qylist, data);
        this.mContext = context;
    }


    @Override
    protected void convert(BaseViewHolder helper, zsInfo.DataBean item) {
        helper.setText(R.id.tv_author, item.getZSM());
        helper.setText(R.id.tv_time, "证书编号："+item.getZSBH());
        helper.setText(R.id.tv_content, "发证日期："+item.getFZRQ());
        helper.setText(R.id.tv_phone, "有效日期："+item.getYXRQ());
    }
}
