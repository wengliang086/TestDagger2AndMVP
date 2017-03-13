package com.demo.testandroidmvp;

import android.app.Application;

/**
 * Created by Administrator on 2017/3/9.
 */

public class AppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        initAppComponent();
    }

    private void initAppComponent() {
        DaggerAppComponent.builder().
                appModule(new AppModule(this))
                .build();
    }
}
