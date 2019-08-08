package com.example.pwpb_belajarintent2;

import  android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class halaman2 extends AppCompatActivity implements View.OnClickListener {

    Button explicitintent3;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);
        explicitintent3 = (Button) findViewById(R.id.buttonlanjut2);
        explicitintent3.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.buttonlanjut2:
                Intent explicit = new Intent (halaman2.this, halaman3.class);
                startActivity(explicit);
                break;
        }
    }
}

