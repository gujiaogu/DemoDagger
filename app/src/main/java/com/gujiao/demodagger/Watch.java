package com.gujiao.demodagger;

import android.util.Log;

import com.google.gson.Gson;

import javax.inject.Inject;

public class Watch {

    @Inject
    public Watch() {}

    public void work() {
        Log.d("======", "work");
    }
}
