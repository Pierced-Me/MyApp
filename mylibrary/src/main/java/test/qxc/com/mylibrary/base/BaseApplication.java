package test.qxc.com.mylibrary.base;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2016/12/28.
 */

public class BaseApplication extends Application {

    private static BaseApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        LeakCanary.install(this);
    }

    public static BaseApplication getApplication() {
        return application;
    }
}
