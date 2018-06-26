package customer.tcrj.com.myproject.adpater;

import android.content.Context;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.bean.xzspInfo;
import customer.tcrj.com.myproject.bean.xzzfInfo;


/**
 * desc: .
 * author: Will .
 * date: 2017/9/27 .
 */
public class xzzfListAdapter extends BaseQuickAdapter<xzzfInfo.DataBean, BaseViewHolder>{
    private Context mContext;

    public xzzfListAdapter(@Nullable List<xzzfInfo.DataBean> data, Context context) {
        super(R.layout.item_qylist, data);
        this.mContext = context;
    }


    @Override
    protected void convert(BaseViewHolder helper, xzzfInfo.DataBean item) {
        xzzfInfo.DataBean.SJDWInfoBean sjdwInfo = item.getSJDWInfo();
        if(sjdwInfo != null){
            helper.setText(R.id.tv_author, item.getSJDWInfo().getQYMC());
        }else{
            helper.setText(R.id.tv_author, "受检单位名称：");
        }

        helper.setText(R.id.tv_time, "案件编号："+item.getAJBH());
        helper.setText(R.id.tv_content, "处罚名称："+item.getCFMC());
        helper.setText(R.id.tv_phone, "处罚结果："+item.getCFJIEG());
    }
}
