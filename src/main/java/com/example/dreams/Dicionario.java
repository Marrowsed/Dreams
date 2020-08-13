package com.example.dreams;

public class Dicionario {

    private String palavra;
    private long id;

    public String getPalavra () {
        return palavra;
    }

    public long getId () {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
}
