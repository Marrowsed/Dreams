package com.example.dreams;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListarSonhos extends ListActivity {
    String regPal;
    List<Dicionario> listPal;
    ArrayList<String> arrlPal;
    ManipulaBD db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_listar_palavras); NÃO É NECESSÁRIO POR NÃO PRECISAR DE VIEW
        arrlPal = new ArrayList<String>();
        db = new ManipulaBD(this);
        listPal = db.buscar();
        for (Dicionario dic : listPal) {
            regPal = dic.getId() + " " + dic.getPalavra();
            arrlPal.add(regPal);
        }
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrlPal);
        this.setListAdapter(dataAdapter);
    }

}