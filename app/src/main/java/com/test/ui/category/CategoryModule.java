package com.test.ui.category;

import com.test.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ankit on 3/5/17.
 */


@Module
public class CategoryModule {

    @ActivityScope
    @Provides
    CategoryPresenter provideCategoryPresenter() {
        return new CategoryPresenter();
    }


}
