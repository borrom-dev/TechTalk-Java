package com.angkorsuntrix.techtalk001.dagger.login;

import com.angkorsuntrix.techtalk001.login.LoginContract;
import com.angkorsuntrix.techtalk001.login.LoginContractor;
import com.angkorsuntrix.techtalk001.login.LoginContractorImp;
import com.angkorsuntrix.techtalk001.login.LoginPresenterContract;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = LoginModule.class)
public class LoginPresenterModule {

    @Singleton
    @Provides
    public LoginContractor provideInteractor(String s) {
        return new LoginContractorImp(s);
    }

    @Singleton
    @Provides
    public LoginContract.LoginPresenterContract provideLoginPresenter(LoginContractor interactor) {
        return new LoginPresenterContract(interactor);
    }
}
