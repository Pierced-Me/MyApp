package test.qxc.com.myapp.module.imodule;

import test.qxc.com.mylibrary.base.IBaseModule;
import test.qxc.com.mylibrary.net.ICallback;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2016/12/30.
 */

public interface IHomeModule extends IBaseModule {

    void getData(ICallback callback);

    void getDetailData(int id, ICallback callback);
}
