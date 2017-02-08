package test.qxc.com.myapp.module.api;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;
import test.qxc.com.myapp.module.bean.ColumnBean;
import test.qxc.com.myapp.module.bean.ColumnDetailBean;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/4.
 */

public interface ColumnApi {

    @GET("sections")
    Observable<ColumnBean> getColumnBean();

    @GET("section/{id}")
    Observable<ColumnDetailBean> getColumnDetailBean(@Path("id") int id);
}
