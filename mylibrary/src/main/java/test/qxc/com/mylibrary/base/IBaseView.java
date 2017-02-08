package test.qxc.com.mylibrary.base;

/**
 * 类的用途: View模块的基类接口
 *
 * @author: qinxiaochuan
 * @date: 2016/12/30
 */
public interface IBaseView<T> {

    //展示数据
    void showData(T t);
}