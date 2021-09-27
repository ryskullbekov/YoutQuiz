package com.example.youtquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button start,exit,review;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initClickers();
    }

    private void initClickers() {
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,levelActivity.class);
                startActivity(intent);

            }
        });
    }

    private void initView() {
        start = findViewById(R.id.start_btn);
        review = findViewById(R.id.review_btn);
        exit = findViewById(R.id.exit_btn);

    }
}