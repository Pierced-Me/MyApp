package test.qxc.com.myapp.view.activity;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import com.pili.pldroid.player.AVOptions;
import com.pili.pldroid.player.PLMediaPlayer;
import com.pili.pldroid.player.widget.PLVideoView;

import java.util.ArrayList;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.adapter.TVFragmentPagerAdapter;
import test.qxc.com.myapp.custom.MyCustomLayout;
import test.qxc.com.myapp.module.bean.TVTabBean;
import test.qxc.com.myapp.presenter.TVPresenter;
import test.qxc.com.myapp.presenter.ipresenter.ITVPresenter;
import test.qxc.com.myapp.view.activity.iactivity.ITVActivity;
import test.qxc.com.myapp.view.fragment.TVFragment;
import test.qxc.com.myapp.view.fragment.TVMainFragment;
import test.qxc.com.mylibrary.base.BaseActivity;
import test.qxc.com.mylibrary.base.IBaseView;

public class TVActivity extends BaseActivity<ITVPresenter> implements ITVActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private ArrayList<Fragment> fragments;
    private PLVideoView mPLVideoView;
    private MyCustomLayout mCustomLayout;
    private String path;

    @Override
    protected ITVPresenter createPresenter(IBaseView view) {
        return new TVPresenter(this);
    }

    @Override
    public int bindRootView() {
        return R.layout.activity_tv;
    }

    @Override
    public void initData() {
    }

    @Override
    public void initView(Bundle savedInstanceState) {

        mTabLayout = findView(R.id.tv_tablayout, TabLayout.class);
        mViewPager = findView(R.id.tv_viewpager, ViewPager.class);
        mCustomLayout = findView(R.id.tv_mycustomlayout, MyCustomLayout.class);
        Button mButton = findView(R.id.tv_change, Button.class);
        mPLVideoView = findView(R.id.tv_PLVideoView, PLVideoView.class);

        AVOptions avOptions = new AVOptions();
        avOptions.setInteger(AVOptions.KEY_PREPARE_TIMEOUT, 10 * 1000);
        avOptions.setInteger(AVOptions.KEY_GET_AV_FRAME_TIMEOUT, 10 * 1000);
        avOptions.setInteger(AVOptions.KEY_LIVE_STREAMING, 1);
        avOptions.setInteger(AVOptions.KEY_DELAY_OPTIMIZATION, 1);
        avOptions.setInteger(AVOptions.KEY_MEDIACODEC, AVOptions.MEDIA_CODEC_AUTO);
        avOptions.setInteger(AVOptions.KEY_CACHE_BUFFER_DURATION, 2000);
        avOptions.setInteger(AVOptions.KEY_MAX_CACHE_BUFFER_DURATION, 4000);
        mPLVideoView.setAVOptions(avOptions);

        if (savedInstanceState != null) {
            path = savedInstanceState.getString("path");
            mPLVideoView.setVideoPath(path);
            mPLVideoView.start();
        }

        mPLVideoView.setOnPreparedListener(new PLMediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(PLMediaPlayer plMediaPlayer) {
                plMediaPlayer.start();
            }
        });
        mPLVideoView.setOnErrorListener(new PLMediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(PLMediaPlayer plMediaPlayer, int i) {
                mPLVideoView.setVideoPath(path);
                mPLVideoView.start();
                return false;
            }
        });
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mOrientation = getBaseContext().getResources().getConfiguration().orientation;
                if (mOrientation == Configuration.ORIENTATION_LANDSCAPE){

                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                } else if(mOrientation == Configuration.ORIENTATION_PORTRAIT) {

                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
                }
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("path", path);
    }

    @Override
    public void showData(Object o) {
        fragments = new ArrayList<>();
        fragments.add(new TVMainFragment());
        ArrayList<TVTabBean> list = (ArrayList<TVTabBean>) o;
        for (int i = 0; i < list.size(); i++) {
            Bundle bundle = new Bundle();
            bundle.putString("name", list.get(i).getSlug());
            TVFragment tvFragment = new TVFragment();
            tvFragment.setArguments(bundle);
            fragments.add(tvFragment);
        }
        mViewPager.setAdapter(new TVFragmentPagerAdapter(getSupportFragmentManager(), fragments, list));
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    public void toPlay(String uid) {
        getPresenter().toPlay(uid);
    }

    @Override
    public void play(String path) {
        this.path = path;
        mCustomLayout.setVisibility(View.VISIBLE);
        mCustomLayout.maximize();
        mPLVideoView.setVideoPath(path);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPLVideoView.stopPlayback();
    }
}
