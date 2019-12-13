package com.example.dyplome.activityes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dyplome.R;
import com.example.dyplome.db.DataBaseHelper;
import com.example.dyplome.db.DbCreator;
import com.example.dyplome.model.TestModel;

import java.util.ArrayList;

public class TestActivity extends AppCompatActivity {

    TextView question;
    RadioButton answer1;
    RadioButton answer2;
    RadioButton answer3;
    RadioButton answer4;
    RadioGroup answers;
    Button next;
    ArrayList<TestModel> tests;

    int score;
    int position = 0;
    int id_test = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        question = findViewById(R.id.question);
        answer1 = findViewById(R.id.ans0);
        answer2 = findViewById(R.id.ans1);
        answer3 = findViewById(R.id.ans2);
        answer4 = findViewById(R.id.ans3);
        next = findViewById(R.id.btn_next);
        answers = findViewById(R.id.answers);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final int test = getIntent().getIntExtra("test", -1);

        DbCreator creator = new DbCreator(DataBaseHelper.getInstance(this).getWritableDatabase());
        tests = creator.getTests(test);

        next.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(TestActivity.this, ResultActivity.class);

            @Override
            public void onClick(View v) {

                int id = answers.getCheckedRadioButtonId();
                View radioBtn = answers.findViewById(id);
                score += answers.indexOfChild(radioBtn);

                if(position < tests.size()-1)
                    InitTest(tests, ++position);
                else
                    startActivity(intent);



            }
        });
               // position = 0;
                InitTest(tests, position);
    }

    public void InitTest(ArrayList<TestModel> arrayList, int position){
        TestModel testModel = arrayList.get(position);
        question.setText(testModel.getQuestion());
        answer1.setText(testModel.getAnswers().get(0));
        answer2.setText(testModel.getAnswers().get(1));
        answer3.setText(testModel.getAnswers().get(2));
        answer4.setText(testModel.getAnswers().get(3));


    }
}
