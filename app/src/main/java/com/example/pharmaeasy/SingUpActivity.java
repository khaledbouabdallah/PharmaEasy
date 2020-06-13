package com.example.pharmaeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SingUpActivity extends AppCompatActivity {
    Button callSingIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        callSingIn = findViewById(R.id.singin_screen);
        callSingIn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SingUpActivity.this,SingInActivity.class);
                startActivity(intent);
            }
        });
    }

}
