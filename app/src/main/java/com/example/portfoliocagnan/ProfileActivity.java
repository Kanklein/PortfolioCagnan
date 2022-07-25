package com.example.portfoliocagnan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        btnCallListenerMethod();
    }

    private void btnCallListenerMethod() {
        Button btnCall = findViewById(R.id.btnCall);
        Uri number = Uri.parse("tel: 09562912706");
        Intent intent = new Intent(Intent.ACTION_DIAL, number);
        btnCall.setOnClickListener(view -> startActivity(intent));
    }
}
