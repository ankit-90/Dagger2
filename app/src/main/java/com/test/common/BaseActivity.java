package com.test.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.test.base.BaseView;

/**
 * Created by ankit on 3/5/17.
 */

public class BaseActivity extends AppCompatActivity implements BaseView {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void showLoading() {
        Log.d("Base","showLoading()");
    }

    @Override
    public void hideLoading() {
        Log.d("Base","hideLoading()");
    }
}
