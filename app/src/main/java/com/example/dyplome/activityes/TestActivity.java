package com.example.dyplome.activityes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dyplome.R;
import com.example.dyplome.db.DataBaseHelper;
import com.example.dyplome.db.DbCreator;
import com.example.dyplome.model.Score;
import com.example.dyplome.model.Test;
import com.example.dyplome.model.TestModel;

import java.util.ArrayList;

public class TestActivity extends AppCompatActivity {

    TextView question;
    RadioButton answer1;
    RadioButton answer2;
    RadioButton answer3;
    RadioButton answer4;
    RadioButton answer5;
    RadioGroup answers;
    Button next;
    ArrayList<TestModel> tests;

    int score;
    int position = 1;
    int testId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        question = findViewById(R.id.question);
        answer1 = findViewById(R.id.ans0);
        answer2 = findViewById(R.id.ans1);
        answer3 = findViewById(R.id.ans2);
        answer4 = findViewById(R.id.ans3);
        answer5 = findViewById(R.id.ans4);
        next = findViewById(R.id.btn_next);
        answers = findViewById(R.id.answers);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        testId = getIntent().getIntExtra("testId", -1);

        final DbCreator creator = new DbCreator(DataBaseHelper.getInstance(this).getWritableDatabase());
        tests = creator.getTests(testId);

        int maxScore = 0;
        for (int i = 0; i < tests.size(); i++) {
            maxScore += tests.get(i).getAnswers().size() -1;
        }

        final int finalMaxScore = maxScore;
        next.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(TestActivity.this, ResultActivity.class);

            @Override
            public void onClick(View v) {

                int id = answers.getCheckedRadioButtonId();
                View radioBtn = answers.findViewById(id);

                if (answers.indexOfChild(radioBtn) != -1) {
                    score += answers.indexOfChild(radioBtn);

                    if (position < tests.size()) {
                        InitTest(tests, position++);
                    } else {
                        creator.addScore(new Score(testId, score));
                        creator.updateTest(new Test(testId,null,1));
                        intent.putExtra("score", score);
                        intent.putExtra("maxScore", finalMaxScore);
                        startActivity(intent);
                    }
                } else {
                    Toast.makeText(TestActivity.this, "Choose answer first!", Toast.LENGTH_SHORT).show();
                }



            }
        });
        InitTest(tests, 0);
    }

    public void InitTest(ArrayList<TestModel> arrayList, int position) {
        TestModel testModel = arrayList.get(position);
        question.setText(testModel.getQuestion());
        answer1.setText(testModel.getAnswers().get(0));
        answer2.setText(testModel.getAnswers().get(1));
        answer3.setText(testModel.getAnswers().get(2));

        if (testModel.getAnswers().size() == 5) {
            answer5.setVisibility(View.VISIBLE);
            answer5.setText(testModel.getAnswers().get(4));
        } else if (testModel.getAnswers().size() == 3) {
            answer5.setVisibility(View.GONE);
            answer4.setVisibility(View.GONE);
        } else {
            answer4.setVisibility(View.VISIBLE);
            answer4.setText(testModel.getAnswers().get(3));
            answer5.setVisibility(View.GONE);
        }


    }
}
