package com.example.dyplome.activityes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dyplome.R;

public class ResultActivity extends AppCompatActivity {

    TextView result;
    Button btn_ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        btn_ok = findViewById(R.id.btn_ok);

        int score = getIntent().getIntExtra("score", -1);
        int maxScore = getIntent().getIntExtra("maxScore", -1);
        result = findViewById(R.id.result);
        result.setText(score + "/" + maxScore);

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
