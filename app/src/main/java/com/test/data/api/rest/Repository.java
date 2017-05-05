package com.test.data.api.rest;

import com.test.data.api.model.Category;

import io.reactivex.Observable;

/**
 * Created by ankit on 3/5/17.
 */

public interface Repository {

    Observable<Category> getCategory();

}
