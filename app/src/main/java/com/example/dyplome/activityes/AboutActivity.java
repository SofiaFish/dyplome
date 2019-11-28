package com.example.dyplome.activityes;

import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dyplome.R;

public class AboutActivity extends AppCompatActivity {

    TextView tvAge;
    TextView tvWeight;
    NumberPicker nbpickWeight;
    NumberPicker nbpickAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        tvAge = findViewById(R.id.age);
        tvWeight = findViewById(R.id.weight);


        tvAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nbpickAge = findViewById(R.id.nbpicker);
                nbpickAge.setMinValue(14);
                nbpickAge.setMaxValue(50);
            }
        });

        tvWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nbpickWeight = findViewById(R.id.nbpickerweight);
                nbpickWeight.setMinValue(14);
                nbpickWeight.setMaxValue(50);
            }
        });

//        nbpickAge.setFormatter(new NumberPicker.Formatter() {
//            @Override
//            public String format(int value) {
//                return String.format("%0.2d", value);
//            }
//        });

        NumberPicker.OnValueChangeListener onValueChangeListener= new NumberPicker.OnValueChangeListener(){

            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                String value = picker.getValue()+"";
                tvAge.setText(value);
            }
        };

    }

}
