package com.angkorsuntrix.techtalk001.dagger;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private Application mApp;

    public AppModule(Application app) {
        mApp = app;
    }

    @Singleton
    @Provides
    public Application provideApplication() {
        return mApp;
    }

//    @Singleton
//    @Provides
//    public StorIOSQLite provideStorIOSQLite(Application app) {
//        return DefaultStorIOSQLite.builder()
//                .sqliteOpenHelper(new StorSQLiteHelper(app))
//                .addTypeMapping(User.class, new UserSQLiteTypeMapping())
//                .build();
//    }


}
