package test.qxc.com.myapp.view.activity;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.List;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.adapter.MyColumnDetailRecyclerViewAdapter;
import test.qxc.com.myapp.module.HomeModule;
import test.qxc.com.myapp.module.bean.ColumnDetailBean;
import test.qxc.com.myapp.module.bean.HomeDetailBean;
import test.qxc.com.myapp.presenter.ColumnDetailPresenter;
import test.qxc.com.myapp.presenter.ipresenter.IColumnDetailPresenter;
import test.qxc.com.myapp.view.activity.iactivity.IColumnDetailActivity;
import test.qxc.com.mylibrary.base.BaseActivity;
import test.qxc.com.mylibrary.base.IBaseView;
import test.qxc.com.mylibrary.net.ICallback;
import test.qxc.com.mylibrary.other.OnRecyclerItemClickListener;

public class ColumnDetailActivity extends BaseActivity<IColumnDetailPresenter> implements IColumnDetailActivity {

    private int id;
    private RecyclerView mRecyclerView;
    private MyColumnDetailRecyclerViewAdapter mColumnDetailRecyclerViewAdapter;

    @Override
    public int bindRootView() {
        return R.layout.activity_column_detail;
    }

    @Override
    public void initData() {
        id = getIntent().getIntExtra("id", 0);
    }

    @Override
    public void initView(Bundle savedInstanceState) {

        Toolbar mToolBar = findView(R.id.columndetai_toolbar, Toolbar.class);
        setSupportActionBar(mToolBar);
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        supportActionBar.setDisplayShowHomeEnabled(true);
        supportActionBar.setTitle("");
        mToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mRecyclerView = findView(R.id.columndetail_recyclerview, RecyclerView.class);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);

                outRect.set(5, 5, 5, 5);
            }
        });
        getPresenter().allot(id);
        mRecyclerView.addOnItemTouchListener(new OnRecyclerItemClickListener(mRecyclerView) {
            @Override
            public void onItemClick(RecyclerView.ViewHolder vh) {
                int adapterPosition = vh.getAdapterPosition();
                ColumnDetailBean.StoriesBean itemData = mColumnDetailRecyclerViewAdapter.getItemData(adapterPosition);
                int id = itemData.getId();
                new HomeModule().getDetailData(id, new ICallback() {
                    @Override
                    public void onCompleted(Object o) {
                        HomeDetailBean homeDetailBean = (HomeDetailBean) o;
                        String url = homeDetailBean.getShare_url();
                        WebView webView = new WebView(ColumnDetailActivity.this);
                        webView.getSettings().setJavaScriptEnabled(true);
                        webView.loadUrl(url);
                        webView.setWebViewClient(new WebViewClient());
                        AlertDialog.Builder builder = new AlertDialog.Builder(ColumnDetailActivity.this);
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

    @Override
    public void showData(Object o) {
        List<ColumnDetailBean.StoriesBean> stories = (List<ColumnDetailBean.StoriesBean>) o;
        mColumnDetailRecyclerViewAdapter = new MyColumnDetailRecyclerViewAdapter(this, stories);
        mRecyclerView.setAdapter(mColumnDetailRecyclerViewAdapter);
    }

    @Override
    protected IColumnDetailPresenter createPresenter(IBaseView view) {
        return new ColumnDetailPresenter(this);
    }
}
