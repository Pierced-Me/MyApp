package test.qxc.com.myapp.module.imodule;

import test.qxc.com.mylibrary.base.IBaseModule;
import test.qxc.com.mylibrary.net.ICallback;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/6.
 */

public interface ITVModule extends IBaseModule {

    void getData(String name, ICallback callback);

    public void getPlayData(String uid, ICallback callback);
}
