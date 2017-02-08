package test.qxc.com.myapp.module.imodule;

import test.qxc.com.mylibrary.base.IBaseModule;
import test.qxc.com.mylibrary.net.ICallback;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/4.
 */

public interface IColumnModule extends IBaseModule {

    void getData(ICallback callback);

    void getData(int id, ICallback callback);
}
