package customer.tcrj.com.myproject.adpater;

import android.content.Context;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.bean.scbzInfo;
import customer.tcrj.com.myproject.bean.xzspInfo;


/**
 * desc: .
 * author: Will .
 * date: 2017/9/27 .
 */
public class xzspListAdapter extends BaseQuickAdapter<xzspInfo.DataBean, BaseViewHolder>{
    private Context mContext;

    public xzspListAdapter(@Nullable List<xzspInfo.DataBean> data, Context context) {
        super(R.layout.item_qylist, data);
        this.mContext = context;
    }


    @Override
    protected void convert(BaseViewHolder helper, xzspInfo.DataBean item) {
        helper.setText(R.id.tv_author, item.getSQDWInfo().getQYMC());
        helper.setText(R.id.tv_time, "事项名称："+item.getSXMC()+"");
        helper.setText(R.id.tv_content, "当前状态："+item.getDQZT());
        helper.setText(R.id.tv_phone, "办结状态："+item.getBJZT());
    }
}
