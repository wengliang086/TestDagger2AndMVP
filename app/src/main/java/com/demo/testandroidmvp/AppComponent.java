package com.demo.testandroidmvp;

import com.demo.testandroidmvp.ui.activity.SplashActivity;

import dagger.Component;

/**
 * Created by Administrator on 2017/3/10.
 */
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(SplashActivity splashActivity);
}
