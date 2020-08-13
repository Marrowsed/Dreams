package com.example.dreams;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Sonhos extends Activity {

    EditText edtSonho;
    private Dicionario dic = new Dicionario();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonhos);
        edtSonho = (EditText) findViewById(R.id.edtSonho);
    }

    public void gravarClick (View v) {
        dic.setPalavra(edtSonho.getText().toString());
        ManipulaBD bd = new ManipulaBD(this);
        bd.inserir(dic);
        Toast.makeText(this, "Sonho cadastrado com sucesso !", Toast.LENGTH_SHORT).show();
        finish();
    }

    public void listSonho(View v) {
            Intent it = new Intent(this, ListarSonhos.class);
            startActivity(it);
        }

    }
