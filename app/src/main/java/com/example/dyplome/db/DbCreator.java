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
import com.example.dyplome.model.TestRecyclerItem;
import com.example.dyplome.model.Therapy;
import com.example.dyplome.model.User;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DbCreator {

    SQLiteDatabase db;
    ContentValues values;

    public DbCreator(SQLiteDatabase db) {
        this.db = db;
    }

    //addTest(new Test(2, "Тест на реакцию"));

    public void addTables() {
        db.execSQL(MyDB.SQL_CREATE_TEST);
        db.execSQL(MyDB.SQL_CREATE_QUESTION);
        db.execSQL(MyDB.SQL_CREATE_ANSWER);
        db.execSQL(MyDB.SQL_CREATE_SCORE);
        db.execSQL(MyDB.SQL_CREATE_QUESTION_ANSWER);
        db.execSQL(MyDB.SQL_CREATE_SCORE_TEST);
        db.execSQL(MyDB.SQL_CREATE_TEST_QUESTION);
        db.execSQL(MyDB.SQL_CREATE_USER);
        db.execSQL(MyDB.SQL_CREATE_THERAPY);

    }

    public void createBeck() {

        // Add tests
        addTest(new Test(0, "Шкала Бека"));
        //Beck scale  Questions
        addQuestion(new Question(0, "Чувствуете ли вы себя расстртоенным?"));
        addQuestion(new Question(0, "Чувствуете ли вы тревогу за будущее?"));
        addQuestion(new Question(0, "Чувствуете ли вы себя неудачником?"));

        addQuestion(new Question(0, "Чувствуете ли вы удовлетыорение от жизни?"));
        addQuestion(new Question(0, "Чувствуете ли вы себя виноватым в чем-то?"));
        addQuestion(new Question(0, "Чувствуете ли вы, что можете быть наказанным?"));

        addQuestion(new Question(0, "Разочароались ли вы в себе?"));
        addQuestion(new Question(0, "Чувствуете ли вы себя хуже других?"));
        addQuestion(new Question(0, "Думали ли вы покончить с собой?"));

        addQuestion(new Question(0, "Часто ли вы плачете?"));
        addQuestion(new Question(0, "Чувствуете ли вы раздражение?"));
        addQuestion(new Question(0, "Чувствуете ли вы интерес к людям?"));

        addQuestion(new Question(0, "Откладываете ли вы принятие решений?"));
        addQuestion(new Question(0, "Чувствуете ли вы, что выглядите хуже обычного?"));
        addQuestion(new Question(0, "Можете ли вы работать так же, как и раньше?"));

        addQuestion(new Question(0, "Вы спите так же хорошо, как и раньше?"));
        addQuestion(new Question(0, "Вы устаете так же, как обычно?"));
        addQuestion(new Question(0, "Ваш аппетит такой же, как и раньше?"));

        addQuestion(new Question(0, "Похудели ли вы в последнее время?"));
        addQuestion(new Question(0, "Беспокоитесь ли вы о своем здоровье?"));
        addQuestion(new Question(0, "Изменилось ли ваше сексуальное желание?"));

        //Answers

        addAnswer(new Answer(0, 1, "Я не чувствую себя расстроенным, печальным.", 0));
        addAnswer(new Answer(0, 1, "Я расстроен", 1));
        addAnswer(new Answer(0, 1, "Я все время расстроен и не могу от этого отключиться", 2));
        addAnswer(new Answer(0, 1, "Я настолько расстроен и несчастлив, что не могу это выдержать", 3));

        addAnswer(new Answer(0, 2, "Я не тревожусь о будущем", 0));
        addAnswer(new Answer(0, 2, "Я чувствую, что озадачен будущим", 1));
        addAnswer(new Answer(0, 2, "Я чувствую, что меня ничего не ждет в будущем", 2));
        addAnswer(new Answer(0, 2, "Мое будущее безнадежно, и ничто не может измениться к лучшему", 3));

        addAnswer(new Answer(0, 3, "Я не чувствую себя неудачником", 0));
        addAnswer(new Answer(0, 3, "Я чувствую, что терпел больше неудач, чем другие люди", 1));
        addAnswer(new Answer(0, 3, "Когда я оглядываюсь на свою жизнь, я вижу в ней много неудач", 2));
        addAnswer(new Answer(0, 3, "Я чувствую, что как личность я - полный неудачник", 3));

        addAnswer(new Answer(0, 4, "Я получаю столько же удовлетворения от жизни, как раньше", 0));
        addAnswer(new Answer(0, 4, "Я не получаю столько же удовлетворения от жизни, как раньше", 1));
        addAnswer(new Answer(0, 4, "Я больше не получаю удовлетворения ни от чего", 2));
        addAnswer(new Answer(0, 4, "Я полностью не удовлетворен жизнью и мне все надоело", 3));

        addAnswer(new Answer(0, 5, "Я не чувствую себя в чем-нибудь виноватым", 0));
        addAnswer(new Answer(0, 5, "Достаточно часто я чувствую себя виноватым", 1));
        addAnswer(new Answer(0, 5, "Большую часть времени я чувствую себя виноватым", 2));
        addAnswer(new Answer(0, 5, "Я постоянно испытываю чувство вины", 3));

        addAnswer(new Answer(0, 6, "Я не чувствую, что могу быть наказанным за что-либо", 0));
        addAnswer(new Answer(0, 6, "Я чувствую, что могу быть наказан", 1));
        addAnswer(new Answer(0, 6, "Я ожидаю, что могу быть наказан", 2));
        addAnswer(new Answer(0, 6, "Я чувствую себя уже наказанным", 3));

        addAnswer(new Answer(0, 7, "Я не разочаровался в себе", 0));
        addAnswer(new Answer(0, 7, "Я разочаровался в себе", 1));
        addAnswer(new Answer(0, 7, "Я себе противен", 2));
        addAnswer(new Answer(0, 7, "Я себя ненавижу", 3));

        addAnswer(new Answer(0, 8, "Я знаю, что я не хуже других", 0));
        addAnswer(new Answer(0, 8, "Я критикую себя за ошибки и слабости", 1));
        addAnswer(new Answer(0, 8, "Я все время обвиняю себя за свои поступки", 2));
        addAnswer(new Answer(0, 8, "Я виню себя во всем плохом, что происходит", 3));

        addAnswer(new Answer(0, 9, "Я никогда не думал покончить с собой", 0));
        addAnswer(new Answer(0, 9, "Ко мне приходят мысли покончить с собой, но я не буду их осуществлять", 1));
        addAnswer(new Answer(0, 9, "Я хотел бы покончить с собой", 2));
        addAnswer(new Answer(0, 9, "Я бы убил себя, если бы представился случай", 3));

        addAnswer(new Answer(0, 10, "Я плачу не больше, чем обычно", 0));
        addAnswer(new Answer(0, 10, "Сейчас я плачу чаще, чем раньше", 1));
        addAnswer(new Answer(0, 10, "Теперь я все время плачу", 2));
        addAnswer(new Answer(0, 10, "Раньше я мог плакать, а сейчас не могу, даже если мне хочется", 3));

        addAnswer(new Answer(0, 11, "Сейчас я раздражителен не более, чем обычно", 0));
        addAnswer(new Answer(0, 11, "Я более легко раздражаюсь, чем раньше", 1));
        addAnswer(new Answer(0, 11, "Теперь я постоянно чувствую, что раздражен", 2));
        addAnswer(new Answer(0, 11, "Я стал равнодушен к вещам, которые меня раньше раздражали", 3));

        addAnswer(new Answer(0, 12, "Я не утратил интереса к другим людям", 0));
        addAnswer(new Answer(0, 12, "Я меньше интересуюсь другими людьми, чем раньше", 1));
        addAnswer(new Answer(0, 12, "Я почти потерял интерес к другим людям", 2));
        addAnswer(new Answer(0, 12, "Я полностью утратил интерес к другим людям", 3));

        addAnswer(new Answer(0, 13, "Я откладываю принятие решения иногда, как и раньше", 0));
        addAnswer(new Answer(0, 13, "Я чаще, чем раньше, откладываю принятие решения", 1));
        addAnswer(new Answer(0, 13, "Мне труднее принимать решения, чем раньше", 2));
        addAnswer(new Answer(0, 13, "Я больше не могу принимать решения", 3));

        addAnswer(new Answer(0, 14, "Я не чувствую, что выгляжу хуже, чем обычно", 0));
        addAnswer(new Answer(0, 14, "Меня тревожит, что я выгляжу старым и непривлекательным", 1));
        addAnswer(new Answer(0, 14, "Я знаю, что в моей внешности произошли существенные изменения, делающие меня непривлекательным", 2));
        addAnswer(new Answer(0, 14, "Я знаю, что выгляжу безобразно", 3));

        addAnswer(new Answer(0, 15, "Я могу работать так же хорошо, как и раньше", 0));
        addAnswer(new Answer(0, 15, "Мне необходимо сделать дополнительное усилие, чтобы начать делать что-нибудь", 1));
        addAnswer(new Answer(0, 15, "Я с трудом заставляю себя делать что-либо", 2));
        addAnswer(new Answer(0, 15, "Я совсем не могу выполнять никакую работу", 3));

        addAnswer(new Answer(0, 16, "Я сплю так же хорошо, как и раньше", 0));
        addAnswer(new Answer(0, 16, "Сейчас я сплю хуже, чем раньше", 1));
        addAnswer(new Answer(0, 16, "Я просыпаюсь на 1-2 часа раньше, и мне трудно заснуть опять", 2));
        addAnswer(new Answer(0, 16, "Я просыпаюсь на несколько часов раньше обычного и больше не могу заснуть", 3));

        addAnswer(new Answer(0, 17, "Я устаю не больше, чем обычно", 0));
        addAnswer(new Answer(0, 17, "Теперь я устаю быстрее, чем раньше", 1));
        addAnswer(new Answer(0, 17, "Я устаю почти от всего, что я делаю", 2));
        addAnswer(new Answer(0, 17, "Я не могу ничего делать из-за усталости", 3));

        addAnswer(new Answer(0, 18, "Мой аппетит не хуже, чем обычно", 0));
        addAnswer(new Answer(0, 18, "Мой аппетит стал хуже, чем раньше", 1));
        addAnswer(new Answer(0, 18, "Мой аппетит теперь значительно хуже", 2));
        addAnswer(new Answer(0, 18, "У меня вообще нет аппетита", 3));

        addAnswer(new Answer(0, 19, "В последнее время я не похудел или потеря веса была незначительной", 0));
        addAnswer(new Answer(0, 19, "За последнее время я потерял более 2 кг", 1));
        addAnswer(new Answer(0, 19, "Я потерял более 5 кг", 2));
        addAnswer(new Answer(0, 19, "Я потерял более 7 кr", 3));

        addAnswer(new Answer(0, 20, "Я беспокоюсь о своем здоровье не больше, чем обычно", 0));
        addAnswer(new Answer(0, 20, "Меня тревожат проблемы моего физического здоровья, такие, как боли, расстройство желудка, запоры и т.д.", 1));
        addAnswer(new Answer(0, 20, "Я очень обеспокоен своим физическим состоянием, и мне трудно думать о чем-либо другом", 2));
        addAnswer(new Answer(0, 20, "Я настолько обеспокоен своим физическим состоянием, что больше ни о чем не могу думать", 3));

        addAnswer(new Answer(0, 21, "В последнее время я не замечал изменения своего интереса к близости", 0));
        addAnswer(new Answer(0, 21, "Меня меньше занимают проблемы близости, чем раньше", 1));
        addAnswer(new Answer(0, 21, "Сейчас я значительно меньше интересуюсь сексом, чем раньше", 2));
        addAnswer(new Answer(0, 21, "Я полностью утратил интерес к сексу", 3));


    }

    public void createHamilton() {
        addTest(new Test(1, "Шкала Гамильтона"));

        //Add Questions
        addQuestion(new Question(1, "Депрессивное настроение\n" + "\n" +
                "Подавленность, безнадежность, беспомощность, ненужность" + "\n"));
        addQuestion(new Question(1, "Чувство вины\n" + "\n"));
        addQuestion(new Question(1, "Суицидальные намерения\n" + "\n"));

        addQuestion(new Question(1, "Ранняя бессонница (трудности при засыпании)\n" + "\n"));
        addQuestion(new Question(1, "Средняя бессонница (бессонница)\n" + "\n"));
        addQuestion(new Question(1, "Поздняя бессонница (ранние пробуждения)\n" + "\n"));

        addQuestion(new Question(1, "Работоспособность и деятельность\n" + "\n"));
        addQuestion(new Question(1, "Заторможенность\n" + "\n" +
                " Замедленность мышления и речи; нарушение способности к концентрации; снижение двигательной активности" + "\n"));
        addQuestion(new Question(1, "Ажитация (возбуждение)\n" + "\n"));

        addQuestion(new Question(1, "Психическая тревога\n" + "\n" + " Проявления: \n" +
                "\n" + " Субъективное напряжение и раздражительность, снижение концентрации\n" +
                "\n" + " Беспокойство по незначительному поводу\n" +
                "\n" + " Страхи \n" +
                "\n" + " Боится высказываться, пока не спросили\n" +
                "\n" + " Чувство паники\n" +
                "\n" + " Чувство нервозности "));
        addQuestion(new Question(1, "Соматическая тревога \n" +
                "\n" + "Физиологические проявления тревоги: \n" +
                "\n" + "Желудочно-кишечные: сухость во рту, метеоризм, диспепсия, диарея, спазмы, отрыжка\n" +
                "\n" + "Сердечно-сосудистые: сердцебиение, головные боли\n" +
                "\n" + "Дыхательные: гипервентиляция, одышка\n" +
                "\n" + "Учащенное мочеиспускание\n" +
                "\n" + "Потливость\n" +
                "\n" + "Головокружение, диплопия\n" +
                "\n" + "Шум в ушах" + "\n"));
        addQuestion(new Question(1, " Желудочно-кишечные соматические симптомы\n" + "\n"));
        addQuestion(new Question(1, "Общие соматические симптомы\n" + "\n"));
        addQuestion(new Question(1, "Ипохондрия\n" + "\n"));
        addQuestion(new Question(1, "Снижение массы тела\n" + "\n"));
        addQuestion(new Question(1, "Критичность\n" + "\n"));

        addAnswer(new Answer(1, 22, "0 = отсутствуют", 0));
        addAnswer(new Answer(1, 22, " 1 = мрачность, пессимизм, безнадежность", 1));
        addAnswer(new Answer(1, 22, "2 = периодическая плаксивость", 2));
        addAnswer(new Answer(1, 22, " 3 = частая плаксивость", 3));
        addAnswer(new Answer(1, 22, "4 = выражаю только эти чувства как в спонтанных высказываниях, так и невербально", 3));

        addAnswer(new Answer(1, 23, "0 = отсутствует", 0));
        addAnswer(new Answer(1, 23, "1 = самоуничижение, считаю, что подвел других", 1));
        addAnswer(new Answer(1, 23, "2 = идеи собственной вины, постоянно размышляю о прошлых ошибках или грехах", 2));
        addAnswer(new Answer(1, 23, "3 = настоящее заболевание расцениваю как наказание", 3));
        addAnswer(new Answer(1, 23, "4 = вербальные галлюцинации обвиняющего или осуждающего содержания и/или зрительные галлюцинации угрожающего содержания", 4));

        addAnswer(new Answer(1, 24, "0 = отсутсвуют", 0));
        addAnswer(new Answer(1, 24, "1 = чувствует, что жить не стоит", 1));
        addAnswer(new Answer(1, 24, "2 = желание смерти, мысли о возможности собственной смерти", 2));
        addAnswer(new Answer(1, 24, "3 = суицидальные мысли или жесты", 3));
        addAnswer(new Answer(1, 24, "4 = суицидальные попытки ", 4));

        addAnswer(new Answer(1, 25, "0 = отсутствие затруднений при засыпании", 0));
        addAnswer(new Answer(1, 25, "1 = эпизодические затруднения засыпания, т.е. более получаса", 1));
        addAnswer(new Answer(1, 25, "2 = трудности при засыпании каждую ночь", 2));

        addAnswer(new Answer(1, 26, "0 = отсутствует", 0));
        addAnswer(new Answer(1, 26, "1 = беспокойный сон", 1));
        addAnswer(new Answer(1, 26, "2 = пробуждения в течение ночи ", 2));

        addAnswer(new Answer(1, 27, "0 = отсутствует", 0));
        addAnswer(new Answer(1, 27, "1 = раннее пробуждение утром с последующим засыпанием", 1));
        addAnswer(new Answer(1, 27, "2 = при пробуждении заснуть повторно не удается", 2));

        addAnswer(new Answer(1, 28, "0 = трудностей не испытываю", 0));
        addAnswer(new Answer(1, 28, "1 = мысли и ощущения усталости, слабости, несостоятельности, связанные с работой и хобби", 1));
        addAnswer(new Answer(1, 28, "2 = утрата интереса к деятельности – работе или хобби", 2));
        addAnswer(new Answer(1, 28, "3 = уменьшение реального времени, проведенного за работой, или снижение продуктивности", 3));
        addAnswer(new Answer(1, 28, "4 = неработоспособен по причине настоящего заболевания", 3));

        addAnswer(new Answer(1, 29, "0 = нормальная речь и мышление", 0));
        addAnswer(new Answer(1, 29, "1 = легкая заторможенность при беседе", 1));
        addAnswer(new Answer(1, 29, "2 = заметная заторможенность при бесед", 2));
        addAnswer(new Answer(1, 29, "3 = проведение бесед затруднено", 3));
        addAnswer(new Answer(1, 29, "4 = проведение бесед невозможно", 4));

        addAnswer(new Answer(1, 30, "0 = отсутствует", 0));
        addAnswer(new Answer(1, 30, "1 = беспокойство", 1));
        addAnswer(new Answer(1, 30, "2 = беспокойные движения руками, перебирание волос, очевидное беспокойство", 2));
        addAnswer(new Answer(1, 30, "3 = подвижность, неусидчивость", 3));
        addAnswer(new Answer(1, 30, "4 = постоянное перебирание руками, обкусывание ногтей, выдергивание волос, покусывание губ", 4));

        addAnswer(new Answer(1, 31, "0 = отсутствует", 0));
        addAnswer(new Answer(1, 31, "1 = легкая", 1));
        addAnswer(new Answer(1, 31, "2 = умеренная", 2));
        addAnswer(new Answer(1, 31, "3 = выраженная", 3));
        addAnswer(new Answer(1, 31, "4 = инвалидизирующая", 4));

        addAnswer(new Answer(1, 32, "0 = отсутствует", 0));
        addAnswer(new Answer(1, 32, "1 = легкая", 1));
        addAnswer(new Answer(1, 32, "2 = умеренная", 2));
        addAnswer(new Answer(1, 32, "3 = выраженная", 3));
        addAnswer(new Answer(1, 32, "4 = инвалидизирующая", 4));

        addAnswer(new Answer(1, 33, "0 = отсутствует", 0));
        addAnswer(new Answer(1, 33, "1 = утрата аппетита, но принимаю пищу самостоятельно, без принуждения", 1));
        addAnswer(new Answer(1, 33, "2 = прием пищи только с принуждением. Нуждаюсь в назначении слабительных или препаратов для купирования гастроинтестинальных симптомов", 2));

        addAnswer(new Answer(1, 34, "0 = отсутстсвует", 0));
        addAnswer(new Answer(1, 34, "1 = тяжесть в конечностях, голове или спине; боли в спине, мышцах, головные боли, чувство снижения энергии и упадка сил", 1));
        addAnswer(new Answer(1, 34, "2 = любые выраженные симптомы оцениваются как 2", 2));

        addAnswer(new Answer(1, 35, "0 = отсутствует", 0));
        addAnswer(new Answer(1, 35, "1 = поглощенность собой (телесно)", 1));
        addAnswer(new Answer(1, 35, "2 = чрезмерная озабоченность своим здоровьем", 2));
        addAnswer(new Answer(1, 35, "3 = убежденность в наличии соматических заболеваний", 3));
        addAnswer(new Answer(1, 35, "4 = ипохондрический бред", 4));

        addAnswer(new Answer(1, 36, "0 = отсутствие снижения массы тела", 0));
        addAnswer(new Answer(1, 36, "1 = вероятное снижение массы тела в связи с настоящим заболеванием", 1));
        addAnswer(new Answer(1, 36, "2 = явное (со слов пациента) снижение массы тела", 2));

        addAnswer(new Answer(1, 37, "0 = осознание собственного заболевания и депрессии", 0));
        addAnswer(new Answer(1, 37, "1 = осознаю заболевание, но отношу его на счет плохого питания, переутомления, вирусной инфекции, потребности в отдыхе и т.д.", 1));
        addAnswer(new Answer(1, 37, "2 = отрицаю наличие заболевания", 2));


    }

    public void createReactionTest(){
        addTest(new Test(2,"Тест на реакцию"));
    }

    public void createTherapy(){
        addTherapy(new Therapy(0,"Уход за собой", ""));
        addTherapy(new Therapy(1,"Физическая активность - 30 минут", ""));
        addTherapy(new Therapy(2,"Чтение - 2 часа в день", ""));
        addTherapy(new Therapy(3,"Учеба - минимум час", ""));
        addTherapy(new Therapy(4,"Заняться своим хобби", ""));
    }

    public void createTherapy(){
        addTherapy(new Therapy(0,"Уход за собой", ""));
        addTherapy(new Therapy(1,"Физическая активность - 30 минут", ""));
        addTherapy(new Therapy(2,"Чтение - 2 часа в день", ""));
        addTherapy(new Therapy(3,"Учеба - минимум час", ""));
        addTherapy(new Therapy(4,"Заняться своим хобби", ""));
    }

    public void addTest(Test test) {
        values = new ContentValues();
        values.put(MyDB.Test.ID, test.getId());
        values.put(MyDB.Test.NAME, test.getName());

        db.insert(MyDB.Test.TABLE_NAME, null, values);
//        db.close();
    }

    public void addQuestion(Question question) {
        values = new ContentValues();
        values.put(MyDB.Question.ID_TEST, question.getId_test());
        values.put(MyDB.Question.QUESTION, question.getQuestion());

        db.insert(MyDB.Question.TABLE_NAME, null, values);
        //db.close();
    }

    public void addAnswer(Answer answer) {
        values = new ContentValues();
        values.put(MyDB.Answer.ID_TEST, answer.getId_test());
        values.put(MyDB.Answer.ID_QUESTION, answer.getId_question());
        values.put(MyDB.Answer.ANSWER, answer.getText());
        values.put(MyDB.Answer.SCORE, answer.getScore());

        db.insert(MyDB.Answer.TABLE_NAME, null, values);

        // long newRowId = db.insert(MyDB.Answer.TABLE_NAME, null, values);
//        db.close();
    }

    public void addScore(Score score) {
        values = new ContentValues();
        values.put(MyDB.Score.ID, score.getId());
        values.put(MyDB.Score.ID_TEST, score.getId_test());
        values.put(MyDB.Score.SCORE, score.getScore());

        db.insert(MyDB.Score.TABLE_NAME, null, values);
//        db.close();
    }

    public void addUser(User user) {
        values = new ContentValues();
        values.put(MyDB.User.ID, user.getId());
        values.put(MyDB.User.GENDER, user.getGender());
        values.put(MyDB.User.AGE, user.getAge());
        values.put(MyDB.User.WEIGHT, user.getWeight());

        db.insert(MyDB.User.TABLE_NAME, null, values);
    }

    public boolean userExists(){
        Cursor cursor = db.query(MyDB.User.TABLE_NAME,null,null,
                null,null,null,null);
        return cursor.getCount() > 0;
    }

    public String dateToString(Date date){
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        return formatter.format(date);
    }

    public void addTherapy(Therapy therapy){
        values = new ContentValues();
        values.put(MyDB.Therapy.THERAPY_ID, therapy.getId());
        values.put(MyDB.Therapy.THERAPY_TASK, therapy.getTask());
        values.put(MyDB.Therapy.THERAPY_DATE, dateToString(therapy.getDate()));

        db.insert(MyDB.Therapy.TABLE_NAME, null, values);
    }

    public ArrayList<TestModel> getTests(int testId) {

        ArrayList<TestModel> list = new ArrayList<>();


        Cursor cursor = db.rawQuery("select  * from " + MyDB.Question.TABLE_NAME + " WHERE " +
                MyDB.Question.ID_TEST + " = ?", new String[]{testId + ""});
//
        if (cursor.moveToFirst()) {
            do {
                list.add(new TestModel(cursor.getString(cursor.getColumnIndex(MyDB.Question.QUESTION)),
                        getAnswersByQuestion(cursor.getInt(cursor.getColumnIndex(MyDB.Question.ID)), testId)));
                Log.d("getTests: ", cursor.getCount() + "");
            } while (cursor.moveToNext());
        }

        cursor.close();
        return list;
    }

//    public ArrayList<TestRecyclerItem> getTestRecyclerItems(){
//        ArrayList<TestRecyclerItem> list = new ArrayList<>();
//
//        Cursor cursor = db.rawQuery("select " + MyDB.Test.NAME + " FROM " + MyDB.Test.TABLE_NAME,null);
////        if (cursor.moveToFirst()){
////            do {
////                list.add(TODO);
////            }
////            while(){};
////        }
//    }

    public ArrayList<String> getAnswersByQuestion(int questionId, int testId) {

        ArrayList<String> list = new ArrayList<>();
        Cursor cursor = db.rawQuery("select " + MyDB.Answer.ANSWER + " from " + MyDB.Answer.TABLE_NAME + " where " + MyDB.Answer.ID_QUESTION +
                " = ? AND " + MyDB.Answer.ID_TEST + " = ?", new String[]{questionId + "", testId + ""});

        if (cursor.moveToNext()) {
            do {
                list.add(cursor.getString(cursor.getColumnIndex(MyDB.Answer.ANSWER)));
            } while (cursor.moveToNext());
        }

        return list;
    }

}
