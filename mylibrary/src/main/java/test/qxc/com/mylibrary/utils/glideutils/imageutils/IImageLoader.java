package test.qxc.com.mylibrary.utils.glideutils.imageutils;

import android.widget.ImageView;

import com.bumptech.glide.load.engine.DiskCacheStrategy;

/**
 * 1.类的用途
 * 2.@author:liwei
 * 3.@2016/12/28
 */

public interface IImageLoader {
    void display(ImageView imageView, String url);

    void display(ImageView imageView, String url, int loadingImg, int errorImg);

    void displayCircleImg(ImageView imageView, int resId);

    void displayCircleImg(ImageView imageView, String url);

    void displayRoundImg(ImageView imageView, int resId);

    void displayRoundImg(ImageView imageView, String url);

    void displayRoundImg(ImageView imageView,String url,int conners);

    void displayImgQuick(ImageView imageView, String url, float num, DiskCacheStrategy diskCacheStrategy);









}
