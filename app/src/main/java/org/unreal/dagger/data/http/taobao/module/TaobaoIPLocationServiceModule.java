package org.unreal.dagger.data.http.taobao.module;


import org.unreal.dagger.data.http.taobao.retrofit.TaobaoRetrofit;
import org.unreal.dagger.data.http.taobao.service.TaobaoIPLocationService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class TaobaoIPLocationServiceModule {

    @Singleton
    @Provides
    public TaobaoIPLocationService proidverIPLocationServiceModule(TaobaoRetrofit taoBaoRetrofitClient) {
        return taoBaoRetrofitClient.getRetrofit().create(TaobaoIPLocationService.class);
    }
}
