package customer.tcrj.com.myproject.adpater;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.bean.Book;
import customer.tcrj.com.myproject.bean.qyListInfo;
import customer.tcrj.com.myproject.bean.tzInfo;


/**
 * desc: .
 * author: Will .
 * date: 2017/9/27 .
 */
public class FreshNewsAdapter extends BaseQuickAdapter<tzInfo.DataBean, BaseViewHolder>{
    private Context mContext;

    public FreshNewsAdapter(@Nullable List<tzInfo.DataBean> data,Context context) {
        super(R.layout.item_message, data);
        this.mContext = context;
    }
//
//    @Override
//    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
////        View view1 = baseQuickAdapter.getViewByPosition(i,R.id.iv_logo);
////        ReadActivity.launch(mContext, (FreshNewsBean.PostsBean) baseQuickAdapter.getItem(i),view1);
//    }

    @Override
    protected void convert(final BaseViewHolder helper, final tzInfo.DataBean item) {

        TextView title = helper.getView(R.id.tv_title);
        title.setText(item.getTitle());
        helper.getView(R.id.rl_message_list).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickListener.OnItemClick(item);
            }
        });
    }

    private OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {  //定义接口，实现Recyclerview点击事件
        void OnItemClick(tzInfo.DataBean item);
    }


    public void setOnItemRlClickListener(OnItemClickListener onItemClickListener) {//实现点击
        this.onItemClickListener = onItemClickListener;
    }



}
