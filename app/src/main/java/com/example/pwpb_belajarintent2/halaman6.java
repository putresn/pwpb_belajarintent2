package com.example.pwpb_belajarintent2;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class halaman6 extends AppCompatActivity implements View.OnClickListener {

    Button explicitintentm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman6);
        explicitintentm = (Button) findViewById(R.id.buttonlanjut6);
        explicitintentm.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonlanjut6:
                Intent explicit = new Intent(halaman6.this, MainActivity.class);
                startActivity(explicit);
                break;
        }
    }
}