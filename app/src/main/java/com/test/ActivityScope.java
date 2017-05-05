package com.test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by ankit on 3/5/17.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScope {

}
