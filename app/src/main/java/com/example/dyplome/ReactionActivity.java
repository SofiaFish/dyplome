package com.example.dyplome;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ReactionActivity extends AppCompatActivity {

    LinearLayout layout;
    long start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reaction);

        layout.findViewById(R.id.layout);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                layout.setBackgroundColor(Color.GREEN);
                start = System.currentTimeMillis();
            }
        }, 3000);


        layout.setBackgroundColor(Color.YELLOW);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long measure = System.currentTimeMillis() - start;
                Toast.makeText(ReactionActivity.this, measure + "", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
