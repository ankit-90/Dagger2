package com.test.data.api;

import com.test.data.api.model.Category;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by ankit on 3/5/17.
 */

public interface Service {

    @GET("categories/")
    Observable<Category> getData();

}
