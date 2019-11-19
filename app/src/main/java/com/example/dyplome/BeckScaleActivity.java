package com.example.dyplome;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public class BeckScaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beck_scale);

        ActionBar actionBar = getActionBar();
       // actionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

//    public boolean onOptionsItemSelected(MenuItem item){
//        //Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
//        //startActivityForResult(myIntent, 0);
//        return true;
//    }


}
