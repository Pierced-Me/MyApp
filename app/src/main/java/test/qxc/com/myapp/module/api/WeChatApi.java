package test.qxc.com.myapp.module.api;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;
import test.qxc.com.myapp.module.bean.WeChatBean;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2017/1/4.
 */

public interface WeChatApi {

    @GET("wxnew")
    Observable<WeChatBean> getWeChatBean(@Query("key") String key, @Query("num") int num, @Query("page") int page);
}
