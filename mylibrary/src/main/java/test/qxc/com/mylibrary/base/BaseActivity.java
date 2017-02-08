package test.qxc.com.mylibrary.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2016/12/28.
 */

public abstract class BaseActivity<P extends test.qxc.com.mylibrary.base.IBasePresenter> extends AppCompatActivity implements test.qxc.com.mylibrary.base.IActivity, test.qxc.com.mylibrary.base.IBaseView {

    private View rootView;
    protected P mPresenter;

    protected abstract P createPresenter(test.qxc.com.mylibrary.base.IBaseView view);

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int rootViewId = bindRootView();
        if (rootViewId != 0) {

            rootView = View.inflate(this, rootViewId, null);
            setContentView(rootView);
            initData();
            mPresenter = createPresenter(this);
            initView(savedInstanceState);
//            setStatusBar();
        }
    }

    //获取主View
    protected View getRootView() {
        return rootView;
    }

    //简化findViewById
    protected <T extends View> T findView(int viewId, Class<T> view) {
        return (T) findViewById(viewId);
    }

    //销毁
    @Override
    protected void onDestroy() {
        super.onDestroy();
        rootView = null;
    }

    //跳转
    public void startActivity(Class<? extends Activity> starActivity) {
        Intent intent = new Intent(this, starActivity);
        startActivity(intent);
    }

    //沉浸式
    private void setStatusBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            // 透明状态栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            // 透明导航栏
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }
    }

    protected  P getPresenter() {
        return mPresenter;
    }
}
