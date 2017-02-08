package test.qxc.com.myapp.module;

import test.qxc.com.myapp.module.api.WeChatApi;
import test.qxc.com.myapp.module.imodule.IWeChatModule;
import test.qxc.com.mylibrary.base.BaseModule;
import test.qxc.com.mylibrary.net.HttpManager;
import test.qxc.com.mylibrary.net.ICallback;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/4.
 */

public class WeChatModule extends BaseModule<WeChatApi> implements IWeChatModule {

    @Override
    public void getData(int page, ICallback callback) {

        deploy(HttpManager.getInstance().setBaseUrl("http://api.tianapi.com/").getApi(WeChatApi.class).getWeChatBean("09691a96d0c41d30215a888632e1b96e", 10, page), callback);
    }

    @Override
    public void getData(ICallback callback) {

    }
}
