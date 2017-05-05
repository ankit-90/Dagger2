package com.test.ui.category;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.test.R;
import com.test.base.BaseApp;
import com.test.common.BaseActivity;

import javax.inject.Inject;

/**
 * Created by ankit on 3/5/17.
 */

public class CategoryActivity extends BaseActivity implements CategoryContract.View {

    @Inject
    CategoryPresenter categoryPresenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        initInjector();
        categoryPresenter.onAttachView(this);
        categoryPresenter.getCategory();
    }

    /**
     * This is used to inject our dependencies. After this point they will be ready to use.
     */
    private void initInjector() {
        DaggerCategoryComponent.builder()
                .appComponent(BaseApp.getContext().getAppComponent())
                .categoryModule(new  CategoryModule())
                .build()
                .inject(this);

    }

    @Override
    public void showEmptyView() {

    }

    @Override
    public void hideEmptyView() {

    }
}
