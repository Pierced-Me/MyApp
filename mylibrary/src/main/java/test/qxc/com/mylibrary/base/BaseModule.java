package test.qxc.com.mylibrary.base;

import java.net.SocketTimeoutException;
import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import test.qxc.com.mylibrary.net.ICallback;
import test.qxc.com.mylibrary.net.ResponseBean;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2016/12/28.
 */

public abstract class BaseModule<E> implements IBaseModule {

    private E api;
    private Subscription mSubscription;

    private Observable threadControl(Observable observable){
        return observable
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io());
    }

    public void setApi(E api) {
        this.api = api;
    }

    public E getApi() {
        return api;
    }

    private Subscription subscribe(Observable observable, final ICallback callback){
        return observable
                .subscribe(new Subscriber<ResponseBean>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        if(callback!=null){
                            if(e instanceof SocketTimeoutException)
                                callback.onFailed("服务器异常");
                            else
                                callback.onFailed(e.getMessage());
                        }

                    }
                    @Override
                    public void onNext(ResponseBean response) {
                        if(callback!=null) {
                            callback.onCompleted(response);
                        }
                    }
                });
    }

    private Subscription subscribeList(Observable observable, final ICallback callback){
        return observable
                .subscribe(new Subscriber<List<ResponseBean>>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        if(callback!=null){
                            if(e instanceof SocketTimeoutException)
                                callback.onFailed("服务器异常");
                            else
                                callback.onFailed(e.getMessage());
                        }

                    }
                    @Override
                    public void onNext(List<ResponseBean> list) {
                        if(callback!=null) {
                            callback.onCompleted(list);
                        }
                    }
                });
    }

    protected Subscription deploy(Observable observable, ICallback callback){
        mSubscription = subscribe(threadControl(observable),callback);
        return mSubscription;
    }

    protected Subscription deployList(Observable observable, ICallback callback){
        mSubscription = subscribeList(threadControl(observable),callback);
        return mSubscription;
    }


    @Override
    public void onDestroy() {
        if (null != mSubscription && mSubscription.isUnsubscribed()) {
            mSubscription.unsubscribe();
        }
    }

    public abstract void getData(ICallback callback);
}
