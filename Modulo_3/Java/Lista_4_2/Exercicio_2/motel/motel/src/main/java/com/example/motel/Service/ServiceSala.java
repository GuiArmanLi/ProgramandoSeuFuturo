package com.example.motel.Service;

import com.example.motel.Repository.BancoDeDados;
import com.example.motel.model.ModelSala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceSala {
    ServiceSala service = new ServiceSala();
    @Autowired
    BancoDeDados salas;

    public String putSala(int id, ModelSala sala){
        for (ModelSala salaPercorrida : salas.findAll()){
            if (id == salaPercorrida.getId()){
                salas.findAll(). = salaPercorrida;
                return "Item atualizado com sucesso!";
            }
        }
        return null;
    }
}
