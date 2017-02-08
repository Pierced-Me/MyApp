package test.qxc.com.mylibrary.utils.glideutils;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.module.GlideModule;

/**
 * 类的用途:
 * @author: qinxiaochuan
 * @date: 2017/1/12
 */

public class MyGlideModule implements GlideModule{
//    此类已经在类库的清单文件中注册
    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
  /*      http://blog.csdn.net/shangmingchao/article/details/51026742
        MemoryCache和BitmapPool的默认大小由MemorySizeCalculator类决定，
        MemorySizeCalculator会根据给定屏幕大小可用内存算出合适的缓存大小，
        这也是推荐的缓存大小，我们可以根据这个推荐大小做出调整*/
//        MemorySizeCalculator calculator = new MemorySizeCalculator(context);
//        int defaultMemoryCacheSize = calculator.getMemoryCacheSize();
//        int defaultBitmapPoolSize = calculator.getBitmapPoolSize();
//
//        int customMemoryCacheSize = (int) (1.2 * defaultMemoryCacheSize);
//        int customBitmapPoolSize = (int) (1.2 * defaultBitmapPoolSize);
//
//        builder.setMemoryCache(new LruResourceCache(customMemoryCacheSize));
//        builder.setBitmapPool(new LruBitmapPool(customBitmapPoolSize));
//
//
        /*为glide的硬盘缓存重新分配空间*/
//        String path = context.getExternalCacheDir().getPath();
//
//        builder.setDiskCache(
//                new DiskLruCacheFactory(path,"image",200*1024*1024));




    }

    @Override
    public void registerComponents(Context context, Glide glide) {

    }
}
