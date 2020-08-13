package com.example.dreams;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Pesadelos extends Activity {

    EditText edtNight;
    private Dicionario2 dic = new Dicionario2();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesadelos);
        edtNight = (EditText) findViewById(R.id.edtNight);
    }

    public void gravarClick (View v) {
        dic.setPalavra(edtNight.getText().toString());
        ManipulaBD bd = new ManipulaBD(this);
        bd.inserir2(dic);
        Toast.makeText(this, "Pesadelo cadastrado com sucesso !", Toast.LENGTH_SHORT).show();
        finish();
    }

    public void listNight (View v) {
        Intent it = new Intent(this, ListaPesadelos.class);
        startActivity(it);
    }
}
