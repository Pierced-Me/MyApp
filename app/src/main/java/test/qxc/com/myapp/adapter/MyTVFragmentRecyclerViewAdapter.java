package test.qxc.com.myapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.adapter.holder.TVFragmentItemViewHolder;
import test.qxc.com.myapp.module.bean.TVBean;
import test.qxc.com.mylibrary.base.BaseActivity;
import test.qxc.com.mylibrary.base.BaseViewHolder;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/6.
 */

public class MyTVFragmentRecyclerViewAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private final BaseActivity baseActivity;
    private final List<TVBean.DataBean> data;
    private final LayoutInflater inflater;

    public MyTVFragmentRecyclerViewAdapter(BaseActivity baseActivity, List<TVBean.DataBean> data) {
        inflater = LayoutInflater.from(baseActivity);
        this.baseActivity = baseActivity;
        this.data = data;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new TVFragmentItemViewHolder(inflater.inflate(R.layout.tv_fm_item, parent, false));
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.setData(baseActivity, data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public TVBean.DataBean getItemData(int position) {

        return data.get(position);
    }
}
