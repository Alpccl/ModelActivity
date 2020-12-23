package com.example.modelactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("MainActivity", "onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("MainActivity", "OnResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("MainActivity", "OnPause");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("MainActivity", "onStart");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("MainActivity","onDestroy");
    }


    protected void
}