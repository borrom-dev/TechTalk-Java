package com.angkorsuntrix.techtalk001.login;

import com.angkorsuntrix.techtalk001.R;
import com.angkorsuntrix.techtalk001.base.BaseFragment;
import com.angkorsuntrix.techtalk001.dagger.login.DaggerLoginComponent;
import com.angkorsuntrix.techtalk001.dagger.login.LoginComponent;
import com.angkorsuntrix.techtalk001.dagger.login.LoginPresenterModule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import javax.inject.Inject;

import static com.angkorsuntrix.techtalk001.login.LoginContract.LoginView;

public class LoginFragment extends BaseFragment<LoginContract.LoginPresenterContract, LoginComponent>
        implements LoginView {

    private EditText mUsername;
    private EditText mPassword;
    private Button mLoginButton;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getComponent().inject(this);

    }

    @Override
    protected LoginComponent createConfigComponent() {
        return DaggerLoginComponent.builder()
                .loginPresenterModule(new LoginPresenterModule())
                .build();
    }

    @Inject
    @Override
    protected void configurePresenter(LoginContract.LoginPresenterContract presenter) {
        registerPresenter(presenter);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mUsername = (EditText) view.findViewById(R.id.txt_username);
        mPassword = (EditText) view.findViewById(R.id.txt_password);
        mLoginButton = (Button) view.findViewById(R.id.btn_login);
        mLoginButton.findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPresenter().login();
            }
        });
    }


    @Override
    public void login(boolean state) {

    }

    @Override
    public String getUserName() {
        return mUsername.getText().toString();
    }

    @Override
    public String getPassword() {
        return mPassword.getText().toString();
    }

    @Override
    public void invalidUsername() {
        mUsername.setText("invalid username");
    }

    @Override
    public void userNotExist() {

    }

    @Override
    public void loginSuccess() {
        mLoginButton.setVisibility(View.INVISIBLE);
    }

    @Override
    public void invalidPassword() {
        mPassword.setText("invalid username");
    }


}
