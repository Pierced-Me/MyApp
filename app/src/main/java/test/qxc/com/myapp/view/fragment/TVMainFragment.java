package test.qxc.com.myapp.view.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.adapter.TVMainFragmentRecyclerViewAdapter;
import test.qxc.com.myapp.module.bean.TVMainBean;
import test.qxc.com.myapp.presenter.TVMainPresenter;
import test.qxc.com.myapp.presenter.ipresenter.ITVMainPresenter;
import test.qxc.com.myapp.view.fragment.ifragment.ITVMainFragment;
import test.qxc.com.mylibrary.base.BaseFragment;
import test.qxc.com.mylibrary.base.IBaseView;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/7.
 */

public class TVMainFragment extends BaseFragment<ITVMainPresenter> implements ITVMainFragment {

    private RecyclerView mRecyclerView;
    private TVMainFragmentRecyclerViewAdapter mAdapter;

    @Override
    protected ITVMainPresenter createPresenter(IBaseView view) {
        return new TVMainPresenter(this);
    }

    @Override
    public int bindRootView() {
        return R.layout.tv_fm_main;
    }

    @Override
    public void initData() {

    }

    @Override
    public void initView(Bundle savedInstanceState) {
        mRecyclerView = findView(R.id.tvmain_recyclerview, RecyclerView.class);
    }

    @Override
    public void showData(Object o) {
        TVMainBean tvMainBean = (TVMainBean) o;
        mAdapter = new TVMainFragmentRecyclerViewAdapter(getBaseActivity(), tvMainBean.room);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseActivity()));
        mRecyclerView.setAdapter(mAdapter);
    }

}
