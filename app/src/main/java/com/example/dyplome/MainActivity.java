package com.example.dyplome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.CheckBox;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView testsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testsList = findViewById(R.id.list_tests);
    }
}
