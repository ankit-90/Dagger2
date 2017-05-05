package com.test.ui.category;

import com.test.base.BaseView;
import com.test.data.api.model.Category;
import com.test.data.api.rest.Repository;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by zapbuild on 3/5/17.
 */

public class CategoryPresenter implements CategoryContract.Presenter {

    private CategoryContract.View view;
    private final CompositeDisposable compositeDisposable = new CompositeDisposable();
    @Inject
    Repository  repository;



    @Override
    public void onAttachView(BaseView baseView) {
        view = (CategoryContract.View) baseView;
    }

    @Override
    public void onDetachView() {

    }

    @Override
    public void getCategory() {
        compositeDisposable.add(
        repository.getCategory()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Category>() {
                    @Override
                    public void accept(Category category) throws Exception {

                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {

                    }
                }));

    }
}
