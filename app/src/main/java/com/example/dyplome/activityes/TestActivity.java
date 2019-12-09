package com.example.dyplome.activityes;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dyplome.R;
import com.example.dyplome.db.DataBaseHelper;
import com.example.dyplome.db.DbCreator;
import com.example.dyplome.model.TestModel;

import java.util.ArrayList;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

       // ActionBar actionBar = getActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String test = getIntent().getStringExtra("test");

        switch (test){
            case "Beck":
                DbCreator creator = new DbCreator(DataBaseHelper.getInstance(this).getWritableDatabase());
                ArrayList<TestModel> tests = creator.getTests("dsfsdf");
                break;
            case "Hamilton":
                break;
        }
    }
}
