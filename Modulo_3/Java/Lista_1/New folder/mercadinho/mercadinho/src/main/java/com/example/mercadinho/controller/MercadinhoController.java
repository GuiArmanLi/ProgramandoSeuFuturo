package com.example.mercadinho.controller;

import com.example.mercadinho.model.Produtos;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class MercadinhoController {

    @GetMapping
    public List<Produtos> getProdutos(){
        return produtos;
    }
    @GetMapping
    public Produtos getByCodigoDeBarras(@PathVariable int codigoDeBarras){
        for (Produtos produto : produtos) {
            if (produto.getCodigoDeBarras() == codigoDeBarras) {
                return produto;
            }
        }
        return null;
    }

    @PostMapping
    public String postProduto(@RequestBody Produtos produto){
        this.produtos.add(produto);
        return "";
    }

    private List<Produtos> produtos = new ArrayList<>();

    public MercadinhoController(){
        produtos.add(new Produtos(1, "Manga doce", 9));
        produtos.add(new Produtos(2, "Manga salgada", 3));
        produtos.add(new Produtos(3, "Manga azeda", 5));
    }

}
