package com.demo.testandroidmvp.ui.activity;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.demo.testandroidmvp.AppApplication;
import com.demo.testandroidmvp.AppModule;
import com.demo.testandroidmvp.DaggerAppComponent;
import com.demo.testandroidmvp.R;
import com.demo.testandroidmvp.ui.activity.module.SplashActivityModule;
import com.demo.testandroidmvp.ui.activity.presenter.SplashActivityPresenter;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/3/10.
 */

public class SplashActivity extends BaseActivity {

    @Inject
    SplashActivityPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        findViewById(R.id.id_btn_showRespositories).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected void setupActivityComponet() {
        AppApplication.get(this).getAppComponent()
                .plus(new SplashActivityModule(this))
                .inject(this);
    }
}
