package com.example.dreams;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class ManipulaBD {

    private SQLiteDatabase bd;

    public ManipulaBD(Context context) {
        CriaBD auxBd = new CriaBD(context);
        bd = auxBd.getWritableDatabase();
    }


    public void inserir(Dicionario dic) {
        ContentValues valores = new ContentValues();
        valores.put("palavra", dic.getPalavra());
        bd.insert("tbpalavra", null, valores);
    }

    public void inserir2(Dicionario2 dic) {
        ContentValues valores = new ContentValues();
        valores.put("palavra", dic.getPalavra());
        bd.insert("tbpalavra", null, valores);
    }


    public void atualizar(Dicionario dic) {
        ContentValues valores = new ContentValues();
        valores.put("palavra", dic.getPalavra());
        bd.update("tbpalavra", valores, "_id = ?", new String[]{"" + dic.getId()});
    }

    public void atualizar2(Dicionario2 dic) {
        ContentValues valores = new ContentValues();
        valores.put("palavra", dic.getPalavra());
        bd.update("tbpalavra", valores, "_id = ?", new String[]{"" + dic.getId()});
    }


    public void deletar(Dicionario dic) {

        bd.delete("tbpalavra", "_id = " + dic.getId(), null);
    }

    public void deletar2(Dicionario2 dic) {

        bd.delete("tbpalavra", "_id = " + dic.getId(), null);
    }


    public List<Dicionario> buscar() {
        List<Dicionario> list = new ArrayList<Dicionario>();
        String[] colunas = new String[]{"_id", "palavra"};

        Cursor cursor = bd.query("tbpalavra", colunas, null, null, null, null, "palavra ASC");


        if (cursor.getCount() > 0) {
            cursor.moveToFirst();

            do {
                Dicionario d = new Dicionario();
                d.setId(cursor.getLong(0));
                d.setPalavra(cursor.getString(1));
                list.add(d);
            } while (cursor.moveToNext());
        }
        return (list);
    }

    public List<Dicionario2> buscar2() {
        List<Dicionario2> list = new ArrayList<Dicionario2>();
        String[] colunas = new String[]{"_id", "palavra"};

        Cursor cursor = bd.query("tbpalavra", colunas, null, null, null, null, "palavra ASC");


        if (cursor.getCount() > 0) {
            cursor.moveToFirst();

            do {
                Dicionario2 d = new Dicionario2();
                d.setId(cursor.getLong(0));
                d.setPalavra(cursor.getString(1));
                list.add(d);
            } while (cursor.moveToNext());
        }
        return (list);
    }
}
