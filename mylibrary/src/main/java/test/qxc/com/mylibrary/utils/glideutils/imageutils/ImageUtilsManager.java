package test.qxc.com.mylibrary.utils.glideutils.imageutils;

import static test.qxc.com.mylibrary.utils.glideutils.imageutils.ImageUtilsManager.Type.GLIDE;

/**
 * 类的用途:
 * @author: qinxiaochuan
 * @date: 2017/1/12
 */

public class ImageUtilsManager {
    public static IImageLoader getGlideUtils(Type type){
        if(GLIDE==type){
            return GlideUtils.getInstance();
        }
        return GlideUtils.getInstance();
    }

    public enum Type{
        GLIDE;
    }
}
