package test.qxc.com.myapp.module.api;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;
import test.qxc.com.myapp.module.bean.PlayBean;
import test.qxc.com.myapp.module.bean.TVBean;
import test.qxc.com.myapp.module.bean.TVMainBean;
import test.qxc.com.myapp.module.bean.TVTabBean;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/6.
 */

public interface TVApi {

    @GET("json/app/index/category/info-android.json?v=2.2.4&os=1&ver=4")
    Observable<List<TVTabBean>> getTVTabBean();

    @GET("json%2Fcategories%2F{name}%2Flist.json?11211639&os=1&v=2.2.4&os=1&ver=4")
    Observable<TVBean> getTVBean(@Path("name")String name);

    @GET("json/app/index/recommend/list-android.json?11241742&v=2.2.4&os=1&ver=4")
    Observable<TVMainBean> getTVMainBean();

    @GET("http://www.quanmin.tv/json/rooms/{uid}/info1.json?11241653&v=2.2.4&os=1&ver=4")
    Observable<PlayBean> getPlayBean(@Path("uid")String uid);
}
