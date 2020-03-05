package com.example.dyplome.activityes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dyplome.R;
import com.example.dyplome.db.DataBaseHelper;
import com.example.dyplome.db.DbCreator;
import com.example.dyplome.model.User;

public class AboutActivity extends AppCompatActivity {

    NumberPicker weightPicker;
    NumberPicker agePicker;
    Button saveAbout;
    DbCreator creator;
    RadioButton female;
    RadioButton male;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        creator = new DbCreator(DataBaseHelper.getInstance(this).getWritableDatabase());
        if(creator.userExists()) {
            startMainActivity();
        }
        setContentView(R.layout.activity_about);
        saveAbout = findViewById(R.id.btnSave);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);

        agePicker = findViewById(R.id.picker_age);
        agePicker.setMinValue(14);
        agePicker.setMaxValue(50);

        weightPicker = findViewById(R.id.picker_weight);
        weightPicker.setMinValue(40);
        weightPicker.setMaxValue(120);


        saveAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                creator.addUser(new User(agePicker.getValue(),
                        male.isChecked() ? "Male" : "Female",
                        weightPicker.getValue()));
                startMainActivity();
            }
        });
    }

    private void startMainActivity(){
        Intent intent = new Intent(AboutActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
