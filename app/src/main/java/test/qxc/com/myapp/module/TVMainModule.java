package test.qxc.com.myapp.module;

import test.qxc.com.myapp.module.api.TVApi;
import test.qxc.com.mylibrary.base.BaseModule;
import test.qxc.com.myapp.module.imodule.ITVMainModule;
import test.qxc.com.mylibrary.net.HttpManager;
import test.qxc.com.mylibrary.net.ICallback;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/10.
 */

public class TVMainModule extends BaseModule<TVApi> implements ITVMainModule {

    @Override
    public void getData(ICallback callback) {
        deploy(HttpManager.getInstance().setBaseUrl("http://www.quanmin.tv/").getApi(TVApi.class).getTVMainBean(), callback);
    }
}
