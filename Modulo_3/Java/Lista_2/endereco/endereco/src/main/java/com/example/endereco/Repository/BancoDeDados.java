package com.example.endereco.Repository;
import com.example.endereco.Model.Endereco;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BancoDeDados {
    List<Endereco> enderecos = new ArrayList<Endereco>();
    public List<Endereco> findAll(){
        return enderecos;
    }

    public BancoDeDados (Endereco endereco){
        enderecos.add(new Endereco("08534-000","Rua Caca Cabra","Porao","Cabra Cega","SP"));
        enderecos.add(new Endereco("08534-111","Rua Cabra","1","Dona Maria","SP"));
        enderecos.add(new Endereco("08534-222","Rua Caca","2","Jorisvaldo","RJ"));
    }
}
