package com.evolutiondso.www.daggerdependencyinjection;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Albrtx on 07/11/2016.
 */
//@override tells the parent method that it wants to run it instead of it
@Module
public class SharedModule {

    private Context context;
    SharedModule(Context context){
        this.context = context;
    }

    @Provides
    public SharedPreferences provideShared(){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Provides
    public SharedPreferences.Editor provideEditor(SharedPreferences sharedPreferences){
        return sharedPreferences.edit();
    }


}
