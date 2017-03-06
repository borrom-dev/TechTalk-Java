package com.angkorsuntrix.techtalk001.domain;

import com.angkorsuntrix.techtalk001.db.table.UsersTable;
import com.pushtorefresh.storio.sqlite.annotations.StorIOSQLiteColumn;
import com.pushtorefresh.storio.sqlite.annotations.StorIOSQLiteType;

import android.support.annotation.Nullable;

@StorIOSQLiteType(table = UsersTable.TABLE)
public class User {

    @Nullable
    @StorIOSQLiteColumn(name = UsersTable.COLUMN_ID, key = true)
    long id;

    @Nullable
    @StorIOSQLiteColumn(name = UsersTable.COLUMN_USERNAME, key = true)
    String mUsername;

    @Nullable
    @StorIOSQLiteColumn(name = UsersTable.COLUMN_PASSWORD, key = true)
    String mPassword;

    @Nullable
    public long getId() {
        return id;
    }

    public User() {
    }

    public void setId(@Nullable long id) {
        this.id = id;
    }

    @Nullable
    public String getUsername() {
        return mUsername;
    }

    public void setUsername(String username) {
        mUsername = username;
    }

    @Nullable
    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }

    @Override
    public String toString() {
        return String.format("User {%s, %s}", mUsername, mPassword);
    }
}
