package com.evolutiondso.www.daggerdependencyinjection;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Named;

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
    @Named("Will")
    public SharedPreferences provideSharedWill(){
    //    return PreferenceManager.getDefaultSharedPreferences(context);
        return context.getSharedPreferences("WILL", Context.MODE_PRIVATE);
    }


    @Provides
    @Named("Raul")
    public SharedPreferences provideSharedRaul(){
        //    return PreferenceManager.getDefaultSharedPreferences(context);
        return context.getSharedPreferences("RAUL", Context.MODE_PRIVATE);
    }


    @Provides
    public SharedPreferences.Editor provideEditor(@Named("Raul") SharedPreferences sharedPreferences){
        return sharedPreferences.edit();
    }


}
