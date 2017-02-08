package test.qxc.com.myapp.adapter.holder;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.List;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.adapter.MyHomeItemRecyclerViewAdapter;
import test.qxc.com.myapp.module.HomeModule;
import test.qxc.com.myapp.module.bean.HomeBean;
import test.qxc.com.myapp.module.bean.HomeDetailBean;
import test.qxc.com.mylibrary.base.BaseViewHolder;
import test.qxc.com.mylibrary.net.ICallback;
import test.qxc.com.mylibrary.other.OnRecyclerItemClickListener;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2016/12/30.
 */

public class HomeItemHolder extends BaseViewHolder {

    private RecyclerView recyclerView;
    private MyHomeItemRecyclerViewAdapter mHomeItemRecyclerViewAdapter;

    public HomeItemHolder(View itemView) {
        super(itemView);
        recyclerView = (RecyclerView) itemView.findViewById(R.id.home_recyclerview);
    }

    @Override
    public void setData(final Context context, Object o) {

        List<HomeBean.StoriesBean> stories = (List<HomeBean.StoriesBean>) o;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        mHomeItemRecyclerViewAdapter = new MyHomeItemRecyclerViewAdapter(context, stories);
        recyclerView.setAdapter(mHomeItemRecyclerViewAdapter);

        recyclerView.addOnItemTouchListener(new OnRecyclerItemClickListener(recyclerView) {
            @Override
            public void onItemClick(RecyclerView.ViewHolder vh) {
                int adapterPosition = vh.getAdapterPosition();
                HomeBean.StoriesBean itemData = mHomeItemRecyclerViewAdapter.getItemData(adapterPosition);
                int id = itemData.getId();
                new HomeModule().getDetailData(id, new ICallback() {
                    @Override
                    public void onCompleted(Object o) {
                        HomeDetailBean homeDetailBean = (HomeDetailBean) o;
                        WebView webView = new WebView(context);
                        webView.getSettings().setJavaScriptEnabled(true);
                        webView.loadUrl(homeDetailBean.getShare_url());
                        webView.setWebViewClient(new WebViewClient());
                        AlertDialog.Builder builder = new AlertDialog.Builder(context);
                        AlertDialog dialog = builder.create();
                        dialog.setView(webView);
                        dialog.show();
                    }

                    @Override
                    public void onFailed(String errMsg) {

                    }
                });
            }

            @Override
            public void onItemLongClick(RecyclerView.ViewHolder vh) {

            }
        });
    }
}
