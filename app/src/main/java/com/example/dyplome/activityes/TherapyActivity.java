package com.example.dyplome.activityes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dyplome.R;
import com.example.dyplome.RecyclerItemClickListener;
import com.example.dyplome.db.DataBaseHelper;
import com.example.dyplome.db.DbCreator;
import com.example.dyplome.model.TherapyRecyclerItem;
import com.example.dyplome.model.TherapyRecyclerViewAdapter;

import java.util.ArrayList;

public class TherapyActivity extends AppCompatActivity {

    TherapyRecyclerViewAdapter adapter;
    RecyclerView therapyList;
    DbCreator creator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_therapy);

        creator = new DbCreator(DataBaseHelper.getInstance(this).getWritableDatabase());

        ArrayList<TherapyRecyclerItem> recyclerItems = creator.getTherapyRecyclerItems();

        therapyList = findViewById(R.id.list_tasks);
        therapyList.setLayoutManager(new LinearLayoutManager(this));
        adapter = new TherapyRecyclerViewAdapter(recyclerItems);
        therapyList.setAdapter(adapter);
        therapyList.addOnItemTouchListener(new RecyclerItemClickListener(getApplication(),
                therapyList, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(TherapyActivity.this, TestActivity.class);

                switch (position) {
                    case 0:
                        intent.putExtra("therapyId", 0);
                        startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("therapyId", 1);
                        startActivity(intent);
                        break;
                    case 2:
                        Intent reactionTestIntent = new Intent(TherapyActivity.this, ReactionActivity.class);
                        reactionTestIntent.putExtra("therapyId", 2);
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
