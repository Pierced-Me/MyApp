package test.qxc.com.myapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.adapter.holder.ColumnDetailItemHolder;
import test.qxc.com.myapp.module.bean.ColumnDetailBean;
import test.qxc.com.myapp.view.activity.ColumnDetailActivity;
import test.qxc.com.mylibrary.base.BaseViewHolder;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/5.
 */

public class MyColumnDetailRecyclerViewAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private final ColumnDetailActivity columnDetailActivity;
    private final List<ColumnDetailBean.StoriesBean> stories;
    private final LayoutInflater inflater;

    public MyColumnDetailRecyclerViewAdapter(ColumnDetailActivity columnDetailActivity, List<ColumnDetailBean.StoriesBean> stories) {

        this.columnDetailActivity = columnDetailActivity;
        this.stories = stories;
        inflater = LayoutInflater.from(columnDetailActivity);
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ColumnDetailItemHolder(inflater.inflate(R.layout.home_item, parent, false));
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.setData(columnDetailActivity, stories.get(position));
    }

    @Override
    public int getItemCount() {
        return stories.size();
    }

    public ColumnDetailBean.StoriesBean getItemData(int position){
        return stories.get(position);
    }

}
