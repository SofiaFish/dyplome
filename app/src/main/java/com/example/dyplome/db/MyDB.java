package com.example.dyplome.db;

import android.provider.BaseColumns;

public class MyDB {

    public static class Test implements BaseColumns {
        public static final String ID = "id";
        public static final String TABLE_NAME = "test";
        public static final String NAME = "name";
        public static final String IS_PASSED = "is_passed";
    }

    public static class Score implements BaseColumns {
        public static final String ID = "id";
        public static final String ID_TEST = "id_test";
        public static final String SCORE = "score";
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
        public static final String ID_TEST = "id_test";
        public static final String ID_QUESTION = "id_question";
        public static final String ANSWER = "answer_text";
        public static final String SCORE = "score";
    }

    public static class Therapy implements BaseColumns{
        public static final String TABLE_NAME = "therapy";
        public static final String THERAPY_ID = "id";
        public static final String THERAPY_NAME = "therapy_name";
    }

    public static  class Task implements  BaseColumns{
        public static final String TABLE_NAME = "task";
        public static final String TASK_ID = "task_id";
        public static final String TASK_NAME = "task_name";
        public static final String TASK = "task_task";
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
        public static final String TABLE_NAME = "scoreTest";
    }

    //about tables

    public static class User implements BaseColumns {
        public static final String TABLE_NAME = "user";
        public static final String ID = "id";
        public static final String GENDER = "gender";
        public static final String AGE = "age";
        public static final String WEIGHT = "weight";
    }


    //CREATE TABLES


    public static final String SQL_CREATE_TEST =
            "CREATE TABLE " + Test.TABLE_NAME + " (" +
                    Test.ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    Test.NAME + " TEXT, "+
                    Test.IS_PASSED + " INTEGER)";

    public static final String SQL_CREATE_SCORE =
            "CREATE TABLE " + Score.TABLE_NAME + " (" +
                    Score.ID + " INTEGER PRIMARY KEY, " +
                    Score.ID_TEST + " INTEGER)";

    public static final String SQL_CREATE_QUESTION =
            "CREATE TABLE " + Question.TABLE_NAME + " (" +
                    Question.ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    Question.ID_TEST + " INTEGER, " +
                    Question.QUESTION + " TEXT)";

    public static final String SQL_CREATE_ANSWER =
            "CREATE TABLE " + Answer.TABLE_NAME + " (" +
                    Answer.ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    Answer.ID_TEST + " INTEGER, " +
                    Answer.ID_QUESTION + " INTEGER, " +
                    Answer.ANSWER + " TEXT, " +
                    Answer.SCORE + " INTEGER)";

    //about tables
    public static final String SQL_CREATE_USER =
            "CREATE TABLE " + User.TABLE_NAME + " (" +
                    User.ID + " INTEGER PRIMARY KEY, " +
                    User.GENDER + " TEXT, " +
                    User.AGE + " INTEGER, " +
                    User.WEIGHT + " FLOAT)";


    //therapy table
    public static final String SQL_CREATE_THERAPY =
            "CREATE TABLE " + Therapy.TABLE_NAME + " (" +
                    Therapy.THERAPY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    Therapy.THERAPY_NAME + " TEXT )";

    public static final String SQL_CREATE_TASK =
            "CREATE TABLE " + Task.TABLE_NAME + " (" +
                    Task.TASK_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    Task.TASK_NAME + " TEXT, " +
                    Task.TASK + " TEXT )";

    //inner tables
    public static final String SQL_CREATE_TEST_QUESTION =
            "CREATE TABLE " + TestQuestion.TABLE_NAME + " (" +
                    TestQuestion.TEST_ID + " INTEGER, " +
                    TestQuestion.QUESTION_ID + " INTEGER, " +
                    "FOREIGN KEY(" + TestQuestion.TEST_ID + ") REFERENCES " + Test.TABLE_NAME + "(" + Test.ID + ")," +
                    "FOREIGN KEY(" + TestQuestion.QUESTION_ID + ") REFERENCES " + Question.TABLE_NAME + "(" + Question.ID + "))";

    public static final String SQL_CREATE_QUESTION_ANSWER =
            "CREATE TABLE " + QuestionAnswer.TABLE_NAME + " (" +
                    QuestionAnswer.QUESTION_ID + " INTEGER, " +
                    QuestionAnswer.ANSWER_ID + " INTEGER, " +
                    "FOREIGN KEY(" + QuestionAnswer.QUESTION_ID + ") REFERENCES " + Answer.TABLE_NAME + "(" + Answer.ID + ")," +
                    "FOREIGN KEY(" + QuestionAnswer.ANSWER_ID + ") REFERENCES " + Question.TABLE_NAME + "(" + Question.ID + "))";

    public static final String SQL_CREATE_SCORE_TEST =
            "CREATE TABLE " + ScoreTest.TABLE_NAME + " (" +
                    ScoreTest.SCORE_ID + " INTEGER, " +
                    ScoreTest.TEST_ID + " INTEGER, " +
                    "FOREIGN KEY(" + ScoreTest.SCORE_ID + ") REFERENCES " + Score.TABLE_NAME + "(" + Score.ID + ")," +
                    "FOREIGN KEY(" + ScoreTest.TEST_ID + ") REFERENCES " + Test.TABLE_NAME + "(" + Test.ID + "))";


}
