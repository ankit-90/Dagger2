package com.test;

import android.app.Application;

import com.test.data.api.NetModule;
import com.test.data.api.Service;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ankit on 3/5/17.
 */

// a component whose life span is the application life span
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface AppComponent {

    Application context();

    Service service();

}
