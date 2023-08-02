package com.example.motel.model;

public class ModelSala {
    private int id;
    private boolean estaAlugada;
    private String nomeLocatario;

    public ModelSala() {
    }

    public ModelSala(int id, boolean estaAlugada, String nomeLocatario) {
        this.id = id;
        this.estaAlugada = estaAlugada;
        this.nomeLocatario = nomeLocatario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstaAlugada() {
        return estaAlugada;
    }

    public void setEstaAlugada(boolean estaAlugada) {
        this.estaAlugada = estaAlugada;
    }

    public String getNomeLocatario() {
        return nomeLocatario;
    }

    public void setNomeLocatario(String nomeLocatario) {
        this.nomeLocatario = nomeLocatario;
    }
}
