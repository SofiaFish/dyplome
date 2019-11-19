package com.example.dyplome;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class StoreTestsDBHelper extends SQLiteOpenHelper {

    StoreTests storeTests = new StoreTests();

    public StoreTestsDBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    //private static final String LOG_TAG = "myLog";

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


//    public void addContact(Contact contact) {
//        SQLiteDatabase db = this.getWritableDatabase();
//        ContentValues values = new ContentValues();
//        values.put(KEY_NAME, contact.getName());
//        values.put(KEY_PH_NO, contact.getPhoneNumber());
//
//        db.insert(TABLE_CONTACTS, null, values);
//        db.close();
//    }

    ContentValues values = new ContentValues();
    public void addTest(Test test){
        SQLiteDatabase db = this.getWritableDatabase();
        values.put(StoreTests.Test.ID, test.getId());
        values.put(StoreTests.Test.NAME, test.getName());
    }

    public void addQuestion(Question question){
        SQLiteDatabase db = this.getWritableDatabase();
        values.put(StoreTests.Question.ID, question.getId());
        values.put(StoreTests.Question.ID_TEST, question.getId_test());
        values.put(StoreTests.Question.QUESTION, question.getQuestion());
    }

    public void addAnswer(Answer answer){
        SQLiteDatabase db = this.getWritableDatabase();
        values.put(StoreTests.Answer.ID, answer.getId());
        values.put(StoreTests.Answer.ID_QUESTION, answer.getId_question());
        values.put(StoreTests.Answer.ANSWER, answer.getText());
        values.put(StoreTests.Answer.SCORE, answer.getScore());
    }

    public void addScore(Score score){
        SQLiteDatabase db = this.getWritableDatabase();
        values.put(StoreTests.Score.ID, score.getId());
        values.put(StoreTests.Score.ID_TEST, score.getId_test());
    }
}
