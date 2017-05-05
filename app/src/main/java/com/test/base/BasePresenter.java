package com.test.base;

/**
 * Created by ankit on 3/5/17.
 */

public interface BasePresenter {

    void onAttachView(BaseView  baseView);

    void onDetachView();

}
