package com.example.dyplome.activityes;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dyplome.R;
import com.example.dyplome.db.DataBaseHelper;
import com.example.dyplome.db.DbCreator;
import com.example.dyplome.model.TaskRecyclerItem;
import com.example.dyplome.model.TaskRecyclerViewAdapter;
import com.example.dyplome.model.TherapyRecyclerItem;
import com.example.dyplome.model.TherapyRecyclerViewAdapter;

import java.util.ArrayList;

public class TaskActivity extends AppCompatActivity {

    TaskRecyclerViewAdapter adapter;
    RecyclerView taskList;
    DbCreator creator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        creator = new DbCreator(DataBaseHelper.getInstance(this).getWritableDatabase());

        ArrayList<TaskRecyclerItem> recyclerItems = creator.getTaskRecyclerItems();

        taskList = findViewById(R.id.list_task);
        taskList.setLayoutManager(new LinearLayoutManager(this));
        adapter = new TaskRecyclerViewAdapter(recyclerItems);
        taskList.setAdapter(adapter);


    }
}
