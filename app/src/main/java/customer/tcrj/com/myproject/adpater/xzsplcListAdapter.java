package customer.tcrj.com.myproject.adpater;

import android.content.Context;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.bean.qycx;
import customer.tcrj.com.myproject.bean.sweetInfo;
import customer.tcrj.com.myproject.bean.xzspLCInfo;


/**
 * desc: .
 * author: Will .
 * date: 2017/9/27 .
 */
public class xzsplcListAdapter extends BaseQuickAdapter<xzspLCInfo.DataBean, BaseViewHolder>{
    private Context mContext;

    public xzsplcListAdapter(@Nullable List<xzspLCInfo.DataBean> data, Context context) {
        super(R.layout.item_jdlclist, data);
        this.mContext = context;
    }


    @Override
    protected void convert(BaseViewHolder helper, xzspLCInfo.DataBean item) {



        helper.setText(R.id.tv_author, "节点名称："+item.getJDMC());
        helper.setText(R.id.tv_phone, "接入人员："+item.getJRRY());
        helper.setText(R.id.tv_time, "接入时间："+item.getJRSJ());
        helper.setText(R.id.tv_content, "节点状态："+item.getZT()+"");
        helper.setText(R.id.tv_blsj, "办理时间："+item.getBLSJ());
        helper.setText(R.id.tv_blr, "办理人员："+item.getBLR());
        helper.setText(R.id.tv_bljg, "办理结果："+item.getBLJG());
    }
}
