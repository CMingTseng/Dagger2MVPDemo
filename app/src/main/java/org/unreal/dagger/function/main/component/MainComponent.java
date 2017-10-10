package org.unreal.dagger.function.main.component;

import org.unreal.dagger.ActivityScope;
import org.unreal.dagger.function.main.MainActivity;
import org.unreal.dagger.function.main.module.MainModule;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
