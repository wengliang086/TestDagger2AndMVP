package com.demo.testandroidmvp;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/3/10.
 */
@Module
public class AppModule {

    private Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    public Application providerApplication() {
        return application;
    }
}
