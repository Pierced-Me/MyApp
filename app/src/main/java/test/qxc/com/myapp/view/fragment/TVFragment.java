package test.qxc.com.myapp.view.fragment;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.adapter.MyTVFragmentRecyclerViewAdapter;
import test.qxc.com.myapp.module.bean.TVBean;
import test.qxc.com.myapp.presenter.TVFragmentPresenter;
import test.qxc.com.myapp.presenter.ipresenter.ITVFragmentPresenter;
import test.qxc.com.myapp.view.activity.TVActivity;
import test.qxc.com.myapp.view.fragment.ifragment.ITVFragment;
import test.qxc.com.mylibrary.base.BaseFragment;
import test.qxc.com.mylibrary.base.IBaseView;
import test.qxc.com.mylibrary.other.OnRecyclerItemClickListener;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/6.
 */

public class TVFragment extends BaseFragment<ITVFragmentPresenter> implements ITVFragment {

    private String name;
    private RecyclerView mRecyclerView;
    private MyTVFragmentRecyclerViewAdapter mTVFragmentRecyclerViewAdapter;

    @Override
    protected ITVFragmentPresenter createPresenter(IBaseView view) {
        return new TVFragmentPresenter(this, name);
    }

    @Override
    public int bindRootView() {
        return R.layout.fragment_tv;
    }

    @Override
    public void initData() {
        name = getArguments().getString("name");
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        mRecyclerView = findView(R.id.fm_tv_recyclerview, RecyclerView.class);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getBaseActivity(), 2));
        mRecyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.set(5, 5, 5, 5);
            }
        });

        mRecyclerView.addOnItemTouchListener(new OnRecyclerItemClickListener(mRecyclerView) {
            @Override
            public void onItemClick(RecyclerView.ViewHolder vh) {
                TVBean.DataBean itemData = mTVFragmentRecyclerViewAdapter.getItemData(vh.getAdapterPosition());
                TVActivity tvActivity = (TVActivity) getBaseActivity();
                tvActivity.toPlay(itemData.getUid());
            }

            @Override
            public void onItemLongClick(RecyclerView.ViewHolder vh) {

            }
        });
    }

    @Override
    public void showData(Object o) {
        List<TVBean.DataBean> data = (List<TVBean.DataBean>) o;
        mTVFragmentRecyclerViewAdapter = new MyTVFragmentRecyclerViewAdapter(getBaseActivity(), data);
        mRecyclerView.setAdapter(mTVFragmentRecyclerViewAdapter);
    }
}
