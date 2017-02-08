package test.qxc.com.myapp.adapter.holder;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.View;

import java.util.List;
import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import test.qxc.com.myapp.R;
import test.qxc.com.myapp.adapter.MyHomeHeadViewPagerAdapter;
import test.qxc.com.myapp.module.bean.HomeBean;
import test.qxc.com.myapp.other.MyNotify;
import test.qxc.com.myapp.view.activity.MainActivity;
import test.qxc.com.mylibrary.base.BaseViewHolder;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2016/12/30.
 */

public class HomeHeadHolder extends BaseViewHolder implements MyNotify {

    private ViewPager mViewPager;
    private Subscription mSubscribe;

    public HomeHeadHolder(View itemView) {
        super(itemView);

        mViewPager = (ViewPager) itemView.findViewById(R.id.home_head_viewpager);
    }

    @Override
    public void setData(Context context, Object o) {

        List<HomeBean.TopStoriesBean> top_stories = (List<HomeBean.TopStoriesBean>) o;
        mViewPager.setAdapter(new MyHomeHeadViewPagerAdapter(context, top_stories));
        start();

        MainActivity mainActivity = (MainActivity) context;
        mainActivity.setMyNotify(this);
    }

    public void start() {

        mSubscribe = Observable.interval(2, 2, TimeUnit.SECONDS)
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Long>() {
                    @Override
                    public void call(Long aLong) {

                        mViewPager.setCurrentItem(mViewPager.getCurrentItem() + 1);
                    }
                });
    }

    public void stop() {

        if (mSubscribe != null && !mSubscribe.isUnsubscribed()) {
            mSubscribe.unsubscribe();
        }
    }

    @Override
    public void notifyMe() {

        stop();
    }
}
