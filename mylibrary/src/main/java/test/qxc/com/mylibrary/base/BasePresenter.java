package test.qxc.com.mylibrary.base;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2016/12/30.
 */

public abstract class BasePresenter<M extends IBaseModule, V extends IBaseView> implements IBasePresenter {

    private V mView;

    private M mModel;

    public BasePresenter(V v) {
        mView = v;
        mModel = createModel();
        allot();
    }

    protected abstract M createModel();

    @Override
    public void onDestroy() {
        if(mModel!=null)
            mModel.onDestroy();
        mModel=null;
    }

    public V getView() {
        return mView;
    }

    public M getModel() {
        return mModel;
    }
}
