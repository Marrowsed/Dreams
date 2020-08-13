package com.example.dreams;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Tipos extends Activity {

    Intent it;
    Button btnD, btnN;
    TextView txtD, txtN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_tipos);
        btnD = (Button) findViewById(R.id.btnD);
        btnN = (Button) findViewById(R.id.btnN);
        txtD = (TextView) findViewById(R.id.txtD);
        txtN = (TextView) findViewById(R.id.txtN);

    }

    public void DreamPage(View v) {
        it = new Intent(this, Sonhos.class);
        startActivity(it);
    }

    public void NightPage(View v) {
        it = new Intent(this, Pesadelos.class);
        startActivity(it);
    }

}
