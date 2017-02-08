package test.qxc.com.myapp.presenter;

import test.qxc.com.myapp.module.TVMainModule;
import test.qxc.com.myapp.module.bean.TVMainBean;
import test.qxc.com.myapp.module.imodule.ITVMainModule;
import test.qxc.com.myapp.view.fragment.ifragment.ITVMainFragment;
import test.qxc.com.mylibrary.base.BasePresenter;
import test.qxc.com.myapp.presenter.ipresenter.ITVMainPresenter;
import test.qxc.com.mylibrary.net.ICallback;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/10.
 */

public class TVMainPresenter extends BasePresenter<ITVMainModule, ITVMainFragment> implements ITVMainPresenter {

    public TVMainPresenter(ITVMainFragment itvMainFragment) {
        super(itvMainFragment);
    }

    @Override
    protected ITVMainModule createModel() {
        return new TVMainModule();
    }

    @Override
    public void allot() {
        getModel().getData(new ICallback() {
            @Override
            public void onCompleted(Object o) {
                TVMainBean tvMainBean = (TVMainBean) o;
                getView().showData(tvMainBean);
            }

            @Override
            public void onFailed(String errMsg) {
                System.out.print(errMsg);
            }
        });
    }
}
