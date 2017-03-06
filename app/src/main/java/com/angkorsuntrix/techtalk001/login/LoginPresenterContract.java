package com.angkorsuntrix.techtalk001.login;

import com.angkorsuntrix.techtalk001.base.BasePresenter;

public class LoginPresenterContract extends BasePresenter<LoginContract.LoginView>
        implements LoginContract.LoginPresenterContract {

    private LoginContractor mContractor;

    public LoginPresenterContract(LoginContractor contractor) {
        mContractor = contractor;
    }

    @Override
    public void login() {
        final String username = getView().getUserName();
        final String password = getView().getPassword();
        if (username.isEmpty()) {
            getView().invalidUsername();
            return;
        }
        if (password.isEmpty()) {
            getView().invalidPassword();
            return;
        }
        if (mContractor.loginUser(username, password)) {
            getView().loginSuccess();
        } else {
            getView().userNotExist();
        }
    }

}
