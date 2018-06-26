package customer.tcrj.com.myproject.adpater;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.bean.djInfo;
import customer.tcrj.com.myproject.bean.qyListInfo;


/**
 * desc: .
 * author: Will .
 * date: 2017/9/27 .
 */
public class djListAdapter extends BaseQuickAdapter<djInfo.DataBean, BaseViewHolder>{
    private Context mContext;

    public djListAdapter(@Nullable List<djInfo.DataBean> data, Context context) {
        super(R.layout.item_qylist, data);
        this.mContext = context;
    }


    @Override
    protected void convert(BaseViewHolder helper, djInfo.DataBean item) {
        helper.setText(R.id.tv_author, item.getMC());
        helper.setText(R.id.tv_time, "活动类别："+item.getLBName());
        helper.setText(R.id.tv_content, "活动时间："+item.getSJ());
        helper.setText(R.id.tv_phone, "活动地点："+item.getDD());
    }
}
