package com.example.endereco.Service;
import com.example.endereco.Model.Endereco;
import com.example.endereco.Repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
    @Autowired
    BancoDeDados enderecos;

    public Endereco findByCep (String cep){
        for (Endereco endereco : enderecos.findAll()){
            if(cep.equals(endereco.cep)){
                return endereco;
            }
        }
        return null;
    }
}
