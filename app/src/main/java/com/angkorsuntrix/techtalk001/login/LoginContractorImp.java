package com.angkorsuntrix.techtalk001.login;

import android.text.TextUtils;
import android.util.Log;

public class LoginContractorImp implements LoginContractor {

    public LoginContractorImp(String s) {
        Log.d("BORROM", s);
    }

    @Override
    public boolean loginUser(String username, String password) {
        Log.d("BORROM", "BORROM");
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
            throw new IllegalArgumentException();
        }
        return true;
    }
}
