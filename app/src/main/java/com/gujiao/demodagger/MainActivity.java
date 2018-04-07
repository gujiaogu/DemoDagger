package com.gujiao.demodagger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.gujiao.demodagger.activity.SecondActivity;
import com.gujiao.demodagger.component.DaggerMainActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Watch watch;
    @Inject
    Gson gson;
    @Inject
    Car car;

    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mText = findViewById(R.id.text);
        mText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
        DaggerMainActivityComponent.create().inject(this);
        watch.work();
        String test = gson.toJson(new Watch());
        Log.d("====", test);
        String s = car.run();
        Log.d("======", s);
    }
}
