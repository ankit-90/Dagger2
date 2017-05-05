package com.test.base;

import android.app.Application;

import com.test.AppComponent;
import com.test.AppModule;
import com.test.DaggerAppComponent;
import com.test.data.api.NetModule;

 /**
 * Created by ankit on 3/5/17.
 */

public class BaseApp extends Application {

    private static BaseApp baseApp;
    private AppComponent appComponent;


    public static BaseApp getContext(){
        return baseApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        baseApp = this;
        appComponent = initInjector();
    }

    protected AppComponent initInjector(){
        return DaggerAppComponent.builder()
                .netModule(new NetModule())
                .appModule(new AppModule(this))
                .build();
    }


    public AppComponent getAppComponent(){
        return appComponent;
    }

}
