package customer.tcrj.com.myproject.adpater;

import android.content.Context;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.bean.jycpInfo;
import customer.tcrj.com.myproject.bean.peopleInfo;


/**
 * desc: .
 * author: Will .
 * date: 2017/9/27 .
 */
public class jycpListAdapter extends BaseQuickAdapter<jycpInfo.DataBean, BaseViewHolder>{
    private Context mContext;

    public jycpListAdapter(@Nullable List<jycpInfo.DataBean> data, Context context) {
        super(R.layout.item_qylist, data);
        this.mContext = context;
    }


    @Override
    protected void convert(BaseViewHolder helper, jycpInfo.DataBean item) {
        jycpInfo.DataBean.ZJCPInfoBean zjcpInfo = item.getZJCPInfo();
        if(zjcpInfo != null){
            helper.setText(R.id.tv_time, "产品编码："+zjcpInfo.getBM());
            jycpInfo.DataBean.ZJCPInfoBean.SCDWInfoBean scdwInfo = zjcpInfo.getSCDWInfo();
            if(scdwInfo.getQYMC() != null){
                helper.setText(R.id.tv_phone, "生产单位："+scdwInfo.getQYMC());
            }else{
                helper.setText(R.id.tv_phone, "生产单位：");
            }

        }

        helper.setText(R.id.tv_author, item.getZJCPInfo().getMC());
        helper.setText(R.id.tv_content, "生产日期："+item.getSCRQ());



    }
}
