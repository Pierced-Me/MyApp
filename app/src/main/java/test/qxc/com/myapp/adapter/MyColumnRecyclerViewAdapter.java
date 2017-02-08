package test.qxc.com.myapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.adapter.holder.ColumnItemHolder;
import test.qxc.com.myapp.module.bean.ColumnBean;
import test.qxc.com.mylibrary.base.BaseActivity;
import test.qxc.com.mylibrary.base.BaseViewHolder;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/4.
 */

public class MyColumnRecyclerViewAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private final BaseActivity baseActivity;
    private final List<ColumnBean.DataBean> datas;
    private final LayoutInflater inflater;

    public MyColumnRecyclerViewAdapter(BaseActivity baseActivity, List<ColumnBean.DataBean> datas) {
        this.baseActivity = baseActivity;
        this.datas = datas;
        inflater = LayoutInflater.from(baseActivity);
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ColumnItemHolder(inflater.inflate(R.layout.column_item, parent, false));
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.setData(baseActivity, datas.get(position));
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    public ColumnBean.DataBean getItemData(int position) {
        return datas.get(position);
    }
}
