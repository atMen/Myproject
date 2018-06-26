package customer.tcrj.com.myproject.adpater;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.bean.Book;
import customer.tcrj.com.myproject.bean.qyListInfo;


/**
 * desc: .
 * author: Will .
 * date: 2017/9/27 .
 */
public class QyListAdapter extends BaseQuickAdapter<qyListInfo.DataBean, BaseViewHolder>{
    private Context mContext;

    public QyListAdapter(@Nullable List<qyListInfo.DataBean> data, Context context) {
        super(R.layout.item_qylist, data);
        this.mContext = context;
    }


    @Override
    protected void convert(BaseViewHolder helper, qyListInfo.DataBean item) {
        Log.e("TAG","企业名称："+item.getQYMC());
        helper.setText(R.id.tv_author, item.getQYMC());
        helper.setText(R.id.tv_time, "社会统一信用代码："+item.getTYSHXYDM());
        helper.setText(R.id.tv_content, "注册地址："+item.getZCDZ());
        helper.setText(R.id.tv_phone, "企业状态："+item.getZT());
    }
}
