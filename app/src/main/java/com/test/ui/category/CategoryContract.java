package com.test.ui.category;

import com.test.base.BasePresenter;
import com.test.base.BaseView;

/**
 * Created by ankit on 3/5/17.
 */

public interface CategoryContract {

    interface View extends BaseView{

        void showEmptyView();

        void hideEmptyView();

    }

    interface Presenter extends BasePresenter{

        void getCategory();

    }

}
