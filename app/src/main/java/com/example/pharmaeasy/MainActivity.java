package com.example.pharmaeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;

public class MainActivity extends AppCompatActivity {
     private  static  int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent SingInIntent = new Intent(MainActivity.this,SingInActivity.class);
                startActivity(SingInIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
