package customer.tcrj.com.myproject.first;

import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.Utils.Utils;
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.bean.djInfo;
import customer.tcrj.com.myproject.bean.scbzInfo;

public class scbzListInfoActivity extends BaseActivity {

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
    @BindView(R.id.btnback)
    ImageView btnback;

    @BindView(R.id.fg_texth)
    TextView textViewnr;
    @BindView(R.id.tv_name)
    TextView textName;
    @BindView(R.id.txtTitle)
    TextView title;
    @BindView(R.id.webView)
    public WebView webview;

    private scbzInfo.DataBean dataBean1 =null;

    @Override
    protected int setLayout() {
        return R.layout.activity_flfg_list_info;
    }

    @Override
    protected void setView() {
         dataBean1= (scbzInfo.DataBean) getIntent().getSerializableExtra("scbzinfo");
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        btnback.setOnClickListener(this);
    }

    @Override
    protected void setData() {
        title.setText("生产标准信息详情");
        textViewnr.setText("备注");
        textName.setText("生产标准");
        textf.setVisibility(View.GONE);
        textg.setVisibility(View.GONE);
        texte.setVisibility(View.GONE);

        if(dataBean1 != null){
            String bz = dataBean1.getBZ();
            if(bz != null){
                String newContent = Utils.getNewContent(bz);
                webview.loadData(newContent, "text/html; charset=UTF-8", null);
            }
            texta.setText("标准名称："+dataBean1.getBZMC());
            textb.setText("标准编码："+dataBean1.getBZBM());
            textc.setText("发布时间："+dataBean1.getPublishTime());
            textd.setText("状态："+dataBean1.getStatusName());

        }

    }

    @Override
    public void onClick(View v) {
        finish();
    }
}
