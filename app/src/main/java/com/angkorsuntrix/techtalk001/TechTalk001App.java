package com.angkorsuntrix.techtalk001;

import com.angkorsuntrix.techtalk001.dagger.AppComponent;
import com.angkorsuntrix.techtalk001.dagger.DaggerAppComponent;

import android.app.Application;

public class TechTalk001App extends Application {

    private AppComponent mComponent;
    private static TechTalk001App sInstance;

    public TechTalk001App() {
        sInstance = this;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mComponent = DaggerAppComponent.builder()
                .build();

    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    public static synchronized AppComponent getComponent() {
        return sInstance.mComponent;
    }


}
