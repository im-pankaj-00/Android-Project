package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

TextView tvPankaj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPankaj = findViewById(R.id.tvPankajSharma);

        tvPankaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data =  tvPankaj.getText().toString();
                Intent intent = new Intent(MainActivity.this , SecondActivity.class);
                intent.putExtra("dataname" , data);
                startActivity(intent);

            }
        });
    }
}