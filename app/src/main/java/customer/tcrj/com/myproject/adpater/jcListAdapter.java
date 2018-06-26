package customer.tcrj.com.myproject.adpater;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.bean.jcInfo;
import customer.tcrj.com.myproject.bean.qyListInfo;


/**
 * desc: .
 * author: Will .
 * date: 2017/9/27 .
 */
public class jcListAdapter extends BaseQuickAdapter<jcInfo.DataBean, BaseViewHolder>{
    private Context mContext;

    public jcListAdapter(@Nullable List<jcInfo.DataBean> data, Context context) {
        super(R.layout.item_qylist, data);
        this.mContext = context;
    }


    @Override
    protected void convert(BaseViewHolder helper, jcInfo.DataBean item) {

        jcInfo.DataBean.ZJCPInfoBean zjcpInfo = item.getZJCPInfo();
        if(zjcpInfo != null){
            helper.setText(R.id.tv_author, zjcpInfo.getMC());
            String lx = zjcpInfo.getLX();

                helper.setText(R.id.tv_time, "类型："+lx);


        }


        helper.setText(R.id.tv_content, "项目名称："+item.getXMMC());
        String jdjg = item.getJDJG();

            helper.setText(R.id.tv_phone, "检定结果："+jdjg);


    }
}
