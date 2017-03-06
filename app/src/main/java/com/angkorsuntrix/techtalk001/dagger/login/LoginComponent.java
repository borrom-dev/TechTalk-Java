package com.angkorsuntrix.techtalk001.dagger.login;

import com.angkorsuntrix.techtalk001.login.LoginFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = LoginPresenterModule.class)
public interface LoginComponent {
    void inject(LoginFragment loginFragment);
}
