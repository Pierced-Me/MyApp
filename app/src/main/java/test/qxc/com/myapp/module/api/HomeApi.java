package test.qxc.com.myapp.module.api;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;
import test.qxc.com.myapp.module.bean.HomeBean;
import test.qxc.com.myapp.module.bean.HomeDetailBean;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2016/12/30.
 */

public interface HomeApi {

    @GET("news/latest")
    Observable<HomeBean> getHomeBean();

    @GET("news/{id}")
    Observable<HomeDetailBean> getHomeDetailBean(@Path("id")int id);
}
