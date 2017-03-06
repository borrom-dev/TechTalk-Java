package com.angkorsuntrix.techtalk001.dagger.login;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Singleton
    @Provides
    public String provideString() {
        return "Hello World From Lord";
    }

}
