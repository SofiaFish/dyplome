package com.example.dyplome.activityes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dyplome.R;

public class ReactionResultActivity extends AppCompatActivity {

    Button btn_okr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reaction_result2);
        btn_okr = findViewById(R.id.btn_okr);

        btn_okr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReactionResultActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}