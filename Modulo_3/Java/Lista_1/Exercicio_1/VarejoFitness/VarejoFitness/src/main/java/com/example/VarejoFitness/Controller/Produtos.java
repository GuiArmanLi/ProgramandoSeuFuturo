package com.example.VarejoFitness.Controller;
import com.example.VarejoFitness.Model.Produto;
import com.example.VarejoFitness.Repository.BancoDeDados;
import com.example.VarejoFitness.Service.ServiceProdutos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/produtos")
public class Produtos {
    @Autowired
    ServiceProdutos service;

    @GetMapping
    public List<Produto> getProdutos(){
        return service.getProdutos();
    }

    @GetMapping("/{codigoDeBarras}")
    public Produto getByCodigoDeBarras(@PathVariable int codigoDeBarras){
        return service.getByCodigoDeBarras(codigoDeBarras);
    }
    @PostMapping
    public String postProduto(@RequestBody Produto produto){
        return service.postProduto(produto);
    }
}
