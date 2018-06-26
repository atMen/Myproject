package customer.tcrj.com.myproject.first;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.List;

import butterknife.BindView;
import customer.tcrj.com.myproject.R;
import customer.tcrj.com.myproject.Utils.Utils;
import customer.tcrj.com.myproject.base.BaseActivity;
import customer.tcrj.com.myproject.bean.djInfo;
import customer.tcrj.com.myproject.bean.flfgInfo;

public class djListInfoActivity extends BaseActivity {

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

    @BindView(R.id.fg_texth)
    TextView textViewnr;
    @BindView(R.id.tv_name)
    TextView textName;
    @BindView(R.id.txtTitle)
    TextView title;
    @BindView(R.id.btnback)
    ImageView btnback;

    @BindView(R.id.webView)
    public WebView webview;

    private djInfo.DataBean dataBean1 =null;

    @Override
    protected int setLayout() {
        return R.layout.activity_flfg_list_info;
    }

    @Override
    protected void setView() {
         dataBean1= (djInfo.DataBean) getIntent().getSerializableExtra("djinfo");
        btnback.setOnClickListener(this);
    }

    @Override
    protected void setData() {
        title.setText("党建信息详情");
        textViewnr.setText("内容");
        textName.setText("党建动态");
        textf.setVisibility(View.GONE);
        textg.setVisibility(View.GONE);

        if(dataBean1 != null){

            String nr = dataBean1.getNR();
            if(nr != null){

                String newContent = Utils.getNewContent(nr);
                webview.loadData(newContent, "text/html; charset=UTF-8", null);
            }

            texta.setText("标题："+dataBean1.getMC());
            textb.setText("类别："+dataBean1.getLBName());
            textc.setText("时间："+dataBean1.getSJ());
            textd.setText("地点："+dataBean1.getDD());
            texte.setText("人员："+dataBean1.getRY());
        }

    }


    @Override
    public void onClick(View v) {

        finish();
    }
}
