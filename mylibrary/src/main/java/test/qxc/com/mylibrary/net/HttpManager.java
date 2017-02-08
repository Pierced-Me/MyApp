package test.qxc.com.mylibrary.net;

import android.text.TextUtils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 类的用途:
 *
 * @author: qinxiaochuan
 * @date: 2016/12/28.
 */

public class HttpManager {

    private volatile static HttpManager INSTANCE;
    private Retrofit mRetrofit;

    private HttpManager() {
    }

    private void getRetrofit(String baseUrl) {
        if (!TextUtils.isEmpty(baseUrl)) {
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .client(new OkHttpClient().newBuilder()
                            .addInterceptor(new HttpLoggingInterceptor(HttpLoggingInterceptor.Logger.DEFAULT)
                                    .setLevel(HttpLoggingInterceptor.Level.BODY))
                            .connectTimeout(10, TimeUnit.SECONDS)
                            .readTimeout(10, TimeUnit.SECONDS)
                            .writeTimeout(10, TimeUnit.SECONDS)
                            .retryOnConnectionFailure(true)
                            .build())
                    .build();
        }
    }

    public HttpManager setBaseUrl(String baseUrl) {
        getRetrofit(baseUrl);
        return this;
    }

    //获取单例
    public static HttpManager getInstance() {
        if (INSTANCE == null) {
            synchronized (HttpManager.class) {
                if (INSTANCE == null) {
                    INSTANCE = new HttpManager();
                }
            }
        }
        return INSTANCE;
    }
    //获取API
    public <T>T getApi(Class<T> cls) {
        return mRetrofit.create(cls);
    }
}
