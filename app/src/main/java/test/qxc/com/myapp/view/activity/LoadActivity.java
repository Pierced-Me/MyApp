package test.qxc.com.myapp.view.activity;

import android.os.Bundle;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import test.qxc.com.myapp.R;
import test.qxc.com.mylibrary.base.BaseActivity;
import test.qxc.com.mylibrary.base.IBasePresenter;
import test.qxc.com.mylibrary.base.IBaseView;

public class LoadActivity extends BaseActivity {

    @Override
    public int bindRootView() {
        return R.layout.activity_load;
    }

    @Override
    public void initData() {

    }

    @Override
    public void initView(Bundle savedInstanceState) {

        Observable.timer(2, TimeUnit.SECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Action1<Long>() {
                    @Override
                    public void call(Long aLong) {
                        startActivity(test.qxc.com.myapp.view.activity.MainActivity.class);
                        finish();
                    }
                });
    }

    @Override
    protected IBasePresenter createPresenter(IBaseView view) {
        return null;
    }

    @Override
    public void showData(Object o) {

    }
}
