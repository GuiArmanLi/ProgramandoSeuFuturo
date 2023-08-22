package com.example.ecommerce.controller;

import com.example.ecommerce.model.Cosmetico;
import com.example.ecommerce.services.CosmeticosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cosmeticos")
@CrossOrigin("*")
public class Produtos {
    @Autowired
    CosmeticosService service;

    @GetMapping
    public List<Cosmetico> getProducts(){
        return service.getAllProducts();
    }

    @GetMapping("{id}")
    public Cosmetico getProductById(@PathVariable int id){
        return service.getById(id);
    }

    @PostMapping("")
    public String postAProduct(@RequestBody Cosmetico cosmetico){
        return service.postProduct(cosmetico);
    }

    @DeleteMapping("{id}")
    public String deleteAProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }
}
