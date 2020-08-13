package com.example.dreams;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListaPesadelos extends ListActivity {
    String regPal;
    List<Dicionario2> listPal;
    ArrayList<String> arrlPal;
    ManipulaBD db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_listar_palavras); NÃO É NECESSÁRIO POR NÃO PRECISAR DE VIEW
        arrlPal = new ArrayList<String>();
        db = new ManipulaBD(this);
        listPal = db.buscar2();
        for (Dicionario2 dic : listPal) {
            regPal = dic.getId() + " " + dic.getPalavra();
            arrlPal.add(regPal);
        }
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrlPal);
        this.setListAdapter(dataAdapter);
    }
}
