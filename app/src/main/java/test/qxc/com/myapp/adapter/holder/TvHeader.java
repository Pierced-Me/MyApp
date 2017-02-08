package test.qxc.com.myapp.adapter.holder;

import android.content.Context;
import android.view.View;

import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import test.qxc.com.myapp.R;
import test.qxc.com.myapp.module.bean.TVMainBean;
import test.qxc.com.myapp.utils.BannerGlideImageLoader;
import test.qxc.com.mylibrary.base.BaseViewHolder;

/**
 * Created by gaojian on 2017/1/5.
 */

public class TvHeader extends BaseViewHolder<TVMainBean.RoomBean> {

    Banner mBanner;

    public TvHeader(View itemView) {
        super(itemView);
        mBanner = (Banner) itemView.findViewById(R.id.tvmain_banner);
    }

    @Override
    public void setData(Context context, TVMainBean.RoomBean roomBean) {
        List<TVMainBean.RoomBean.ListBean> list = roomBean.list;
        List<String> imageList = new ArrayList<>();
        List<String> titleList = new ArrayList<>();
        for (TVMainBean.RoomBean.ListBean listBean : list) {
            imageList.add(listBean.thumb);
            titleList.add(listBean.title);
        }

        mBanner.setImages(imageList);
        mBanner.setImageLoader(new BannerGlideImageLoader());
        mBanner.setBannerTitles(titleList);
        mBanner.setDelayTime(2000);
        mBanner.start();
    }

}
