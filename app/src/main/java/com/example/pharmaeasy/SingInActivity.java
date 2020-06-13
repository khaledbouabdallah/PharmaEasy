package com.example.pharmaeasy;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SingInActivity extends AppCompatActivity {
Button callSingUp;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_in);
        callSingUp = findViewById(R.id.singup_screen);
        callSingUp.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SingInActivity.this,SingUpActivity.class);
                startActivity(intent);
            }
        });
    }
}
