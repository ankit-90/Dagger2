package com.test.ui.category;

import com.test.ActivityScope;
import com.test.AppComponent;

import dagger.Component;

/**
 * Created by zapbuild on 3/5/17.
 */

@ActivityScope
@Component(modules = CategoryModule.class,dependencies = AppComponent.class)
public interface CategoryComponent {

    void inject(CategoryActivity categoryActivity);

}
