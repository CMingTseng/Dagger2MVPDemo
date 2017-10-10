package org.unreal.dagger.data.http.local.module;

import org.unreal.dagger.data.http.local.retrofit.LocalRetrofit;
import org.unreal.dagger.data.http.local.service.UserService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class LocalServiceModule {

    @Singleton
    @Provides
    public UserService providerUserService(LocalRetrofit retrofit) {
        return retrofit.getRetrofit().create(UserService.class);
    }
}
