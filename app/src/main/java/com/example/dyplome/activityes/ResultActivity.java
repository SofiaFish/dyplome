package com.example.dyplome.activityes;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dyplome.R;

public class ResultActivity extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        int score = getIntent().getIntExtra("score", -1);
        int maxScore = getIntent().getIntExtra("maxScore", -1);
        result = findViewById(R.id.result);
        result.setText(score + "/" + maxScore);

    }
}
