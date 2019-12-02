package com.example.dyplome.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper {

   // MyDB storeTests = new MyDB();

    private static DataBaseHelper mInstance = null;

    private Context mCxt;
    public static final String DB_NAME = "appDB";
    public static final int DB_VERSION = 1;

    public static DataBaseHelper getInstance(Context ctx) {
        if (mInstance == null) {
            mInstance = new DataBaseHelper(ctx.getApplicationContext());
        }
        return mInstance;
    }

    private DataBaseHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        this.mCxt = context;
    }
    //private static final String LOG_TAG = "myLog";

    @Override
    public void onCreate(SQLiteDatabase db) {
        DbCreator creator = new DbCreator(getWritableDatabase());
        creator.createBeck();
        creator.createHamilton();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
