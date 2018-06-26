package customer.tcrj.com.myproject.adpater;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.bean.jlqjInfo;
import customer.tcrj.com.myproject.bean.qyListInfo;
import customer.tcrj.com.myproject.bean.shebeiInfo;


/**
 * desc: .
 * author: Will .
 * date: 2017/9/27 .
 */
public class QjListAdapter extends BaseQuickAdapter<jlqjInfo.DataBean, BaseViewHolder>{
    private Context mContext;

    public QjListAdapter(@Nullable List<jlqjInfo.DataBean> data, Context context) {
        super(R.layout.item_qylist, data);
        this.mContext = context;
    }


    @Override
    protected void convert(BaseViewHolder helper, jlqjInfo.DataBean item) {

//        TODO：get到的值为int时要转成String，否则会报错
        jlqjInfo.DataBean.ZJCPInfoBean scdwInfo = item.getZJCPInfo();

        helper.setText(R.id.tv_author, scdwInfo.getMC());
        helper.setText(R.id.tv_time, "设备分类："+scdwInfo.getFL()+"");
        helper.setText(R.id.tv_content, "设备编号："+scdwInfo.getBM());
        helper.setText(R.id.tv_phone,"规格型号："+scdwInfo.getGGXH());
    }
}
