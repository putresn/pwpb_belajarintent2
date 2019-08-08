package com.example.pwpb_belajarintent2;

import  android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class halaman3 extends AppCompatActivity implements View.OnClickListener {
    Button explicitintent4;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman3);
        explicitintent4 = (Button) findViewById(R.id.buttonlanjut3);
        explicitintent4.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.buttonlanjut3:
                Intent explicit = new Intent (halaman3.this, halaman4.class);
                startActivity(explicit);
                break;
        }
    }
}



