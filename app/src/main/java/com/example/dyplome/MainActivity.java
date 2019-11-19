package com.example.dyplome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecycleViewAdapter.ItemClickListener{

    RecycleViewAdapter adapter;
    RecyclerView testsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> list_test = new ArrayList<>();
        list_test.add("Шкала Бека");
        list_test.add("Шкала Гамильтона");
        list_test.add("Тест Басса-Дарки");
        list_test.add("Тест на реакцию");


        testsList = findViewById(R.id.list_tests);
        testsList.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecycleViewAdapter(list_test);
        adapter.setClickListener(this);
        testsList.setAdapter(adapter);

        testsList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public void onItemClick(View view, int position) {
        Intent intent = new Intent(MainActivity.this, BeckScaleActivity.class);
        startActivity(intent);
    }


}
