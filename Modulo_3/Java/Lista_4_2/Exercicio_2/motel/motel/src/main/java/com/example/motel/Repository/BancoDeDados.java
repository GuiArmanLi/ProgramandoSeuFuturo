package com.example.motel.Repository;

import com.example.motel.model.ModelSala;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    List<ModelSala> salas = new ArrayList<ModelSala>();

    public List<ModelSala> findAll(){
        return salas;
    }
    public void addSala(){

    }
}
