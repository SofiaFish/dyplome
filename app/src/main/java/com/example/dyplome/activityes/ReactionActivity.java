package com.example.dyplome.activityes;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.dyplome.R;
import com.example.dyplome.db.DataBaseHelper;
import com.example.dyplome.db.DbCreator;
import com.example.dyplome.model.Score;
import com.example.dyplome.model.Test;

public class ReactionActivity extends AppCompatActivity {

    RelativeLayout layout;
    Button btn_start;
    long start;
    int counter;

    final DbCreator creator = new DbCreator(DataBaseHelper.getInstance(this).getWritableDatabase());

    Runnable startTest = new Runnable() {
        @Override
        public void run() {
            layout.setBackgroundColor(Color.YELLOW);
            start = System.currentTimeMillis();
            layout.setBackgroundColor(Color.RED);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reaction);

        layout = findViewById(R.id.layout);
        btn_start = findViewById(R.id.btn_start);

        final Handler handler = new Handler();
        final int testId = getIntent().getIntExtra("testId", -1);
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_start.setVisibility(View.GONE);
                handler.postDelayed(startTest, 3000);
            }
        });


        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = Color.TRANSPARENT;
                Drawable background = layout.getBackground();
                if (background instanceof ColorDrawable)
                    color = ((ColorDrawable) background).getColor();
                if (color == Color.RED) {
                    long measure = System.currentTimeMillis() - start;
                    AlertDialog.Builder builder = new AlertDialog.Builder(ReactionActivity.this);
                    builder.setMessage(measure + "ms");
                    builder.setPositiveButton("Еще", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                            layout.setBackgroundColor(Color.YELLOW);
                            handler.postDelayed(startTest, 3000);
                        }
                    });
                    AlertDialog alert = builder.create();
                    alert.show();
//                    Toast.makeText(ReactionActivity.this, measure + " ms. медленный лох.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ReactionActivity.this, "РАНО БЛЯТЬ", Toast.LENGTH_SHORT).show();
                }

                counter++;
                Intent intent = new Intent(ReactionActivity.this, ReactionResultActivity.class);
                if (counter == 5) {
                    creator.addScore(new Score(testId, 1));
                    creator.updateTest(new Test(testId, null, 1));
                    startActivity(intent);
                }
            }
        });
    }
}
