package com.example.dyplome.db;

import android.provider.BaseColumns;

public class MyDB {

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

    //inner tables

    public static class TestQuestion implements BaseColumns {
        public static final String QUESTION_ID = "question_id";
        public static final String TEST_ID = "test_id";
        public static final String TABLE_NAME = "testQuestion";
    }

    public static class QuestionAnswer implements BaseColumns {
        public static final String QUESTION_ID = "question_id";
        public static final String ANSWER_ID = "answer_id";
        public static final String TABLE_NAME = "questionAnswer";
    }

    public static class ScoreTest implements BaseColumns {
        public static final String TEST_ID = "test_id";
        public static final String SCORE_ID = "score_id";
        public static final String TABLE_NAME = "test";
    }


    //about tables

    public static class Gender implements BaseColumns {
        public static final String ID = "gender_id";
        public static final String TABLE_NAME = "gender";
        public static final String GENDER = "gender";
    }
    public static class Age implements BaseColumns {
        public static final String ID = "age_id";
        public static final String TABLE_NAME = "age";
        public static final String AGE = "age";
    }
    public static class Weight implements BaseColumns {
        public static final String ID = "weight_id";
        public static final String TABLE_NAME = "weight";
        public static final String WEIGHT = "weight";
    }


    //CREATE TABLES


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

    //about tables

    public static final String SQL_CREATE_GENDER =
            "CREATE TABLE " + Gender.TABLE_NAME + " (" +
                    Gender.ID + " INTEGER PRIMARY KEY," +
                    Gender.GENDER + " TEXT)";

    public static final String SQL_CREATE_AGE =
            "CREATE TABLE " + Age.TABLE_NAME + " (" +
                    Age.ID + " INTEGER PRIMARY KEY," +
                    Age.AGE + " INTEGER)";

    public static final String SQL_WEIGHT =
            "CREATE TABLE " + Weight.TABLE_NAME + " (" +
                    Weight.ID + " INTEGER PRIMARY KEY," +
                    Weight.WEIGHT + " FLOAT)";


    //inner tables

    public static final String SQL_CREATE_TEST_QUESTION =
            "CREATE TABLE " + TestQuestion.TABLE_NAME + " (" +
                    TestQuestion.QUESTION_ID + " INTEGER," + "FOREIGN KEY (" + TestQuestion.QUESTION_ID + ") REFERENCES " +
                    Question.TABLE_NAME + "(" + Question.ID + ")" +
                    TestQuestion.TEST_ID + " INTEGER," + "FOREIGN KEY (" + TestQuestion.TEST_ID + ") REFERENCES " +
                    Test.TABLE_NAME + "(" + Test.ID + ")";

    public static final String SQL_CREATE_QUESTION_ANSWER =
            "CREATE TABLE " + QuestionAnswer.TABLE_NAME + " (" +
                    QuestionAnswer.QUESTION_ID + " INTEGER," +
                    "FOREIGN KEY (" + QuestionAnswer.QUESTION_ID + ") REFERENCES " +
                    Question.TABLE_NAME + "(" + Question.ID + ")" +
                    QuestionAnswer.ANSWER_ID + " INTEGER," + "FOREIGN KEY (" + QuestionAnswer.ANSWER_ID + ") REFERENCES " +
                    Answer.TABLE_NAME + "(" + Answer.ID + ")";

    public static final String SQL_CREATE_SCORE_TEST =
            "CREATE TABLE " + ScoreTest.TABLE_NAME + " (" +
                    ScoreTest.SCORE_ID + " INTEGER," +
                    "FOREIGN KEY (" + ScoreTest.TEST_ID + ") REFERENCES " +
                    Test.TABLE_NAME + "(" + Test.ID + ")" +
                    ScoreTest.SCORE_ID + " INTEGER," +
                    "FOREIGN KEY (" + ScoreTest.SCORE_ID + ") REFERENCES " +
                    Score.TABLE_NAME + "(" + Score.ID + ")";

}
