package test.qxc.com.myapp.presenter;

import java.util.List;

import test.qxc.com.myapp.module.TVFragmentModule;
import test.qxc.com.myapp.module.bean.TVBean;
import test.qxc.com.myapp.module.imodule.ITVFragmentModule;
import test.qxc.com.myapp.presenter.ipresenter.ITVFragmentPresenter;
import test.qxc.com.myapp.view.fragment.ifragment.ITVFragment;
import test.qxc.com.mylibrary.base.BasePresenter;
import test.qxc.com.mylibrary.net.ICallback;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/6.
 */

public class TVFragmentPresenter extends BasePresenter<ITVFragmentModule, ITVFragment> implements ITVFragmentPresenter {

    public TVFragmentPresenter(ITVFragment itvFragment, String name) {
        super(itvFragment);
        getData(name);
    }

    @Override
    protected ITVFragmentModule createModel() {
        return new TVFragmentModule();
    }

    @Override
    public void allot() {

    }

    @Override
    public void getData(String name) {
        getModel().getData(name, new ICallback() {
            @Override
            public void onCompleted(Object o) {
                TVBean tvBean = (TVBean) o;
                List<TVBean.DataBean> data = tvBean.getData();
                getView().showData(data);
            }

            @Override
            public void onFailed(String errMsg) {

            }
        });
    }
}
