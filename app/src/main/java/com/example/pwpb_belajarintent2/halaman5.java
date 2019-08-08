package com.example.pwpb_belajarintent2;

import  android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class halaman5 extends AppCompatActivity implements View.OnClickListener {

    Button explicitintent6;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman5);
        explicitintent6 = (Button) findViewById(R.id.buttonlanjut5);
        explicitintent6.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.buttonlanjut5:
                Intent explicit = new Intent (halaman5.this, halaman6.class);
                startActivity(explicit);
                break;
        }
    }
}