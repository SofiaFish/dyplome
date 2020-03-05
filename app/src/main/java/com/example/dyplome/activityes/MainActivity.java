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
import com.example.dyplome.model.TestRecyclerItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecycleViewAdapter adapter;
    RecyclerView testsList;
//    String testName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//                getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        ArrayList<TestRecyclerItem> recyclerItems = new ArrayList<>();
        recyclerItems.add(new TestRecyclerItem("Шкала Бека",true));
        recyclerItems.add(new TestRecyclerItem("Шкала Гамильтона",false));
        recyclerItems.add(new TestRecyclerItem("Тест на реакцию",false));

        testsList = findViewById(R.id.list_tests);
        testsList.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecycleViewAdapter(recyclerItems);
//        adapter.setOnClickListener(this);
        testsList.setAdapter(adapter);
        testsList.addOnItemTouchListener(new RecyclerItemClickListener(getApplication(),
                testsList, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
//                Toast.makeText(MainActivity.this, position + "", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, TestActivity.class);

                switch (position) {
                    case 0:
                        intent.putExtra("testId", 0);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("testId", 1);
                        startActivity(intent);

                        break;
                    case 2:
                        Intent reactionTestIntent = new Intent(MainActivity.this, ReactionActivity.class);
                        startActivity(reactionTestIntent);
                        break;
                }
            }


            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));

    }



}
