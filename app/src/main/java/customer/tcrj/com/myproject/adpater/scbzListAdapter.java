package customer.tcrj.com.myproject.adpater;

import android.content.Context;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.bean.flfgInfo;
import customer.tcrj.com.myproject.bean.jlqjInfo;
import customer.tcrj.com.myproject.bean.scbzInfo;


/**
 * desc: .
 * author: Will .
 * date: 2017/9/27 .
 */
public class scbzListAdapter extends BaseQuickAdapter<scbzInfo.DataBean, BaseViewHolder>{
    private Context mContext;

    public scbzListAdapter(@Nullable List<scbzInfo.DataBean> data, Context context) {
        super(R.layout.item_qylist, data);
        this.mContext = context;
    }


    @Override
    protected void convert(BaseViewHolder helper, scbzInfo.DataBean item) {



        helper.setText(R.id.tv_author, item.getBZMC());
        helper.setText(R.id.tv_time, "标准编码："+item.getBZBM());
        helper.setText(R.id.tv_content, "发布时间："+item.getPublishTime());
        helper.setText(R.id.tv_phone,"当前状态："+item.getStatusName());

//        helper.setText(R.id.tv_author, item.getBZBM());
//        helper.setText(R.id.tv_time, item.getBZBM());
//        helper.setText(R.id.tv_content, item.getPublishTime());
//        helper.setText(R.id.tv_phone, item.getStatusName());
    }
}
