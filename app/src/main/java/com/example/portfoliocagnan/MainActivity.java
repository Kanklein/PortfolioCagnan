package com.example.portfoliocagnan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnProfileListenerMethod();
        btnOnlineListenerMethod();
        btnLocationListenerMethod();
    }

    private void btnProfileListenerMethod() {
        Intent intent = new Intent(this, ProfileActivity.class);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> startActivity(intent));
    }
    private void btnOnlineListenerMethod() {
        Intent intent = new Intent(this, OnlineActivity.class);
        Button button = findViewById(R.id.button2);
        button.setOnClickListener(view -> startActivity(intent));
    }
    private void btnLocationListenerMethod() {
        Intent intent = new Intent(this, LocationsActivity.class);
        Button button = findViewById(R.id.button3);
        button.setOnClickListener(view -> startActivity(intent));
    }
}