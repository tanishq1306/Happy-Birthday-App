package com.example.happybirthdayapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BirthdayGreetingActivity extends AppCompatActivity {

    TextView tvGreet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);

        tvGreet = findViewById(R.id.tvGreet);
        String name = getIntent().getStringExtra("name");

        tvGreet.setText("Happy Birthday Dear" + name + "!");
    }
}