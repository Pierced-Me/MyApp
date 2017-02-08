package test.qxc.com.myapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.adapter.holder.WeChatItemHolder;
import test.qxc.com.myapp.module.bean.WeChatBean;
import test.qxc.com.mylibrary.base.BaseActivity;
import test.qxc.com.mylibrary.base.BaseViewHolder;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/4.
 */

public class MyWeChatRecyclerViewAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private BaseActivity baseActivity;
    private List<WeChatBean.NewslistBean> newslist;
    private LayoutInflater inflater;

    public MyWeChatRecyclerViewAdapter(BaseActivity baseActivity, List<WeChatBean.NewslistBean> newslist) {
        inflater = LayoutInflater.from(baseActivity);
        this.baseActivity = baseActivity;
        this.newslist = newslist;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new WeChatItemHolder(inflater.inflate(R.layout.wechat_item, parent, false));
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.setData(baseActivity, newslist.get(position));
    }

    @Override
    public int getItemCount() {
        return newslist.size();
    }

    public WeChatBean.NewslistBean getItemData(int position) {
        return newslist.get(position);
    }
}
