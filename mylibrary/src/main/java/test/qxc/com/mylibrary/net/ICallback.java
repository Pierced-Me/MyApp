package test.qxc.com.mylibrary.net;

/**
 * 类的用途: 网络请求回调接口
 * @author: qinxiaochuan
 * @date: 2017/1/3
 */
public interface ICallback<T> {
    /**
     * 完成
     * @param t
     */
    void onCompleted(T t);

    /**
     * 失败
     * @param errMsg
     */
    void onFailed(String errMsg);
}
