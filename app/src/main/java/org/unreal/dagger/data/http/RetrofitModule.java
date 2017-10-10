package org.unreal.dagger.data.http;

import org.unreal.dagger.data.http.local.retrofit.LocalRetrofit;
import org.unreal.dagger.data.http.taobao.retrofit.TaobaoRetrofit;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

@Module
public class RetrofitModule {

    @Singleton
    @Provides
    public LocalRetrofit providerLocalRetrofit(@Named("default") OkHttpClient okHttpClient) {
        return new LocalRetrofit(okHttpClient);
    }

    @Singleton
    @Provides
    public TaobaoRetrofit providerTaobaoRetrofit(@Named("cache") OkHttpClient okHttpClient) {
        return new TaobaoRetrofit(okHttpClient);
    }
}
