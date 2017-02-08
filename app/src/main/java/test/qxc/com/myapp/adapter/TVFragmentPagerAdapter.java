package test.qxc.com.myapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import test.qxc.com.myapp.module.bean.TVTabBean;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/6.
 */

public class TVFragmentPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> data;
    private ArrayList<TVTabBean> list;

    public TVFragmentPagerAdapter(FragmentManager fm, List<Fragment> data, ArrayList<TVTabBean> list) {
        super(fm);
        this.list = list;
        this.data = data;
    }

    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String name = list.get(position).getName();
        return name;
    }
}
