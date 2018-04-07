package com.gujiao.demodagger.component;

import com.gujiao.demodagger.MainActivity;
import com.gujiao.demodagger.module.EngineModule;
import com.gujiao.demodagger.module.GsonModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {GsonModule.class, EngineModule.class})
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
