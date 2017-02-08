package test.qxc.com.mylibrary.utils.glideutils.imageutils;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import test.qxc.com.mylibrary.utils.glideutils.GlideCircleTransform;
import test.qxc.com.mylibrary.utils.glideutils.GlideRoundTransform;

/**
 * 类的用途:
 * @author: qinxiaochuan
 * @date: 2017/1/12
 */

public class GlideUtils implements IImageLoader{


    public static GlideUtils glideUtils;
    private GlideUtils(){}
    public static GlideUtils getInstance(){
        if(glideUtils==null){
            synchronized (GlideUtils.class){
                if(glideUtils==null){
                    glideUtils = new GlideUtils();
                }
            }
        }
        return glideUtils;
    }




    @Override
    public void display(ImageView imageView, String url) {
        Glide.with(imageView.getContext()).load(url).into(imageView);

    }

    @Override
    public void display(ImageView imageView, String url, int loadingImg, int errorImg) {
        Glide.with(imageView.getContext()).load(url).placeholder(loadingImg).error(errorImg)
                .into(imageView);
    }

    @Override
    public void displayCircleImg(ImageView imageView, int resId) {
        Glide.with(imageView.getContext()).load(resId).transform(new GlideCircleTransform(imageView.getContext())).into(imageView);


    }

    @Override
    public void displayCircleImg(ImageView imageView, String url) {
        Glide.with(imageView.getContext()).load(url).transform(new GlideCircleTransform(imageView.getContext())).into(imageView);

    }

    @Override
    public void displayRoundImg(ImageView imageView, int resId) {
        Glide.with(imageView.getContext()).load(resId).transform(new GlideRoundTransform(imageView.getContext())).into(imageView);

    }

    @Override
    public void displayRoundImg(ImageView imageView, String url) {
        Glide.with(imageView.getContext()).load(url).transform(new GlideRoundTransform(imageView.getContext())).into(imageView);

    }

    @Override
    public void displayRoundImg(ImageView imageView, String url, int conners) {
        Glide.with(imageView.getContext()).load(url).transform(new GlideRoundTransform(imageView.getContext(),conners)).into(imageView);
    }

    @Override
    public void displayImgQuick(ImageView imageView, String url, float num, DiskCacheStrategy diskCacheStrategy) {
        Glide.with(imageView.getContext()).load(url)
                .thumbnail(num)
                .diskCacheStrategy(diskCacheStrategy)
                .into(imageView);

    }
}
