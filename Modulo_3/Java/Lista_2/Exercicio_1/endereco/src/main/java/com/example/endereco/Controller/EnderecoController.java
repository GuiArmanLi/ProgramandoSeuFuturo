package com.example.endereco.Controller;

import com.example.endereco.Model.Endereco;
import com.example.endereco.Service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    EnderecoService service;

    @GetMapping("/{cep}")
    public Endereco getByCep(@PathVariable String cep){
        return service.findByCep(cep);
    }
}
