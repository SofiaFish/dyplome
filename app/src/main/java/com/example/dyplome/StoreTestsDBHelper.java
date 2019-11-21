package com.example.dyplome;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class StoreTestsDBHelper extends SQLiteOpenHelper {

   // StoreTests storeTests = new StoreTests();

    public StoreTestsDBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    //private static final String LOG_TAG = "myLog";

    @Override
    public void onCreate(SQLiteDatabase db) {

        // Add tests
        addTest(new Test(0, "Шкала Бека"));
        addTest(new Test(1, "Шкала Гамильтона"));
        addTest(new Test(2, "Тест Басса-Дарки"));
        addTest(new Test(3, "Тест на реакцию"));

        //Beck scale  Questions
        addQuestion(new Question(0, 0, "Чувствуете ли вы грусть?"));
        addQuestion(new Question(1, 0, "Чувствуете ли вы тревогу за будущее?"));
        addQuestion(new Question(2, 0, "Чувствуете ли вы себя неудачником?"));

        addQuestion(new Question(3, 0, "Чувствуете ли вы удовлетыорение от жизни?"));
        addQuestion(new Question(4, 0, "Чувствуете ли вы себя виноватым в чем-то?"));
        addQuestion(new Question(5, 0, "Чувствуете ли вы, что можете быть наказанным?"));

        addQuestion(new Question(6, 0, "Разочароались ли вы в себе?"));
        addQuestion(new Question(7, 0, "Чувствуете ли вы себя хуже других?"));
        addQuestion(new Question(8, 0, "Думали ли вы покончить с собой?"));

        addQuestion(new Question(9, 0, "Часто ли вы плачете?"));
        addQuestion(new Question(10, 0, "Чувствуете ли вы раздражение?"));
        addQuestion(new Question(11, 0, "Чувствуете ли вы интерес к людям?"));

        addQuestion(new Question(12, 0, "Откладываете ли вы принятие решений?"));
        addQuestion(new Question(13, 0, "Чувствуете ли вы, что выглядите хуже обычного?"));
        addQuestion(new Question(14, 0, "Можете ли вы работать так же, как и раньше?"));

        addQuestion(new Question(15, 0, "Вы спите так же хорошо, как и раньше?"));
        addQuestion(new Question(16, 0, "Вы устаете так же, как обычно?"));
        addQuestion(new Question(17, 0, "Ваш аппетит такой же, как и раньше?"));

        addQuestion(new Question(18, 0, "Похудели ли вы в последнее время?"));
        addQuestion(new Question(19, 0, "Беспокоитесь ли вы о своем здоровье?"));
        addQuestion(new Question(20, 0, "Изменилось ли ваше сексуальное желание?"));

        //Answers

        addAnswer(new Answer(0, 0, "", 0));
        addAnswer(new Answer(1, 0, "", 1));
        addAnswer(new Answer(2, 0, "", 2));
        addAnswer(new Answer(3, 0, "", 3));

        addAnswer(new Answer(4, 1, "", 0));
        addAnswer(new Answer(5, 1, "", 1));
        addAnswer(new Answer(6, 1, "", 2));
        addAnswer(new Answer(7, 1, "", 3));

        addAnswer(new Answer(8, 2, "", 0));
        addAnswer(new Answer(9, 2, "", 1));
        addAnswer(new Answer(10, 2, "", 2));
        addAnswer(new Answer(11, 2, "", 3));

        addAnswer(new Answer(12, 3, "", 0));
        addAnswer(new Answer(13, 3, "", 1));
        addAnswer(new Answer(14, 3, "", 2));
        addAnswer(new Answer(15, 3, "", 3);

        addAnswer(new Answer(16, 4, "", 0));
        addAnswer(new Answer(17, 4, "", 1));
        addAnswer(new Answer(18, 4, "", 2));
        addAnswer(new Answer(19, 4, "", 3));

        addAnswer(new Answer(20, 5, "", 0));
        addAnswer(new Answer(21, 5, "", 1));
        addAnswer(new Answer(22, 5, "", 2));
        addAnswer(new Answer(23, 5, "", 3));

        addAnswer(new Answer(24, 6, "", 0));
        addAnswer(new Answer(25, 6, "", 1));
        addAnswer(new Answer(26, 6, "", 2));
        addAnswer(new Answer(27, 6, "", 3));

        addAnswer(new Answer(28, 7, "", 0));
        addAnswer(new Answer(29, 7, "", 1));
        addAnswer(new Answer(30, 7, "", 2));
        addAnswer(new Answer(31, 7, "", 3));

        addAnswer(new Answer(32, 8, "", 0));
        addAnswer(new Answer(33, 8, "", 1));
        addAnswer(new Answer(34, 8, "", 2));
        addAnswer(new Answer(35, 8, "", 3));

        addAnswer(new Answer(36, 9, "", 0));
        addAnswer(new Answer(37, 9, "", 1));
        addAnswer(new Answer(38, 9, "", 2));
        addAnswer(new Answer(39, 9, "", 3));

        addAnswer(new Answer(40, 10, "", 0));
        addAnswer(new Answer(41, 10, "", 1));
        addAnswer(new Answer(42, 10, "", 2));
        addAnswer(new Answer(43, 10, "", 3));

        addAnswer(new Answer(44, 11, "", 0));
        addAnswer(new Answer(45, 11, "", 1));
        addAnswer(new Answer(46, 11, "", 2));
        addAnswer(new Answer(47, 11, "", 3));

        addAnswer(new Answer(48, 12, "", 0));
        addAnswer(new Answer(49, 12, "", 1));
        addAnswer(new Answer(50, 12, "", 2));
        addAnswer(new Answer(51, 12, "", 3));

        addAnswer(new Answer(52, 13, "", 0));
        addAnswer(new Answer(53, 13, "", 1));
        addAnswer(new Answer(54, 13, "", 2));
        addAnswer(new Answer(55, 13, "", 3));

        addAnswer(new Answer(56, 14, "", 0));
        addAnswer(new Answer(57, 14, "", 1));
        addAnswer(new Answer(58, 14, "", 2));
        addAnswer(new Answer(59, 14, "", 3));

        addAnswer(new Answer(60, 15, "", 0));
        addAnswer(new Answer(61, 15, "", 1));
        addAnswer(new Answer(62, 15, "", 2));
        addAnswer(new Answer(63, 15, "", 3));

        addAnswer(new Answer(64, 16, "", 0));
        addAnswer(new Answer(65, 16, "", 1));
        addAnswer(new Answer(66, 16, "", 2));
        addAnswer(new Answer(67, 16, "", 3));

        addAnswer(new Answer(68, 17, "", 0));
        addAnswer(new Answer(69, 17, "", 1));
        addAnswer(new Answer(70, 17, "", 2));
        addAnswer(new Answer(71, 17, "", 3));

        addAnswer(new Answer(72, 18, "", 0));
        addAnswer(new Answer(73, 18, "", 1));
        addAnswer(new Answer(74, 18, "", 2));
        addAnswer(new Answer(75, 18, "", 3));

        addAnswer(new Answer(76, 19, "", 0));
        addAnswer(new Answer(77, 19, "", 1));
        addAnswer(new Answer(78, 19, "", 2));
        addAnswer(new Answer(79, 19, "", 3));

        addAnswer(new Answer(80, 20, "", 0));
        addAnswer(new Answer(81, 20, "", 1));
        addAnswer(new Answer(82, 20, "", 2));
        addAnswer(new Answer(83, 20, "", 3));

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    ContentValues values = new ContentValues();

    public void addTest(Test test){
        SQLiteDatabase db = this.getWritableDatabase();
        values.put(StoreTests.Test.ID, test.getId());
        values.put(StoreTests.Test.NAME, test.getName());

        db.insert(StoreTests.Test.TABLE_NAME, null, values);
        db.close();
    }

    public void addQuestion(Question question){
        SQLiteDatabase db = this.getWritableDatabase();
        values.put(StoreTests.Question.ID, question.getId());
        values.put(StoreTests.Question.ID_TEST, question.getId_test());
        values.put(StoreTests.Question.QUESTION, question.getQuestion());

        db.insert(StoreTests.Question.TABLE_NAME, null, values);
        db.close();
    }

    public void addAnswer(Answer answer){
        SQLiteDatabase db = this.getWritableDatabase();
        values.put(StoreTests.Answer.ID, answer.getId());
        values.put(StoreTests.Answer.ID_QUESTION, answer.getId_question());
        values.put(StoreTests.Answer.ANSWER, answer.getText());
        values.put(StoreTests.Answer.SCORE, answer.getScore());

        long newRowId = db.insert(StoreTests.Answer.TABLE_NAME, null, values);
        db.close();
    }

    public void addScore(Score score){
        SQLiteDatabase db = this.getWritableDatabase();
        values.put(StoreTests.Score.ID, score.getId());
        values.put(StoreTests.Score.ID_TEST, score.getId_test());

        db.insert(StoreTests.Score.TABLE_NAME, null, values);
        db.close();
    }
}
