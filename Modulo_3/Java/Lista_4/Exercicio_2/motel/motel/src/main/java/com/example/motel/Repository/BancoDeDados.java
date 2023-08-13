package com.example.motel.Repository;

import com.example.motel.model.ModelSala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class BancoDeDados {
    List<ModelSala> salas = new ArrayList<ModelSala>();

    public List<ModelSala> findAll(){
        return salas;
    }

    private BancoDeDados (){
        salas.add(new ModelSala(1,true,"Brasil"));
        salas.add(new ModelSala(2,true,"EUA"));
        salas.add(new ModelSala(3,true,"Alemanha"));
        salas.add(new ModelSala(4,true,"Japao"));
        salas.add(new ModelSala(5,false,"Canada"));
        salas.add(new ModelSala(6,false,"Armenia"));
        salas.add(new ModelSala(7,false, "Angola"));
        salas.add(new ModelSala(8,false,"Argentina"));
    }
}
