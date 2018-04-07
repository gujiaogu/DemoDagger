package com.gujiao.demodagger.component;

import com.gujiao.demodagger.activity.SecondActivity;

import dagger.Component;

@Component
public interface SecondActivityComponent {
    void inject(SecondActivity activity);
}
