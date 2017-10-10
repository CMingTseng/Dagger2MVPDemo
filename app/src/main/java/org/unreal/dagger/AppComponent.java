package org.unreal.dagger;

import org.unreal.dagger.data.http.OkhttpModule;
import org.unreal.dagger.data.http.RetrofitModule;
import org.unreal.dagger.data.http.local.module.LocalServiceModule;
import org.unreal.dagger.data.http.taobao.module.TaobaoIPLocationServiceModule;
import org.unreal.dagger.function.main.component.MainComponent;
import org.unreal.dagger.function.main.module.MainModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class,
        OkhttpModule.class,
        RetrofitModule.class,
        LocalServiceModule.class,
        TaobaoIPLocationServiceModule.class})
public interface AppComponent {

    MainComponent addSub(MainModule mainModule);
}
