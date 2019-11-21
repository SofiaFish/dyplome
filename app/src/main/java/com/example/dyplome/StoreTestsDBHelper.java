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
        addQuestion(new Question(0, 0, "Чувствуете ли вы себя расстртоенным?"));
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

        addAnswer(new Answer(0, 0, "Я не чувствую себя расстроенным, печальным.", 0));
        addAnswer(new Answer(1, 0, "Я расстроен", 1));
        addAnswer(new Answer(2, 0, "Я все время расстроен и не могу от этого отключиться", 2));
        addAnswer(new Answer(3, 0, "Я настолько расстроен и несчастлив, что не могу это выдержать", 3));

        addAnswer(new Answer(4, 1, "Я не тревожусь о будущем", 0));
        addAnswer(new Answer(5, 1, "Я чувствую, что озадачен будущим", 1));
        addAnswer(new Answer(6, 1, "Я чувствую, что меня ничего не ждет в будущем", 2));
        addAnswer(new Answer(7, 1, "Мое будущее безнадежно, и ничто не может измениться к лучшему", 3));

        addAnswer(new Answer(8, 2, "Я не чувствую себя неудачником", 0));
        addAnswer(new Answer(9, 2, "Я чувствую, что терпел больше неудач, чем другие люди", 1));
        addAnswer(new Answer(10, 2, "Когда я оглядываюсь на свою жизнь, я вижу в ней много неудач", 2));
        addAnswer(new Answer(11, 2, "Я чувствую, что как личность я - полный неудачник", 3));

        addAnswer(new Answer(12, 3, "Я получаю столько же удовлетворения от жизни, как раньше", 0));
        addAnswer(new Answer(13, 3, "Я не получаю столько же удовлетворения от жизни, как раньше", 1));
        addAnswer(new Answer(14, 3, "Я больше не получаю удовлетворения ни от чего", 2));
        addAnswer(new Answer(15, 3, "Я полностью не удовлетворен жизнью и мне все надоело", 3);

        addAnswer(new Answer(16, 4, "Я не чувствую себя в чем-нибудь виноватым", 0));
        addAnswer(new Answer(17, 4, "Достаточно часто я чувствую себя виноватым", 1));
        addAnswer(new Answer(18, 4, "Большую часть времени я чувствую себя виноватым", 2));
        addAnswer(new Answer(19, 4, "Я постоянно испытываю чувство вины", 3));

        addAnswer(new Answer(20, 5, "Я не чувствую, что могу быть наказанным за что-либо", 0));
        addAnswer(new Answer(21, 5, "Я чувствую, что могу быть наказан", 1));
        addAnswer(new Answer(22, 5, "Я ожидаю, что могу быть наказан", 2));
        addAnswer(new Answer(23, 5, "Я чувствую себя уже наказанным", 3));

        addAnswer(new Answer(24, 6, "Я не разочаровался в себе", 0));
        addAnswer(new Answer(25, 6, "Я разочаровался в себе", 1));
        addAnswer(new Answer(26, 6, "Я себе противен", 2));
        addAnswer(new Answer(27, 6, "Я себя ненавижу", 3));

        addAnswer(new Answer(28, 7, "Я знаю, что я не хуже других", 0));
        addAnswer(new Answer(29, 7, "Я критикую себя за ошибки и слабости", 1));
        addAnswer(new Answer(30, 7, "Я все время обвиняю себя за свои поступки", 2));
        addAnswer(new Answer(31, 7, "Я виню себя во всем плохом, что происходит", 3));

        addAnswer(new Answer(32, 8, "Я никогда не думал покончить с собой", 0));
        addAnswer(new Answer(33, 8, "Ко мне приходят мысли покончить с собой, но я не буду их осуществлять", 1));
        addAnswer(new Answer(34, 8, "Я хотел бы покончить с собой", 2));
        addAnswer(new Answer(35, 8, "Я бы убил себя, если бы представился случай", 3));

        addAnswer(new Answer(36, 9, "Я плачу не больше, чем обычно", 0));
        addAnswer(new Answer(37, 9, "Сейчас я плачу чаще, чем раньше", 1));
        addAnswer(new Answer(38, 9, "Теперь я все время плачу", 2));
        addAnswer(new Answer(39, 9, "Раньше я мог плакать, а сейчас не могу, даже если мне хочется", 3));

        addAnswer(new Answer(40, 10, "Сейчас я раздражителен не более, чем обычно", 0));
        addAnswer(new Answer(41, 10, "Я более легко раздражаюсь, чем раньше", 1));
        addAnswer(new Answer(42, 10, "Теперь я постоянно чувствую, что раздражен", 2));
        addAnswer(new Answer(43, 10, "Я стал равнодушен к вещам, которые меня раньше раздражали", 3));

        addAnswer(new Answer(44, 11, "Я не утратил интереса к другим людям", 0));
        addAnswer(new Answer(45, 11, "Я меньше интересуюсь другими людьми, чем раньше", 1));
        addAnswer(new Answer(46, 11, "Я почти потерял интерес к другим людям", 2));
        addAnswer(new Answer(47, 11, "Я полностью утратил интерес к другим людям", 3));

        addAnswer(new Answer(48, 12, "Я откладываю принятие решения иногда, как и раньше", 0));
        addAnswer(new Answer(49, 12, "Я чаще, чем раньше, откладываю принятие решения", 1));
        addAnswer(new Answer(50, 12, "Мне труднее принимать решения, чем раньше", 2));
        addAnswer(new Answer(51, 12, "Я больше не могу принимать решения", 3));

        addAnswer(new Answer(52, 13, "Я не чувствую, что выгляжу хуже, чем обычно", 0));
        addAnswer(new Answer(53, 13, "Меня тревожит, что я выгляжу старым и непривлекательным", 1));
        addAnswer(new Answer(54, 13, "Я знаю, что в моей внешности произошли существенные изменения, делающие меня непривлекательным", 2));
        addAnswer(new Answer(55, 13, "Я знаю, что выгляжу безобразно", 3));

        addAnswer(new Answer(56, 14, "Я могу работать так же хорошо, как и раньше", 0));
        addAnswer(new Answer(57, 14, "Мне необходимо сделать дополнительное усилие, чтобы начать делать что-нибудь", 1));
        addAnswer(new Answer(58, 14, "Я с трудом заставляю себя делать что-либо", 2));
        addAnswer(new Answer(59, 14, "Я совсем не могу выполнять никакую работу", 3));

        addAnswer(new Answer(60, 15, "Я сплю так же хорошо, как и раньше", 0));
        addAnswer(new Answer(61, 15, "Сейчас я сплю хуже, чем раньше", 1));
        addAnswer(new Answer(62, 15, "Я просыпаюсь на 1-2 часа раньше, и мне трудно заснуть опять", 2));
        addAnswer(new Answer(63, 15, "Я просыпаюсь на несколько часов раньше обычного и больше не могу заснуть", 3));

        addAnswer(new Answer(64, 16, "Я устаю не больше, чем обычно", 0));
        addAnswer(new Answer(65, 16, "Теперь я устаю быстрее, чем раньше", 1));
        addAnswer(new Answer(66, 16, "Я устаю почти от всего, что я делаю", 2));
        addAnswer(new Answer(67, 16, "Я не могу ничего делать из-за усталости", 3));

        addAnswer(new Answer(68, 17, "Мой аппетит не хуже, чем обычно", 0));
        addAnswer(new Answer(69, 17, "Мой аппетит стал хуже, чем раньше", 1));
        addAnswer(new Answer(70, 17, "Мой аппетит теперь значительно хуже", 2));
        addAnswer(new Answer(71, 17, "У меня вообще нет аппетита", 3));

        addAnswer(new Answer(72, 18, "В последнее время я не похудел или потеря веса была незначительной", 0));
        addAnswer(new Answer(73, 18, "За последнее время я потерял более 2 кг", 1));
        addAnswer(new Answer(74, 18, "Я потерял более 5 кг", 2));
        addAnswer(new Answer(75, 18, "Я потерял более 7 кr", 3));

        addAnswer(new Answer(76, 19, "Я беспокоюсь о своем здоровье не больше, чем обычно", 0));
        addAnswer(new Answer(77, 19, "Меня тревожат проблемы моего физического здоровья, такие, как боли, расстройство желудка, запоры и т.д.", 1));
        addAnswer(new Answer(78, 19, "Я очень обеспокоен своим физическим состоянием, и мне трудно думать о чем-либо другом", 2));
        addAnswer(new Answer(79, 19, "Я настолько обеспокоен своим физическим состоянием, что больше ни о чем не могу думать", 3));

        addAnswer(new Answer(80, 20, "В последнее время я не замечал изменения своего интереса к близости", 0));
        addAnswer(new Answer(81, 20, "Меня меньше занимают проблемы близости, чем раньше", 1));
        addAnswer(new Answer(82, 20, "Сейчас я значительно меньше интересуюсь сексом, чем раньше", 2));
        addAnswer(new Answer(83, 20, "Я полностью утратил интерес к сексу", 3));

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
