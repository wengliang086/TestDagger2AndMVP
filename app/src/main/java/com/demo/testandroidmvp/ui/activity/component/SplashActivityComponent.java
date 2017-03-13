package com.demo.testandroidmvp.ui.activity.component;

import com.demo.testandroidmvp.ui.activity.SplashActivity;
import com.demo.testandroidmvp.ui.activity.module.SplashActivityModule;

import dagger.Component;

/**
 * Created by Administrator on 2017/3/10.
 */
@Component(modules = SplashActivityModule.class)
public interface SplashActivityComponent {

    SplashActivity inject(SplashActivity splashActivity);
}
