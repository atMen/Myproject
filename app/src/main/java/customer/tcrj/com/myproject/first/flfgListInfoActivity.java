package customer.tcrj.com.myproject.first;

import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.Utils.Utils;
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.bean.flfgInfo;
import customer.tcrj.com.myproject.bean.qyListInfo;

public class flfgListInfoActivity extends BaseActivity {

    @BindView(R.id.fg_texta)
    public TextView texta;
    @BindView(R.id.fg_textb)
    public TextView textb;
    @BindView(R.id.fg_textc)
    public TextView textc;
    @BindView(R.id.fg_textd)
    public TextView textd;
    @BindView(R.id.fg_texte)
    public TextView texte;
    @BindView(R.id.fg_textf)
    public TextView textf;
    @BindView(R.id.fg_textg)
    public TextView textg;
    @BindView(R.id.webView)
    public WebView webview;
    @BindView(R.id.txtTitle)
    TextView title;
    @BindView(R.id.btnback)
    ImageView btnback;

    private flfgInfo.DataBean dataBean1 =null;

    @Override
    protected int setLayout() {
        return R.layout.activity_flfg_list_info;
    }

    @Override
    protected void setView() {
         dataBean1= (flfgInfo.DataBean) getIntent().getSerializableExtra("flfginfo");
        btnback.setOnClickListener(this);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
    }

    @Override
    protected void setData() {
        title.setText("法律法规信息详情");
        if(dataBean1 != null){
                        String content = dataBean1.getContent();

                        if(content != null){
                            String newContent = Utils.getNewContent(content);
                            webview.loadData(newContent, "text/html; charset=UTF-8", null);
            }

            texta.setText("目录："+dataBean1.getMenuName());
            textb.setText("状态："+dataBean1.getStatus());
            textc.setText("法规标题："+dataBean1.getTitle());
            textd.setText("发文字号："+dataBean1.getPublishMessage());
            texte.setText("法规来源："+dataBean1.getSource());
            textf.setText("颁布单位："+dataBean1.getIssueOrgan());
            textg.setText("颁布时间："+dataBean1.getIssueTime());

        }

    }

    @Override
    public void onClick(View v) {

        finish();
    }
}
