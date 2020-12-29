package com.example.tunicovid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class First_activityActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        btn = findViewById(R.id.buttontest); btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(First_activityActivity.this,MainActivity2.class);
                startActivity(i);
            }
        });
        btn = findViewById(R.id.btn_propagation); btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(First_activityActivity.this,MainActivity8.class);
                startActivity(i);
            }
        });

    }
}