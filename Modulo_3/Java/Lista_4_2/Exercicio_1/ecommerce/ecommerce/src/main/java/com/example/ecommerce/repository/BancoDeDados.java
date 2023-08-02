package com.example.ecommerce.repository;

import com.example.ecommerce.model.Cosmetico;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {
    List<Cosmetico> cosmeticos = new ArrayList<Cosmetico>();

    public List<Cosmetico> findAll(){
        return cosmeticos;
    }

    public void postProduct(Cosmetico cosmetico){
        cosmeticos.add(cosmetico);
    }

    public String delete(Cosmetico cosmetico){
        cosmeticos.remove(cosmetico);
        return "Produto descadastrado com sucesso!";
    }
}
