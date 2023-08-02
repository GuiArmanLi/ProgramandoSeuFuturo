package com.example.ecommerce.services;

import com.example.ecommerce.model.Cosmetico;
import com.example.ecommerce.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CosmeticosService {
    @Autowired
    BancoDeDados bancoDeDados;

    public List<Cosmetico> getAllProducts(){

        return bancoDeDados.findAll();
    }

    public Cosmetico getById(int id){
        for (Cosmetico cosmetico : bancoDeDados.findAll()){
            if (cosmetico.getId() == id){
                return cosmetico;
            }
        }
        return null;
    }

    public String postProduct(Cosmetico cosmetico){
        for (Cosmetico cosmetica : bancoDeDados.findAll()){
            if (cosmetico.getId() == cosmetica.getId()){
                return "Produto ja existente no banco del dados!";
            }
        }
        bancoDeDados.postProduct(cosmetico);
        return "Produto cadastrado com sucesso!";
    }

    public String deleteProduct(int id){
        for (Cosmetico cosmetico : bancoDeDados.findAll()){
            if (cosmetico.getId() == id){
                bancoDeDados.delete(cosmetico);
                return "Produto deletado com sucesso!";
            }
        }
        return "Produto nao consta en el banco del dados!";
    }
}
