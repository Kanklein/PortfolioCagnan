package com.example.portfoliocagnan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OnlineActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online);
        btnOldsiteListenerMethod();
        btnFacebookListenerMethod();
    }
    private void btnOldsiteListenerMethod() {
        Button btnCall = findViewById(R.id.btnOldsite);
        Uri web = Uri.parse("https://janala61.wixsite.com/website");
        Intent intent = new Intent(Intent.ACTION_VIEW, web);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
    private void btnFacebookListenerMethod() {
        Button btnCall = findViewById(R.id.btnFacebook);
        Uri web = Uri.parse("https://www.facebook.com/brynerjohn.cagnan.90");
        Intent intent = new Intent(Intent.ACTION_VIEW, web);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}
