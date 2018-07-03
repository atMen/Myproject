package customer.tcrj.com.myproject.adpater;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.bean.qycx;
import customer.tcrj.com.myproject.bean.scbzInfo;


/**
 * desc: .
 * author: Will .
 * date: 2017/9/27 .
 */
public class qycxListAdapter extends BaseQuickAdapter<qycx.DataBean, BaseViewHolder>{
    private Context mContext;

    public qycxListAdapter(@Nullable List<qycx.DataBean> data, Context context) {
        super(R.layout.item_qylist, data);
        this.mContext = context;
    }


    @Override
    protected void convert(BaseViewHolder helper, qycx.DataBean item) {
        qycx.DataBean.QyxxBean qyxx = item.getQyxx();
        if(qyxx != null){
            helper.setText(R.id.tv_time, "企业名称："+item.getQyxx().getQYMC());
            helper.setText(R.id.tv_content, "统一社会信用代码："+item.getQyxx().getTYSHXYDM());
        }else{
            helper.setText(R.id.tv_time, "企业名称：");
            helper.setText(R.id.tv_content, "统一社会信用代码：");
        }
        helper.setText(R.id.tv_author, item.getMC());
        String rdjg = item.getRDJG();
        Log.e("TAG","rdjg:"+rdjg);
        if(rdjg != null){
            helper.setText(R.id.tv_phone, "认定机关："+rdjg);
        }

        String jclb = item.getJCLB();
        Log.e("TAG","rdjg:"+jclb);
        if(jclb != null){
            helper.setText(R.id.tv_phone, "奖罚类别："+jclb);
        }


    }
}
