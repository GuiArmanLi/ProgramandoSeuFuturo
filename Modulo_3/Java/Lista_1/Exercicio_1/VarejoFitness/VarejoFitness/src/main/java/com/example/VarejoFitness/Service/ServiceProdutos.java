package com.example.VarejoFitness.Service;

import com.example.VarejoFitness.Model.Produto;
import com.example.VarejoFitness.Repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProdutos {
    @Autowired
    BancoDeDados bancoDeDados;
    public List<Produto> getProdutos(){
        return bancoDeDados.findAll();
    }

    public Produto getByCodigoDeBarras(int codigoDeBarras){
        for (Produto produto : bancoDeDados.findAll()) {
            if (produto.getCodigoDeBarras() == codigoDeBarras) {
                return produto;
            }
        }
        return null;
    }

    public String postProduto(Produto produto){
        for (Produto produtoPesquisado : bancoDeDados.findAll()){
            if(produtoPesquisado.getCodigoDeBarras() == produto.getCodigoDeBarras()) {
                return "Produto ja existente!";
            }
        }
        bancoDeDados.findAll().add(produto);
        return "Produto adicionado!";
    }
}
