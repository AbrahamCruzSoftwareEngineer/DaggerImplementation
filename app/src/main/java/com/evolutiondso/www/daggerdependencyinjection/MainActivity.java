package com.evolutiondso.www.daggerdependencyinjection;

import android.content.SharedPreferences;
import android.os.PersistableBundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    SharedPreferences sharedPreferences;
    @Inject
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//you have to compile the projecto so you dont get an error when you create your injection component
        Daggercomponent
                .builder()
                .sharedModule(new SharedModule(this))
                .build()
                .inject(this);
    }



}
