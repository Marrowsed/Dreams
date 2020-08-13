package com.example.dreams;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtCenter;
    ImageView imgCenter;
    Button btnCenter;
    Intent it;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCenter = (TextView) findViewById(R.id.txtCenter);
        btnCenter = (Button) findViewById(R.id.btnCenter);
        imgCenter = (ImageView)findViewById(R.id.imgCenter);
    }

    public void nxtPage (View v) {
         it = new Intent (this, Tipos.class);
            startActivity(it);
    }
}