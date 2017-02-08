package test.qxc.com.myapp.view.fragment;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.adapter.MyHomeRecyclerViewAdapter;
import test.qxc.com.myapp.presenter.HomePresenter;
import test.qxc.com.myapp.presenter.ipresenter.IHomePresenter;
import test.qxc.com.myapp.view.fragment.ifragment.IHomeFragment;
import test.qxc.com.mylibrary.base.BaseFragment;
import test.qxc.com.mylibrary.base.IBaseView;

public class HomeFragment extends BaseFragment<IHomePresenter> implements IHomeFragment {

    private RecyclerView mRecyclerView;
    private MyHomeRecyclerViewAdapter mHomeRecyclerViewAdapter;

    @Override
    public int bindRootView() {

        return R.layout.fragment_home;
    }

    @Override
    public void initData() {

    }

    @Override
    public void initView(Bundle savedInstanceState) {

        mRecyclerView = findView(R.id.home_recyclerview, RecyclerView.class);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getBaseActivity()));
        mRecyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {

                super.getItemOffsets(outRect, view, parent, state);
                outRect.set(5, 10, 5, 10);
            }
        });
    }

    @Override
    public void showData(Object o) {
        ArrayList<List> lists = (ArrayList<List>) o;
        mHomeRecyclerViewAdapter = new MyHomeRecyclerViewAdapter(getBaseActivity(), lists);
        mRecyclerView.setAdapter(mHomeRecyclerViewAdapter);
    }

    @Override
    protected IHomePresenter createPresenter(IBaseView view) {
        return new HomePresenter(this);
    }
}
