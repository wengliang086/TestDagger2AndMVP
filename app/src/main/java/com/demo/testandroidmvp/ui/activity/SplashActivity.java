package com.demo.testandroidmvp.ui.activity;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.demo.testandroidmvp.R;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/3/10.
 */

public class SplashActivity extends BaseActivity {

    Application application;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @Override
    protected void setupActivityComponet() {

    }
}
