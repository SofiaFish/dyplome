package com.example.dyplome.activityes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import com.example.dyplome.R;
import com.example.dyplome.RecycleViewAdapter;
import com.example.dyplome.db.DbCreator;

public class TaskActivity extends AppCompatActivity {
    RecycleViewAdapter adapter;
    RecyclerView taskList;
    DbCreator creator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);


    }
}
