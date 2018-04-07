package com.gujiao.demodagger.module;

import com.gujiao.demodagger.DieselEngine;
import com.gujiao.demodagger.Engine;
import com.gujiao.demodagger.GasolineEngine;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class EngineModule {

    @Provides
    @Named("Gasoline")
    public Engine provideGasolineEngine() {
        return new GasolineEngine();
    }

    @Provides
    @Named("Diesel")
    public Engine provideDieselEngine() {
        return new DieselEngine();
    }

}
