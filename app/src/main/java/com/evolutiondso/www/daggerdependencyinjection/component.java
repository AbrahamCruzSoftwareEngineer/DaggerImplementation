package com.evolutiondso.www.daggerdependencyinjection;

import android.content.SharedPreferences;

import dagger.Component;

/**
 * Created by Albrtx on 07/11/2016.
 */
@Component(modules = {SharedModule.class})
public interface component {
    void inject(MainActivity mainActivity);

}
