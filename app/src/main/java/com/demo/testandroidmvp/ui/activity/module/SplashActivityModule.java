package com.demo.testandroidmvp.ui.activity.module;

import com.demo.testandroidmvp.ui.activity.SplashActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/3/10.
 */
@Module
public class SplashActivityModule {

    private SplashActivity splashActivity;

    public SplashActivityModule(SplashActivity splashActivity) {
        this.splashActivity = splashActivity;
    }

    @Provides
    SplashActivity providerSplashActivity() {
        return splashActivity;
    }
}
