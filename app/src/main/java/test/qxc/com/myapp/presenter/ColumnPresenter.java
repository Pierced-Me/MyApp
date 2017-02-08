package test.qxc.com.myapp.presenter;

import java.util.List;

import test.qxc.com.myapp.module.ColumnModule;
import test.qxc.com.myapp.module.imodule.IColumnModule;
import test.qxc.com.myapp.module.bean.ColumnBean;
import test.qxc.com.myapp.presenter.ipresenter.IColumnPresenter;
import test.qxc.com.myapp.view.fragment.ifragment.IColumnFragment;
import test.qxc.com.mylibrary.base.BasePresenter;
import test.qxc.com.mylibrary.net.ICallback;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/4.
 */

public class ColumnPresenter extends BasePresenter<IColumnModule, IColumnFragment> implements IColumnPresenter {

    public ColumnPresenter(IColumnFragment iColumnFragment) {
        super(iColumnFragment);
    }

    @Override
    public void allot() {
        getModel().getData(new ICallback() {
            @Override
            public void onCompleted(Object o) {
                ColumnBean columnBean = (ColumnBean) o;
                List<ColumnBean.DataBean> datas = columnBean.getData();
                getView().showData(datas);
            }

            @Override
            public void onFailed(String errMsg) {

            }
        });
    }

    @Override
    protected IColumnModule createModel() {
        return new ColumnModule();
    }
}
