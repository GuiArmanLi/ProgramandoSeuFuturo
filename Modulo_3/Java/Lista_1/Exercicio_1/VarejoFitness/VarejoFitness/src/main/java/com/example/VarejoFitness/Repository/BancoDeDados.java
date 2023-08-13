package com.example.VarejoFitness.Repository;
import com.example.VarejoFitness.Model.Produto;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BancoDeDados {
    List<Produto> produtos = new ArrayList<>();

    public List<Produto> findAll(){
        return produtos;
    }
}
