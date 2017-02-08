package test.qxc.com.myapp.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.module.bean.HomeBean;
import test.qxc.com.mylibrary.utils.glideutils.imageutils.ImageUtilsManager;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2016/12/30.
 */

public class MyHomeHeadViewPagerAdapter extends PagerAdapter {

    private List<HomeBean.TopStoriesBean> top_stories;
    private LayoutInflater inflater;
    private Context context;
    private HomeBean.TopStoriesBean topStoriesBean;

    public MyHomeHeadViewPagerAdapter(Context context, List<HomeBean.TopStoriesBean> top_stories) {
        this.context = context;
        this.top_stories = top_stories;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        topStoriesBean = top_stories.get(position % top_stories.size());
        View inflate = inflater.inflate(R.layout.hean_item, container, false);
        TextView tv = (TextView) inflate.findViewById(R.id.head_item_tv);
        tv.setText(topStoriesBean.getTitle());
        ImageView iv = (ImageView) inflate.findViewById(R.id.head_item_iv);
        ImageUtilsManager.getGlideUtils(ImageUtilsManager.Type.GLIDE).display(iv, topStoriesBean.getImage());
        container.addView(inflate);
        return inflate;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((View) object);
    }
}
