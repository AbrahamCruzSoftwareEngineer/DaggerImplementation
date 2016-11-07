package com.evolutiondso.www.daggerdependencyinjection;

import android.app.Application;

import com.evolutiondso.www.daggerdependencyinjection.Dagger.component.NetComponent;
import com.evolutiondso.www.daggerdependencyinjection.Dagger.module.AppModule;
import com.evolutiondso.www.daggerdependencyinjection.Dagger.module.NetModule;

/**
 * Created by Albrtx on 07/11/2016.
 */
public class App extends Application {

    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://www.jsonplaceholder.typicode.com/"))
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}