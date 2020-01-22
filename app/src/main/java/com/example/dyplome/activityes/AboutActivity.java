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

    NumberPicker nbpickWeight;
    NumberPicker nbpickAge;
    Button btnSave;
    DbCreator creator;
    RadioButton female;
    RadioButton male;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        btnSave = findViewById(R.id.btnSave);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);

        nbpickAge = findViewById(R.id.nbpicker);
        nbpickAge.setMinValue(14);
        nbpickAge.setMaxValue(50);

        nbpickWeight = findViewById(R.id.nbpickerweight);
        nbpickWeight.setMinValue(14);
        nbpickWeight.setMaxValue(50);

        creator = new DbCreator(DataBaseHelper.getInstance(this).getWritableDatabase());

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                creator.addUser(new User(nbpickWeight.getValue(), male.isChecked() ? "Male" : "Female", nbpickWeight.getValue()));
                Intent intent = new Intent(AboutActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
