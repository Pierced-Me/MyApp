package test.qxc.com.mylibrary.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2016/12/28.
 */

public abstract class BaseFragment<P extends IBasePresenter> extends Fragment implements IActivity, IBaseView{

    private View rootView;
    protected P mPresenter;

    protected abstract P createPresenter(IBaseView view);

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        int rootViewId = bindRootView();
        if (rootViewId != 0) {
            rootView = View.inflate(getBaseActivity(), rootViewId, null);
            initData();
            mPresenter = createPresenter(this);
            initView(savedInstanceState);
            return rootView;
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    //获取主View
    protected View getRootView() {
        return rootView;
    }

    //获取BaseActivity
    protected BaseActivity getBaseActivity(){
        if (getActivity() instanceof BaseActivity){
            return (BaseActivity)getActivity();
        }else {
            throw new ClassCastException("activity must extends BaseActivity");
        }
    }
    //销毁
    @Override
    public void onDestroy() {
        super.onDestroy();
        rootView = null;
    }

    //简化findViewById
    protected <T extends View> T findView(int viewId, Class<T> view) {
        return (T) getRootView().findViewById(viewId);
    }

    protected  P getPresenter() {
        return mPresenter;
    }
}
