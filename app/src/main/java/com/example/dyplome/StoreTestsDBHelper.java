package com.example.dyplome;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class StoreTestsDBHelper extends SQLiteOpenHelper {

   // StoreTests storeTests = new StoreTests();

    public static final String DB_NAME = "appDB";
    public static final int DB_VERSION = 1;

    public StoreTestsDBHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }
    //private static final String LOG_TAG = "myLog";

    @Override
    public void onCreate(SQLiteDatabase db) {

        DbCreator creator = new DbCreator(getWritableDatabase());
        creator.create();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
