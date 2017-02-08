package test.qxc.com.myapp.view.fragment;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.cjj.MaterialRefreshLayout;
import com.cjj.MaterialRefreshListener;

import java.util.List;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.adapter.MyWeChatRecyclerViewAdapter;
import test.qxc.com.myapp.module.bean.WeChatBean;
import test.qxc.com.myapp.other.MyType;
import test.qxc.com.myapp.presenter.ipresenter.IWeChatPresenter;
import test.qxc.com.myapp.presenter.WeChatPresenter;
import test.qxc.com.myapp.view.fragment.ifragment.IWeChatFragment;
import test.qxc.com.mylibrary.base.BaseFragment;
import test.qxc.com.mylibrary.base.IBaseView;
import test.qxc.com.mylibrary.other.OnRecyclerItemClickListener;

public class WeChatFragment extends BaseFragment<IWeChatPresenter> implements IWeChatFragment {

    private RecyclerView mRecyclerView;
    private MaterialRefreshLayout mMaterialRefreshLayout;
    private MyWeChatRecyclerViewAdapter mWeChatRecyclerViewAdapter;

    @Override
    public int bindRootView() {
        return R.layout.fragment_wechat;
    }

    @Override
    public void initData() {}

    @Override
    public void initView(Bundle savedInstanceState) {

        mMaterialRefreshLayout = findView(R.id.wechat_materialRefreshLayout, MaterialRefreshLayout.class);
        mRecyclerView = findView(R.id.wechat_recyclerview, RecyclerView.class);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseActivity()));

        mMaterialRefreshLayout.setWaveColor(0x33ffffff);
        mMaterialRefreshLayout.setIsOverLay(false);

        mMaterialRefreshLayout.setLoadMore(true);
        mMaterialRefreshLayout.setMaterialRefreshListener(new MaterialRefreshListener() {
            @Override
            public void onRefresh(MaterialRefreshLayout materialRefreshLayout) {
                getPresenter().loadData(MyType.REFRESH);
            }

            @Override
            public void onRefreshLoadMore(MaterialRefreshLayout materialRefreshLayout) {
                getPresenter().loadData(MyType.LOAD);
            }
        });
        mRecyclerView.addOnItemTouchListener(new OnRecyclerItemClickListener(mRecyclerView) {
            @Override
            public void onItemClick(RecyclerView.ViewHolder vh) {
                int adapterPosition = vh.getAdapterPosition();
                WeChatBean.NewslistBean itemData = mWeChatRecyclerViewAdapter.getItemData(adapterPosition);
                String url = itemData.getUrl();
                WebView webView = new WebView(getBaseActivity());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl(url);
                webView.setWebViewClient(new WebViewClient());
                AlertDialog.Builder builder = new AlertDialog.Builder(getBaseActivity());
                AlertDialog dialog = builder.create();
                dialog.setView(webView);
                dialog.show();
            }

            @Override
            public void onItemLongClick(RecyclerView.ViewHolder vh) {

            }
        });
    }

    @Override
    public void showData(Object o) {

        mMaterialRefreshLayout.finishRefresh();
        List<WeChatBean.NewslistBean> newslist = (List<WeChatBean.NewslistBean>) o;
        mWeChatRecyclerViewAdapter = new MyWeChatRecyclerViewAdapter(getBaseActivity(), newslist);
        mRecyclerView.setAdapter(mWeChatRecyclerViewAdapter);
    }

    @Override
    protected IWeChatPresenter createPresenter(IBaseView view) {
        return new WeChatPresenter(this);
    }

    @Override
    public void nofityMe() {
        mMaterialRefreshLayout.finishRefreshLoadMore();
        mWeChatRecyclerViewAdapter.notifyDataSetChanged();
    }
}
