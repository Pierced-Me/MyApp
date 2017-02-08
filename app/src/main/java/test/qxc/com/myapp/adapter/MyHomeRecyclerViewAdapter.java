package test.qxc.com.myapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.adapter.holder.HomeHeadHolder;
import test.qxc.com.myapp.adapter.holder.HomeItemHolder;
import test.qxc.com.mylibrary.base.BaseViewHolder;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2016/12/30.
 */

public class MyHomeRecyclerViewAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private static final int HEAD = 0;
    private static final int ITEM = 1;
    private final LayoutInflater mInflater;
    private final Context context;
    private final ArrayList<List> lists;

    public MyHomeRecyclerViewAdapter(Context context, ArrayList<List> lists) {
        mInflater = LayoutInflater.from(context);
        this.context = context;
        this.lists = lists;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == HEAD)
            return new HomeHeadHolder(mInflater.inflate(R.layout.home_head, parent, false));
        else
            return new HomeItemHolder(mInflater.inflate(R.layout.home_recycler, parent, false));
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.setData(context, lists.get(position));
    }

    @Override
    public int getItemCount() {
        return lists.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return HEAD;
        } else{
            return ITEM;
        }
    }
}
