package test.qxc.com.myapp.module;

import test.qxc.com.myapp.module.api.ColumnApi;
import test.qxc.com.myapp.module.imodule.IColumnModule;
import test.qxc.com.mylibrary.base.BaseModule;
import test.qxc.com.mylibrary.net.HttpManager;
import test.qxc.com.mylibrary.net.ICallback;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/4.
 */

public class ColumnModule extends BaseModule<ColumnApi> implements IColumnModule {

    private HttpManager httpManager =  HttpManager.getInstance().setBaseUrl("http://news-at.zhihu.com/api/4/");

    @Override
    public void getData(ICallback callback) {

        deploy(httpManager.getApi(ColumnApi.class).getColumnBean(), callback);
    }

    @Override
    public void getData(int id, ICallback callback) {
        deploy(httpManager.getApi(ColumnApi.class).getColumnDetailBean(id), callback);
    }
}
