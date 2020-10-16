package com.example.happybirthdayapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNameInput;
    Button btnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNameInput = findViewById(R.id.etNameInput);
        btnCreate = findViewById(R.id.btnCreate);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,
                        com.example.happybirthdayapplication.BirthdayGreetingActivity.class);
                String name = etNameInput.getText().toString().trim();
                Toast.makeText(MainActivity.this, "Hello " + name + " !!", Toast.LENGTH_SHORT).show();
                //putting the data (name) in the intent
                intent.putExtra("name", name);
                //passing the data to other activity with the help of intent
                startActivity(intent);
            }
        });
    }
}