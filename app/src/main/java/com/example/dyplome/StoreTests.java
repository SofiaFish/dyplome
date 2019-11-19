package com.example.dyplome;

import android.provider.BaseColumns;

public class StoreTests {

    public static class Test implements BaseColumns {
        public static final String ID = "id";
        public static final String TABLE_NAME = "test";
        public static final String NAME = "name";
    }

    public static class Score implements BaseColumns {
        public static final String ID = "id";
        public static final String ID_TEST = "id_test";
        public static final String TABLE_NAME = "score";
    }

    public static class Question implements BaseColumns {
        public static final String ID = "id";
        public static final String ID_TEST = "id_test";
        public static final String TABLE_NAME = "question";
        public static final String QUESTION = "questions";
    }

    public static class Answer implements BaseColumns {
        public static final String ID = "id";
        public static final String TABLE_NAME = "answer";
        public static final String ID_QUESTION = "id_question";
        public static final String ANSWER = "answer";
        public static final String SCORE = "score";
    }

    public static final String SQL_CREATE_TEST =
            "CREATE TABLE " + Test.TABLE_NAME + " (" +
                    Test.ID + " INTEGER PRIMARY KEY," +
                    Test.NAME + " TEXT)";

    public static final String SQL_CREATE_SCORE=
            "CREATE TABLE " + Score.TABLE_NAME + " (" +
                    Score.ID + " INTEGER PRIMARY KEY," +
                    Score.ID_TEST + " INTEGER)";

    public static final String SQL_CREATE_QUESTION =
            "CREATE TABLE " + Test.TABLE_NAME + " (" +
                    Question.ID + " INTEGER PRIMARY KEY," +
                    Question.ID_TEST + "INTEGER" +
                    Question.TABLE_NAME + " TEXT" +
                    Question.QUESTION + "TEXT)";

    public static final String SQL_CREATE_ANSWER =
            "CREATE TABLE " + Answer.TABLE_NAME + " (" +
                    Answer.ID + " INTEGER PRIMARY KEY," +
                    Answer.ID_QUESTION + " INTEGER" +
                    Answer.ANSWER + "TEXT" +
                    Answer.SCORE + "INTEGER)";



}
