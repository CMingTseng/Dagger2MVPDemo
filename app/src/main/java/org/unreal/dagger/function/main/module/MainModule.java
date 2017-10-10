package org.unreal.dagger.function.main.module;

import org.unreal.dagger.ActivityScope;
import org.unreal.dagger.function.main.contract.MainContract;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    private MainContract.View view;

    public MainModule(MainContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    public MainContract.View providerView() {
        return view;
    }

}
