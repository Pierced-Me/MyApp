package test.qxc.com.myapp.presenter;

import java.util.ArrayList;
import java.util.List;

import test.qxc.com.myapp.module.imodule.IWeChatModule;
import test.qxc.com.myapp.module.WeChatModule;
import test.qxc.com.myapp.module.bean.WeChatBean;
import test.qxc.com.myapp.other.MyType;
import test.qxc.com.myapp.presenter.ipresenter.IWeChatPresenter;
import test.qxc.com.myapp.view.fragment.ifragment.IWeChatFragment;
import test.qxc.com.mylibrary.base.BasePresenter;
import test.qxc.com.mylibrary.net.ICallback;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/4.
 */

public class WeChatPresenter extends BasePresenter<IWeChatModule, IWeChatFragment> implements IWeChatPresenter {

    private static int page = 1;
    private List<WeChatBean.NewslistBean> allData = new ArrayList<>();
    private MyType currentType;

    public WeChatPresenter(IWeChatFragment iWeChatFragment) {
        super(iWeChatFragment);
    }

    @Override
    protected IWeChatModule createModel() {
        return new WeChatModule();
    }

    @Override
    public void allot() {
        getModel().getData(page, new ICallback() {
            @Override
            public void onCompleted(Object o) {

                WeChatBean weChatBean = (WeChatBean) o;
                List<WeChatBean.NewslistBean> newslist = weChatBean.getNewslist();
                allData.addAll(newslist);
                if (currentType == MyType.LOAD){
                    getView().nofityMe();
                    return;
                }
                getView().showData(allData);
            }

            @Override
            public void onFailed(String errMsg) {

            }
        });
    }

    @Override
    public void loadData(MyType type) {
        if (type == MyType.LOAD) {
            page++;
            currentType = MyType.LOAD;
        }else {
            allData.clear();
            currentType = MyType.REFRESH;
        }
        allot();
    }

}
