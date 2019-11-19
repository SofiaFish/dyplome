package com.example.dyplome;

import android.provider.BaseColumns;

public class StoreTests {

    private StoreTests() {
    }

    public static class Test implements BaseColumns {
        public static final int ID = 0;
        public static final String TABLE_NAME = "test";
        public static final String NAME = "name";


    }

    public static class Question implements BaseColumns {
        public static final int ID = 0;
        public static final int ID_TEST = 0;
        public static final String TABLE_NAME = "question";
        public static final String QUESTION = "questions";

    }

    public static class Answer implements BaseColumns {
        public static final int ID = 0;
        public static final String TABLE_NAME = "answer";
        public static final int ID_QUESTION = 0;
        public static final String ANSWER = "answer";
        public static final int SCORE = 0;

    }

    private static final String SQL_CREATE_TEST =
            "CREATE TABLE " + Test.TABLE_NAME + " (" +
                    Test.ID + " INTEGER PRIMARY KEY," +
                    Test.NAME + " TEXT)";

    private static final String SQL_CREATE_QUESTION =
            "CREATE TABLE " + Test.TABLE_NAME + " (" +
                    Question.ID + " INTEGER PRIMARY KEY," +
                    Question.ID_TEST + "INTEGER" +
                    Question.TABLE_NAME + " TEXT" +
                    Question.QUESTION + "TEXT)";

    private static final String SQL_CREATE_TEST =
            "CREATE TABLE " + Answer.TABLE_NAME + " (" +
                    Answer.ID + " INTEGER PRIMARY KEY," +
                    Answer.ID_QUESTION + " INTEGER" +
                    Answer.ANSWER + "TEXT" +
                    Answer.SCORE + "INTEGER)";



}
