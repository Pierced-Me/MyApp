package test.qxc.com.myapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.adapter.holder.TvFoot;
import test.qxc.com.myapp.adapter.holder.TvHeader;
import test.qxc.com.myapp.module.bean.TVMainBean;
import test.qxc.com.mylibrary.base.BaseActivity;
import test.qxc.com.mylibrary.base.BaseViewHolder;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/10.
 */

public class TVMainFragmentRecyclerViewAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private final BaseActivity baseActivity;
    private final List<TVMainBean.RoomBean> list;
    public static int TYPE_HEADER = 0;
    public static int TYPE_FOOT = 1;
    private final LayoutInflater inflater;

    public TVMainFragmentRecyclerViewAdapter(BaseActivity baseActivity, List<TVMainBean.RoomBean> list) {
        inflater = LayoutInflater.from(baseActivity);
        this.baseActivity = baseActivity;
        this.list = list;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return TYPE_HEADER;
        } else {
            return TYPE_FOOT;
        }
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_HEADER) {
            return new TvHeader(inflater.inflate(R.layout.tvmain_header, parent, false));
        } else {
            return new TvFoot(inflater.inflate(R.layout.tvmain_footer, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.setData(baseActivity, list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
