package test.qxc.com.myapp.view.fragment;

import android.os.Bundle;
import android.view.View;

import test.qxc.com.myapp.R;
import test.qxc.com.mylibrary.base.BaseFragment;
import test.qxc.com.mylibrary.base.IBasePresenter;
import test.qxc.com.mylibrary.base.IBaseView;

public class HotFragment extends BaseFragment {

    @Override
    public int bindRootView() {
        return R.layout.fragment_hot;
    }

    @Override
    public void initData() {

    }

    @Override
    public void initView(Bundle savedInstanceState) {

        View rootView = getRootView();
    }

    @Override
    protected IBasePresenter createPresenter(IBaseView view) {
        return null;
    }

    @Override
    public void showData(Object o) {

    }
}
