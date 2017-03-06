package com.angkorsuntrix.techtalk001.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class StorSQLiteHelper extends SQLiteOpenHelper {

    public StorSQLiteHelper(Context context) {
        super(context, "app_db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
