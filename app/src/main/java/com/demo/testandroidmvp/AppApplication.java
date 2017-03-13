package com.demo.testandroidmvp;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2017/3/9.
 */

public class AppApplication extends Application {

    private AppComponent appComponent;

    public static AppApplication get(Context context) {
        return (AppApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        initAppComponent();
    }

    private void initAppComponent() {
        appComponent = DaggerAppComponent.builder().
                appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
