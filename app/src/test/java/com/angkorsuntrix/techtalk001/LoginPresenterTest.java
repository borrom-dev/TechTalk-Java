package com.angkorsuntrix.techtalk001;

import com.angkorsuntrix.techtalk001.login.LoginContract;
import com.angkorsuntrix.techtalk001.login.LoginContractor;
import com.angkorsuntrix.techtalk001.login.LoginPresenterContract;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {

    @Mock
    LoginContractor mLoginContractor;
    @Mock
    LoginContract.LoginView mView;

    private LoginPresenterContract mLoginPresenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        mLoginPresenter = new LoginPresenterContract(mLoginContractor);
    }

    @Test
    public void attachView() {
        mLoginPresenter.attachView(mView);
    }

    @Test
    public void LoginSuccessTest() {
        mLoginPresenter.attachView(mView);
        when(mView.getUserName()).thenReturn("borrom");
        when(mView.getPassword()).thenReturn("sync");
        when(mLoginContractor.loginUser("borrom", "sync")).thenReturn(true);

        mLoginPresenter.login();
        verify(mLoginContractor, times(1)).loginUser("borrom", "sync");
        verify(mView, times(1)).loginSuccess();
    }

    @Test
    public void loginWithWrongUserTest() {
        mLoginPresenter.attachView(mView);
        when(mView.getUserName()).thenReturn("bo");
        when(mView.getPassword()).thenReturn("sync");

        mLoginPresenter.login();
        verify(mLoginContractor, times(1)).loginUser("bo", "sync");
        verify(mView, times(1)).userNotExist();
    }

    @Test
    public void loginWithInvalidUsernameTest() {
        mLoginPresenter.attachView(mView);
        when(mView.getUserName()).thenReturn("");

        mLoginPresenter.login();
        verify(mLoginContractor, never()).loginUser(anyString(), anyString());
        verify(mView, times(1)).invalidUsername();
    }

    @Test
    public void loginWithInvalidPasswordTest() {
        mLoginPresenter.attachView(mView);
        when(mView.getPassword()).thenReturn("");
        when(mView.getUserName()).thenReturn("borrom");
        mLoginPresenter.login();
        verify(mLoginContractor, never()).loginUser(anyString(), anyString());
        verify(mView, times(1)).invalidPassword();
    }

    @Test
    public void logoutFailedTest() {

    }

    @Test(timeout = 1000)
    public void LogoutTimeoutTest() {

    }

}