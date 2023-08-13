package com.example.motel.Service;

import com.example.motel.Repository.BancoDeDados;
import com.example.motel.model.ModelSala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceSala {
    @Autowired
    BancoDeDados salas;

    public List<ModelSala> getAll(){
        return salas.findAll();
    }

    public String putSala(int id, ModelSala sala){
        for (ModelSala salaPercorrida : salas.findAll()){
            if (id == salaPercorrida.getId()){
                if (salaPercorrida.isEstaAlugada()){
                    salaPercorrida.setEstaAlugada(false);
                }else {salaPercorrida.setEstaAlugada(true);}
                return "Item atualizado com sucesso!";
            }
        }
        return null;
    }
}
