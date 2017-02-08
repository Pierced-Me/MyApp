package test.qxc.com.myapp.module;

import test.qxc.com.myapp.module.api.HomeApi;
import test.qxc.com.myapp.module.imodule.IHomeModule;
import test.qxc.com.mylibrary.base.BaseModule;
import test.qxc.com.mylibrary.net.HttpManager;
import test.qxc.com.mylibrary.net.ICallback;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2016/12/30.
 */

public class HomeModule extends BaseModule<HomeApi> implements IHomeModule {

    private HttpManager httpManager = HttpManager.getInstance().setBaseUrl("http://news-at.zhihu.com/api/4/");

    @Override
    public void getData(ICallback callback) {

        deploy(httpManager.getApi(HomeApi.class).getHomeBean(), callback);
    }

    @Override
    public void getDetailData(int id, ICallback callback) {

        deploy(httpManager.getApi(HomeApi.class).getHomeDetailBean(id), callback);
    }
}
