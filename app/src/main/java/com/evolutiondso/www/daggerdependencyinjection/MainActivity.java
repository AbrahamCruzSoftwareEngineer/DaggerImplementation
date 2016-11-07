package com.evolutiondso.www.daggerdependencyinjection;

import android.content.SharedPreferences;
import android.os.PersistableBundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Inject
    @Named("Will")
    SharedPreferences sharedPreferences2;

    @Inject
    @Named("Raul")
    SharedPreferences sharedPreferences;


    @Inject
    Provider<SharedPreferences.Editor>editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//you have to compile the project so you dont get an error when you create your injection component
        Daggercomponent
                .builder()
                .sharedModule(new SharedModule(this))
                .build()
                .inject(this);


        for (int i=0; i<10; i++){
            SharedPreferences.Editor aux = editor.get();
            System.out.println(aux);
        }
    }



}
