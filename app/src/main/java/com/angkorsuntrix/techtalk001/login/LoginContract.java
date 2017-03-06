package com.angkorsuntrix.techtalk001.login;

import com.angkorsuntrix.techtalk001.base.BaseView;
import com.angkorsuntrix.techtalk001.base.Presenter;

public interface LoginContract {

    interface LoginPresenterContract extends Presenter<LoginView> {

        void login();
    }

    interface LoginView extends BaseView {

        void login(boolean state);

        String getUserName();

        String getPassword();

        void invalidUsername();

        void userNotExist();

        void loginSuccess();

        void invalidPassword();
    }
}
