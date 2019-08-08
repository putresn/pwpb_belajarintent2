package com.example.pwpb_belajarintent2;

import  android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class halaman4 extends AppCompatActivity implements View.OnClickListener {
    Button explicitintent5;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman4);
        explicitintent5 = (Button) findViewById(R.id.buttonlanjut4);
        explicitintent5.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.buttonlanjut4:
                Intent explicit = new Intent (halaman4.this, halaman5.class);
                startActivity(explicit);
                break;
        }
    }
}
