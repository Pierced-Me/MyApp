package test.qxc.com.myapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.adapter.holder.HomeItemRecyclerViewHolder;
import test.qxc.com.myapp.module.bean.HomeBean;
import test.qxc.com.mylibrary.base.BaseViewHolder;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/3.
 */

public class MyHomeItemRecyclerViewAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    private List<HomeBean.StoriesBean> stories;

    public MyHomeItemRecyclerViewAdapter(Context context, List<HomeBean.StoriesBean> stories) {
        this.context = context;
        this.stories = stories;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new HomeItemRecyclerViewHolder(inflater.inflate(R.layout.home_item, parent, false));
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.setData(context, stories.get(position));
    }

    @Override
    public int getItemCount() {
        return stories.size();
    }

    public HomeBean.StoriesBean getItemData(int position) {
        return stories.get(position);
    }
}
