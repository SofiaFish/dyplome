package com.example.dyplome.activityes;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dyplome.R;
import com.example.dyplome.db.DbCreator;
import com.example.dyplome.model.TaskRecyclerViewAdapter;

public class TaskActivity extends AppCompatActivity {
    TaskRecyclerViewAdapter adapter;
    RecyclerView taskList;
    DbCreator creator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);


    }
}
