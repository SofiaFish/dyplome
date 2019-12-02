package com.example.dyplome.activityes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dyplome.R;
import com.example.dyplome.RecycleViewAdapter;
import com.example.dyplome.RecyclerItemClickListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecycleViewAdapter adapter;
    RecyclerView testsList;
    String testName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<String> list_test = new ArrayList<>();
        list_test.add("Шкала Бека");
        list_test.add("Шкала Гамильтона");
        list_test.add("Тест на реакцию");


        testsList = findViewById(R.id.list_tests);
        testsList.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecycleViewAdapter(list_test);
//        adapter.setOnClickListener(this);
        testsList.setAdapter(adapter);
        testsList.addOnItemTouchListener(new RecyclerItemClickListener(getApplication(), testsList, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
//                Toast.makeText(MainActivity.this, position + "", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                switch (position){
                    case 0:
                        startActivity(intent);
                        break;
                    case 1:
                        startActivity(intent);
                        break;
                    case 2:
                        Intent intnt = new Intent(MainActivity.this, ReactionActivity.class);
                        startActivity(intnt);
                        break;
                }
            }


            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));

    }

//    @Override
//    public void onItemClick(View view, int position) {
//
////        DbCreator dbCreator = new DbCreator();
//        Intent intent = new Intent(MainActivity.this, TestActivity.class);
//        switch (testName){
//            case "Шкала Бека":
//                startActivity(intent);
//                break;
//            case "Шкала Гамильтона":
//                startActivity(intent);
//                break;
//            case "Тест на реакцию":
//                Intent intnt = new Intent(MainActivity.this, ReactionActivity.class);
//                startActivity(intnt);
//                break;
//
//        }
//
//
//    }


}
