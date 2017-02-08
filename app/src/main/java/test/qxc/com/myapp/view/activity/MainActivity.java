package test.qxc.com.myapp.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.viewpagerindicator.TabPageIndicator;

import java.util.ArrayList;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.adapter.MyFragmentPagerAdapter;
import test.qxc.com.myapp.other.MyNotify;
import test.qxc.com.myapp.view.fragment.ColumnFragment;
import test.qxc.com.myapp.view.fragment.HomeFragment;
import test.qxc.com.myapp.view.fragment.HotFragment;
import test.qxc.com.myapp.view.fragment.WeChatFragment;
import test.qxc.com.mylibrary.base.BaseActivity;
import test.qxc.com.mylibrary.base.IBasePresenter;
import test.qxc.com.mylibrary.base.IBaseView;

public class MainActivity extends BaseActivity<IBasePresenter> {

    private DrawerLayout mDrawerLayout;
    private ArrayList<Fragment> mFragments;
    private ArrayList<String> mPageTitles;

    @Override
    public int bindRootView() {
        return R.layout.activity_main;
    }

    @Override
    public void initData() {
        mFragments = new ArrayList<>();
        mFragments.add(new HomeFragment());
        mFragments.add(new ColumnFragment());
        mFragments.add(new WeChatFragment());
        mFragments.add(new HotFragment());

        mPageTitles = new ArrayList<>();
        mPageTitles.add("日报");
        mPageTitles.add("专栏");
        mPageTitles.add("微信");
        mPageTitles.add("热门");
    }

    @Override
    public void initView(Bundle savedInstanceState) {

        FloatingActionButton mFloatingActionButton = findView(R.id.main_floating, FloatingActionButton.class);
        ViewPager mViewPager = findView(R.id.main_viewpager, ViewPager.class);
        TabPageIndicator mTabPageIndicator = findView(R.id.main_indicator, TabPageIndicator.class);
        mDrawerLayout = findView(R.id.main_drawer, DrawerLayout.class);
        NavigationView mNavigationView = findView(R.id.main_navigation, NavigationView.class);
        Toolbar mToolbar = findView(R.id.main_toolbar, Toolbar.class);

        mViewPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager(), mFragments, mPageTitles));
        mTabPageIndicator.setViewPager(mViewPager);
        //设置Drawerlayout的开关,并且和Home图标联动
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, 0, 0);
        mDrawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                return false;
            }
        });
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.drawer_module:
                        break;
                    case R.id.drawer_tv:
                        startActivity(new Intent(MainActivity.this, test.qxc.com.myapp.view.activity.TVActivity.class));
                        break;
                }
                mDrawerLayout.closeDrawers();
                return true;
            }
        });
        mFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected IBasePresenter createPresenter(IBaseView view) {
        return null;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mNotify != null) {
            mNotify.notifyMe();
        }
    }

    private MyNotify mNotify;

    public void setMyNotify(MyNotify mNotify) {
        this.mNotify = mNotify;
    }

    @Override
    public void showData(Object o) {

    }
}
