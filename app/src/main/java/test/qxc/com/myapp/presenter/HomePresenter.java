package test.qxc.com.myapp.presenter;

import java.util.ArrayList;
import java.util.List;

import test.qxc.com.myapp.module.HomeModule;
import test.qxc.com.myapp.module.imodule.IHomeModule;
import test.qxc.com.myapp.module.bean.HomeBean;
import test.qxc.com.myapp.presenter.ipresenter.IHomePresenter;
import test.qxc.com.myapp.view.fragment.ifragment.IHomeFragment;
import test.qxc.com.mylibrary.base.BasePresenter;
import test.qxc.com.mylibrary.net.ICallback;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2016/12/30.
 */

public class HomePresenter extends BasePresenter<IHomeModule, IHomeFragment> implements IHomePresenter {

    public HomePresenter(IHomeFragment iHomeFragment) {
        super(iHomeFragment);
    }

    @Override
    protected IHomeModule createModel() {
        return new HomeModule();
    }

    @Override
    public void allot() {
        getModel().getData(new ICallback() {
            @Override
            public void onCompleted(Object o) {
                HomeBean homeBean = (HomeBean) o;
                ArrayList<Object> lists = new ArrayList<>();
                List<HomeBean.TopStoriesBean> top_stories = homeBean.getTop_stories();
                lists.add(top_stories);
                List<HomeBean.StoriesBean> stories = homeBean.getStories();
                lists.add(stories);
                getView().showData(lists);
            }

            @Override
            public void onFailed(String errMsg) {

            }
        });
    }
}
