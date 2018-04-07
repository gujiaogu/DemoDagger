package com.gujiao.demodagger;

import javax.inject.Inject;
import javax.inject.Named;

public class Car {
    private Engine engine;
    @Inject
    public Car(@Named("Gasoline") Engine engine) {
        this.engine = engine;
    }

    public String run() {
        return engine.work();
    }
}
