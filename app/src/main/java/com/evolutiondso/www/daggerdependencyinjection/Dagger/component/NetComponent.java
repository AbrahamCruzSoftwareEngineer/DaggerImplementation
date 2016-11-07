package com.evolutiondso.www.daggerdependencyinjection.Dagger.component;

import com.evolutiondso.www.daggerdependencyinjection.Dagger.module.AppModule;
import com.evolutiondso.www.daggerdependencyinjection.Dagger.module.NetModule;
import com.evolutiondso.www.daggerdependencyinjection.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Albrtx on 07/11/2016.
 */

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    void inject(MainActivity activity);
}