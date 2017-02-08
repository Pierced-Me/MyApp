package test.qxc.com.myapp.presenter;

import android.util.Log;

import java.util.ArrayList;

import test.qxc.com.myapp.module.TVModule;
import test.qxc.com.myapp.module.bean.PlayBean;
import test.qxc.com.myapp.module.bean.TVTabBean;
import test.qxc.com.myapp.module.imodule.ITVModule;
import test.qxc.com.myapp.presenter.ipresenter.ITVPresenter;
import test.qxc.com.myapp.view.activity.iactivity.ITVActivity;
import test.qxc.com.mylibrary.base.BasePresenter;
import test.qxc.com.mylibrary.net.ICallback;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/6.
 */

public class TVPresenter extends BasePresenter<ITVModule, ITVActivity> implements ITVPresenter {

    private ArrayList<TVTabBean> list;

    public TVPresenter(ITVActivity itvActivity) {
        super(itvActivity);
    }

    @Override
    protected ITVModule createModel() {
        return new TVModule();
    }

    @Override
    public void allot() {
        getModel().getData(new ICallback() {
            @Override
            public void onCompleted(Object o) {

                list = (ArrayList<TVTabBean>) o;
                getView().showData(list);
            }

            @Override
            public void onFailed(String errMsg) {
            }
        });
    }

    public void toPlay(String uid) {
        getModel().getPlayData(uid, new ICallback() {
            @Override
            public void onCompleted(Object o) {
                PlayBean playBean = (PlayBean) o;
                PlayBean.Live live = playBean.live;
                getView().play(live.ws.hls.three.src);
            }

            @Override
            public void onFailed(String errMsg) {
                Log.d("TVPresenter   toPlay", "onFailed() called with: errMsg = [" + errMsg + "]");
            }
        });
    }
}
