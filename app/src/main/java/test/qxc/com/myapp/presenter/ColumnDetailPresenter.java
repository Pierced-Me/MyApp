package test.qxc.com.myapp.presenter;

import java.util.List;

import test.qxc.com.myapp.module.ColumnModule;
import test.qxc.com.myapp.module.imodule.IColumnModule;
import test.qxc.com.myapp.module.bean.ColumnDetailBean;
import test.qxc.com.myapp.presenter.ipresenter.IColumnDetailPresenter;
import test.qxc.com.myapp.view.activity.iactivity.IColumnDetailActivity;
import test.qxc.com.mylibrary.base.BasePresenter;
import test.qxc.com.mylibrary.net.ICallback;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/5.
 */

public class ColumnDetailPresenter extends BasePresenter<IColumnModule, IColumnDetailActivity> implements IColumnDetailPresenter {

    public ColumnDetailPresenter(IColumnDetailActivity iColumnDetailActivity) {
        super(iColumnDetailActivity);
    }

    @Override
    public void allot() {

    }

    @Override
    protected IColumnModule createModel() {
        return new ColumnModule();
    }

    @Override
    public void allot(int id) {
        getModel().getData(id, new ICallback() {
            @Override
            public void onCompleted(Object o) {
                ColumnDetailBean columnDetailBean = (ColumnDetailBean) o;
                List<ColumnDetailBean.StoriesBean> stories = columnDetailBean.getStories();
                getView().showData(stories);
            }

            @Override
            public void onFailed(String errMsg) {

            }
        });
    }
}
