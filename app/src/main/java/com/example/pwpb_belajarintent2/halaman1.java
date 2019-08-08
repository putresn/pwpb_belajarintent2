package com.example.pwpb_belajarintent2;

import androidx.appcompat.app.AppCompatActivity;

import  android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class halaman1 extends AppCompatActivity implements View.OnClickListener{

    Button explicitintent2;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman1);
        explicitintent2 = (Button) findViewById(R.id.buttonlanjut1);
        explicitintent2.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.buttonlanjut1:
                Intent explicit = new Intent (halaman1.this, halaman2.class);
                startActivity(explicit);
                break;
        }
    }
}

