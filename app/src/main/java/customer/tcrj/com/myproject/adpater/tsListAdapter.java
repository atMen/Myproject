package customer.tcrj.com.myproject.adpater;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.bean.jlqjInfo;
import customer.tcrj.com.myproject.bean.tsjuInfo;


/**
 * desc: .
 * author: Will .
 * date: 2017/9/27 .
 */
public class tsListAdapter extends BaseQuickAdapter<tsjuInfo.DataBean, BaseViewHolder>{
    private Context mContext;

    public tsListAdapter(@Nullable List<tsjuInfo.DataBean> data, Context context) {
        super(R.layout.item_qylist, data);
        this.mContext = context;
    }


    @Override
    protected void convert(BaseViewHolder helper, tsjuInfo.DataBean item) {

//      TODO：get到的值为int时要转成String，否则会报错
        tsjuInfo.DataBean.TSQYInfoBean tsqyInfo = item.getTSQYInfo();
        if(tsqyInfo != null){
            helper.setText(R.id.tv_author, tsqyInfo.getQYMC());
        }

        helper.setText(R.id.tv_time, "举报类型："+item.getTSLX());
        tsjuInfo.DataBean.TSCPInfoBean tscpInfo = item.getTSCPInfo();
        if(tscpInfo != null){
            helper.setText(R.id.tv_content, "产品类型："+tscpInfo.getLX());
        }

        helper.setText(R.id.tv_phone, "办理结果："+item.getBLJG());
    }
}
