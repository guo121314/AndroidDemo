package com.skymxc.demo.thread;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("线程");
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.create_thread:
                Intent intent = new Intent(this,CreateActivity.class);
                startActivity(intent);
                break;
        }
    }


}
