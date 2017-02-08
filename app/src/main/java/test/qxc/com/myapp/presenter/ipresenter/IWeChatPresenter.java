package test.qxc.com.myapp.presenter.ipresenter;

import test.qxc.com.myapp.other.MyType;
import test.qxc.com.mylibrary.base.IBasePresenter;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/4.
 */

public interface IWeChatPresenter extends IBasePresenter {

    public void loadData(MyType change);
}
