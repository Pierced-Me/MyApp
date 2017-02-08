package test.qxc.com.myapp.module;

import test.qxc.com.myapp.module.api.TVApi;
import test.qxc.com.myapp.module.imodule.ITVModule;
import test.qxc.com.mylibrary.base.BaseModule;
import test.qxc.com.mylibrary.net.HttpManager;
import test.qxc.com.mylibrary.net.ICallback;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/6.
 */

public class TVModule extends BaseModule implements ITVModule {

    private TVApi api = HttpManager.getInstance().setBaseUrl("http://www.quanmin.tv/").getApi(TVApi.class);

    @Override
    public void getData(ICallback callback) {
        deployList(api.getTVTabBean(), callback);
    }

    @Override
    public void getData(String name, ICallback callback) {
        deploy(api.getTVBean(name), callback);
    }

    public void getPlayData(String uid, ICallback callback) {
        deploy(api.getPlayBean(uid), callback);
    }
}
