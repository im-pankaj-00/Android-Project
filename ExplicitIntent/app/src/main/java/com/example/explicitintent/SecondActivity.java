package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView learn , neat;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        learn = findViewById(R.id.learn);
        neat = findViewById(R.id.neat);

        Intent intent = getIntent();
        data = intent.getStringExtra("dataname");

        learn.setText("I'm " +data);
        neat.setText("Software Developer "+data);

    }
}