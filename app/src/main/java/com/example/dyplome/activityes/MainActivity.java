package com.example.dyplome.activityes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dyplome.R;
import com.example.dyplome.RecycleViewAdapter;
import com.example.dyplome.RecyclerItemClickListener;
import com.example.dyplome.db.DataBaseHelper;
import com.example.dyplome.db.DbCreator;
import com.example.dyplome.model.TestRecyclerItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecycleViewAdapter adapter;
    RecyclerView testsList;
    Button startTherapy;
    DbCreator creator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startTherapy = findViewById(R.id.start_therapy);

        creator = new DbCreator(DataBaseHelper.getInstance(this).getWritableDatabase());

        ArrayList<TestRecyclerItem> recyclerItems = creator.getTestRecyclerItems();

        if (allTestsPassed(recyclerItems)) {
            startTherapy.setEnabled(true);
        }

        testsList = findViewById(R.id.list_tests);
        testsList.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecycleViewAdapter(recyclerItems);
//        adapter.setOnClickListener(this);
        testsList.setAdapter(adapter);
        testsList.addOnItemTouchListener(new RecyclerItemClickListener(getApplication(),
                testsList, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
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
                        reactionTestIntent.putExtra("testId", 2);
                        startActivity(reactionTestIntent);
                        break;
                }
            }


            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));
    }

    private boolean allTestsPassed(List<TestRecyclerItem> testRecyclerItems) {
        int testPassed = 0;
        for (TestRecyclerItem item : testRecyclerItems) {
            testPassed += item.isPassed();

        }
        return testPassed == testRecyclerItems.size();
    }

}
