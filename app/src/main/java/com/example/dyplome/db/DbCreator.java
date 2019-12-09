package com.example.dyplome.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.dyplome.model.Answer;
import com.example.dyplome.model.Question;
import com.example.dyplome.model.Score;
import com.example.dyplome.model.Test;
import com.example.dyplome.model.TestModel;
import com.example.dyplome.model.User;

import java.util.ArrayList;
import java.util.List;

public class DbCreator {

    SQLiteDatabase db;

    public DbCreator(SQLiteDatabase db) {
        this.db = db;
    }

    //addTest(new Test(2, "Тест на реакцию"));

    public void addTables(){
        db.execSQL(MyDB.SQL_CREATE_TEST);
        db.execSQL(MyDB.SQL_CREATE_QUESTION);
        db.execSQL(MyDB.SQL_CREATE_ANSWER);
        db.execSQL(MyDB.SQL_CREATE_SCORE);
        db.execSQL(MyDB.SQL_CREATE_QUESTION_ANSWER);
        db.execSQL(MyDB.SQL_CREATE_SCORE_TEST);
        db.execSQL(MyDB.SQL_CREATE_TEST_QUESTION);
        db.execSQL(MyDB.SQL_CREATE_USER);

    }

    public void createBeck(){

        // Add tests
        addTest(new Test(0, "Шкала Бека"));
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
        addAnswer(new Answer(15, 3, "Я полностью не удовлетворен жизнью и мне все надоело", 3));

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

    public void createHamilton(){
        addTest(new Test(1, "Шкала Гамильтона"));

        //Add Questions
        addQuestion(new Question(0, 1, "Депрессивное настроение\n" + "\n" +
                "Подавленность, безнадежность, беспомощность, ненужность" + "\n"));
        addQuestion(new Question(1, 1, "Чувство вины\n" + "\n"));
        addQuestion(new Question(2, 1, "Суицидальные намерения\n" + "\n"));

        addQuestion(new Question(3, 1, "Ранняя бессонница (трудности при засыпании)\n" + "\n"));
        addQuestion(new Question(4, 1, "Средняя бессонница (бессонница)\n" + "\n"));
        addQuestion(new Question(5, 1, "Поздняя бессонница (ранние пробуждения)\n" + "\n"));

        addQuestion(new Question(6, 1, "Работоспособность и деятельность\n" + "\n"));
        addQuestion(new Question(7, 1, "Заторможенность\n" + "\n" +
                " Замедленность мышления и речи; нарушение способности к концентрации; снижение двигательной активности" + "\n"));
        addQuestion(new Question(8, 1, "Ажитация (возбуждение)\n" + "\n"));

        addQuestion(new Question(9, 1, "Психическая тревога\n" + "\n" + " Проявления: \n" +
                "\n" + " Субъективное напряжение и раздражительность, снижение концентрации\n" +
                "\n" + " Беспокойство по незначительному поводу\n" +
                "\n" + " Страхи \n" +
                "\n" + " Боится высказываться, пока не спросили\n" +
                "\n" + " Чувство паники\n" +
                "\n" + " Чувство нервозности "));
        addQuestion(new Question(10, 1, "Соматическая тревога \n" +
                "\n" + "Физиологические проявления тревоги: \n" +
                "\n" + "Желудочно-кишечные: сухость во рту, метеоризм, диспепсия, диарея, спазмы, отрыжка\n" +
                "\n" + "Сердечно-сосудистые: сердцебиение, головные боли\n" +
                "\n" + "Дыхательные: гипервентиляция, одышка\n" +
                "\n" + "Учащенное мочеиспускание\n" +
                "\n" + "Потливость\n" +
                "\n" + "Головокружение, диплопия\n" +
                "\n" + "Шум в ушах" + "\n"));
        addQuestion(new Question(11, 1, " Желудочно-кишечные соматические симптомы\n" + "\n"));
        addQuestion(new Question(12, 1, "Общие соматические симптомы\n" + "\n"));
        addQuestion(new Question(13, 1, "Ипохондрия\n" + "\n"));
        addQuestion(new Question(14, 1, "Снижение массы тела\n" + "\n"));

        addQuestion(new Question(15, 1, "Критичность\n" + "\n"));






        addAnswer(new Answer(0, 0, "0 = отсутствуют", 0));
        addAnswer(new Answer(1, 0, " 1 = мрачность, пессимизм, безнадежность", 1));
        addAnswer(new Answer(2, 0, "2 = периодическая плаксивость", 2));
        addAnswer(new Answer(3, 0, " 3 = частая плаксивость", 3));
        addAnswer(new Answer(4, 0, "4 = выражаю только эти чувства как в спонтанных высказываниях, так и невербально", 3));

        addAnswer(new Answer(5, 1, "0 = отсутствует", 0));
        addAnswer(new Answer(6, 1, "1 = самоуничижение, считаю, что подвел других", 1));
        addAnswer(new Answer(7, 1, "2 = идеи собственной вины, постоянно размышляю о прошлых ошибках или грехах", 2));
        addAnswer(new Answer(8, 1, "3 = настоящее заболевание расцениваю как наказание", 3));
        addAnswer(new Answer(9, 1, "4 = вербальные галлюцинации обвиняющего или осуждающего содержания и/или зрительные галлюцинации угрожающего содержания", 4));

        addAnswer(new Answer(10, 2, "0 = отсутсвуют", 0));
        addAnswer(new Answer(11, 2, "1 = чувствует, что жить не стоит", 1));
        addAnswer(new Answer(12, 2, "2 = желание смерти, мысли о возможности собственной смерти", 2));
        addAnswer(new Answer(13, 2, "3 = суицидальные мысли или жесты", 3));
        addAnswer(new Answer(14, 2, "4 = суицидальные попытки ", 4));

        addAnswer(new Answer(15, 3, "0 = отсутствие затруднений при засыпании", 0));
        addAnswer(new Answer(16, 3, "1 = эпизодические затруднения засыпания, т.е. более получаса", 1));
        addAnswer(new Answer(17, 3, "2 = трудности при засыпании каждую ночь", 2));

        addAnswer(new Answer(18, 4, "0 = отсутствует", 0));
        addAnswer(new Answer(19, 4, "1 = беспокойный сон", 1));
        addAnswer(new Answer(20, 4, "2 = пробуждения в течение ночи ", 2));

        addAnswer(new Answer(21, 5, "0 = отсутствует", 0));
        addAnswer(new Answer(22, 5, "1 = раннее пробуждение утром с последующим засыпанием", 1));
        addAnswer(new Answer(23, 5, "2 = при пробуждении заснуть повторно не удается", 2));

        addAnswer(new Answer(24, 6, "0 = трудностей не испытываю", 0));
        addAnswer(new Answer(25, 6, "1 = мысли и ощущения усталости, слабости, несостоятельности, связанные с работой и хобби", 1));
        addAnswer(new Answer(26, 6, "2 = утрата интереса к деятельности – работе или хобби", 2));
        addAnswer(new Answer(27, 6, "3 = уменьшение реального времени, проведенного за работой, или снижение продуктивности", 3));
        addAnswer(new Answer(28, 6, "4 = неработоспособен по причине настоящего заболевания", 3));

        addAnswer(new Answer(29, 7, "0 = нормальная речь и мышление", 0));
        addAnswer(new Answer(30, 7, "1 = легкая заторможенность при беседе", 1));
        addAnswer(new Answer(31, 7, "2 = заметная заторможенность при бесед", 2));
        addAnswer(new Answer(32, 7, "3 = проведение бесед затруднено", 3));
        addAnswer(new Answer(33, 7, "4 = проведение бесед невозможно", 4));

        addAnswer(new Answer(34, 8, "0 = отсутствует", 0));
        addAnswer(new Answer(35, 8, "1 = беспокойство", 1));
        addAnswer(new Answer(36, 8, "2 = беспокойные движения руками, перебирание волос, очевидное беспокойство", 2));
        addAnswer(new Answer(37, 8, "3 = подвижность, неусидчивость", 3));
        addAnswer(new Answer(38, 8, "4 = постоянное перебирание руками, обкусывание ногтей, выдергивание волос, покусывание губ", 4));

        addAnswer(new Answer(39, 9, "0 = отсутствует", 0));
        addAnswer(new Answer(40, 9, "1 = легкая", 1));
        addAnswer(new Answer(41, 9, "2 = умеренная", 2));
        addAnswer(new Answer(42, 9, "3 = выраженная", 3));
        addAnswer(new Answer(43, 9, "4 = инвалидизирующая", 4));

        addAnswer(new Answer(44, 10, "0 = отсутствует", 0));
        addAnswer(new Answer(45, 10, "1 = легкая", 1));
        addAnswer(new Answer(46, 10, "2 = умеренная", 2));
        addAnswer(new Answer(47, 10, "3 = выраженная", 3));
        addAnswer(new Answer(48, 10, "4 = инвалидизирующая", 4));

        addAnswer(new Answer(49, 11, "0 = отсутствует", 0));
        addAnswer(new Answer(50, 11, "1 = утрата аппетита, но принимаю пищу самостоятельно, без принуждения", 1));
        addAnswer(new Answer(51, 11, "2 = прием пищи только с принуждением. Нуждаюсь в назначении слабительных или препаратов для купирования гастроинтестинальных симптомов", 2));

        addAnswer(new Answer(52, 12, "0 = отсутстсвует", 0));
        addAnswer(new Answer(53, 12, "1 = тяжесть в конечностях, голове или спине; боли в спине, мышцах, головные боли, чувство снижения энергии и упадка сил", 1));
        addAnswer(new Answer(54, 12, "2 = любые выраженные симптомы оцениваются как 2", 2));

        addAnswer(new Answer(55, 13, "0 = отсутствует", 0));
        addAnswer(new Answer(56, 13, "1 = поглощенность собой (телесно)", 1));
        addAnswer(new Answer(57, 13, "2 = чрезмерная озабоченность своим здоровьем", 2));
        addAnswer(new Answer(58, 13, "3 = убежденность в наличии соматических заболеваний", 3));
        addAnswer(new Answer(59, 13, "4 = ипохондрический бред", 4));

        addAnswer(new Answer(60, 14, "0 = отсутствие снижения массы тела", 0));
        addAnswer(new Answer(61, 14, "1 = вероятное снижение массы тела в связи с настоящим заболеванием", 1));
        addAnswer(new Answer(62, 14, "2 = явное (со слов пациента) снижение массы тела", 2));

        addAnswer(new Answer(63, 15, "0 = осознание собственного заболевания и депрессии", 0));
        addAnswer(new Answer(64, 15, "1 = осознаю заболевание, но отношу его на счет плохого питания, переутомления, вирусной инфекции, потребности в отдыхе и т.д.", 1));
        addAnswer(new Answer(65, 15, "2 = отрицаю наличие заболевания", 2));

    }

    ContentValues values = new ContentValues();

    public void addTest(Test test){
        values.put(MyDB.Test.ID, test.getId());
        values.put(MyDB.Test.NAME, test.getName());

        db.insert(MyDB.Test.TABLE_NAME, null, values);
//        db.close();
    }

    public void addQuestion(Question question){
        values.put(MyDB.Question.ID, question.getId());
        values.put(MyDB.Question.ID_TEST, question.getId_test());
        values.put(MyDB.Question.QUESTION, question.getQuestion());

        db.insert(MyDB.Question.TABLE_NAME, null, values);
        //db.close();
    }

    public void addAnswer(Answer answer){
        values.put(MyDB.Answer.ID, answer.getId());
        values.put(MyDB.Answer.ID_QUESTION, answer.getId_question());
        values.put(MyDB.Answer.ANSWER, answer.getText());
        values.put(MyDB.Answer.SCORE, answer.getScore());

       // long newRowId = db.insert(MyDB.Answer.TABLE_NAME, null, values);
//        db.close();
    }

    public void addScore(Score score){
        values.put(MyDB.Score.ID, score.getId());
        values.put(MyDB.Score.ID_TEST, score.getId_test());

        db.insert(MyDB.Score.TABLE_NAME, null, values);
//        db.close();
    }

    public void addUser(User user) {
        values.put(MyDB.User.ID, user.getId());
        values.put(MyDB.User.GENDER, user.getGender());
        values.put(MyDB.User.AGE, user.getAge());
        values.put(MyDB.User.WEIGHT, user.getWeight());
    }

    public List<TestModel> getTests(String type) {

        Cursor cursor = db.rawQuery("select " + MyDB.Question.TABLE_NAME + "."+MyDB.Question.QUESTION+ ", " +
                MyDB.Answer.TABLE_NAME + "."+MyDB.Answer.ANSWER + " from " + MyDB.Question.TABLE_NAME +
                " INNER JOIN " + MyDB.Answer.TABLE_NAME + " ON " + MyDB.Question.TABLE_NAME + "." + MyDB.Question.ID + " = " + MyDB.Answer.TABLE_NAME +
                "."+MyDB.Answer.ID_QUESTION, null);
        if (cursor.moveToNext()){
            do {
                Log.d("getTests: ",cursor.getCount() + "");
            } while (cursor.moveToNext());
        }
        return new ArrayList<TestModel>();
    }

}
