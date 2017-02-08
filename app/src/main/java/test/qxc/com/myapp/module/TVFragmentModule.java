package test.qxc.com.myapp.module;

import test.qxc.com.myapp.module.api.TVApi;
import test.qxc.com.mylibrary.base.BaseModule;
import test.qxc.com.myapp.module.imodule.ITVFragmentModule;
import test.qxc.com.mylibrary.net.HttpManager;
import test.qxc.com.mylibrary.net.ICallback;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/6.
 */

public class TVFragmentModule extends BaseModule implements ITVFragmentModule {

    @Override
    public void getData(ICallback callback) {
    }

    @Override
    public void getData(String name, ICallback callback) {
        deploy(HttpManager.getInstance().setBaseUrl("http://www.quanmin.tv/").getApi(TVApi.class).getTVBean(name), callback);
    }
}
