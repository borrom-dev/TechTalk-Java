package com.angkorsuntrix.techtalk001.db.table;

public class UsersTable {

    public static final String TABLE = "users";

    public static final String COLUMN_ID = "_id";

    public static final String COLUMN_USERNAME = "username";

    public static final String COLUMN_PASSWORD = "password";

    private UsersTable() {
    }

    public static String getCreateUserTableQuery() {
        return "CREATE TABLE " + TABLE + "("
                + COLUMN_ID + " INTEGER NOT NULL PRIMARY KEY, "
                + COLUMN_USERNAME + " TEXT NOT NULL UNIQUE, "
                + COLUMN_PASSWORD + " TEXT NOT NULL"
                + ");";
    }
}