package test.qxc.com.mylibrary.base;

import test.qxc.com.mylibrary.net.ICallback;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2016/12/28.
 */

public interface IBaseModule {
    public void getData(ICallback callback);
    public void onDestroy();
}
