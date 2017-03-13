package com.demo.testandroidmvp;

import com.demo.testandroidmvp.ui.activity.SplashActivity;
import com.demo.testandroidmvp.ui.activity.component.SplashActivityComponent;
import com.demo.testandroidmvp.ui.activity.module.SplashActivityModule;

import dagger.Component;

/**
 * Created by Administrator on 2017/3/10.
 */
@Component(modules = AppModule.class)
public interface AppComponent {

    SplashActivityComponent plus(SplashActivityModule module);
}
