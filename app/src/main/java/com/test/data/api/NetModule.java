package com.test.data.api;

import android.support.annotation.NonNull;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import com.test.data.api.rest.Repository;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ankit on 3/5/17.
 */

@Module
public class NetModule {

    private static final String mBaseUrl = "http://202.164.44.250:9095/api";

    @Provides
    @Singleton
    Gson provideGson() {
        return new GsonBuilder()
                .setPrettyPrinting()
                .create();
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(mBaseUrl)
                .client(makeOkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

    }


    @Provides
    @Singleton
    Repository provideApi(Retrofit retrofit){
        return retrofit.create(Repository.class);
    }


    @NonNull
    private static OkHttpClient makeOkHttpClient() {
        final HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        //add the interceptor for logging the curl commands
        return new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .readTimeout(30, TimeUnit.SECONDS)
                .connectTimeout(40, TimeUnit.SECONDS)
                .cache(null)
                .build();
    }

}
