package com.techt.myreverseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1 = findViewById(R.id.textView);
        textView1.setText("Hello Vivek!");
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText("Welcome!");
    }
}