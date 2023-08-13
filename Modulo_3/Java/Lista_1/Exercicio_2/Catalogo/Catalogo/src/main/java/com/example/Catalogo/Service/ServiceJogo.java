package com.example.Catalogo.Service;
import com.example.Catalogo.Model.Jogo;
import com.example.Catalogo.Repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServiceJogo {
    @Autowired
    BancoDeDados bancoDeDados;

    public List<Jogo> getJogos() {
        return bancoDeDados.findAll();
    }

    public Jogo getById(int id) {
        for (Jogo jogo : bancoDeDados.findAll()) {
            if (jogo.getId() == id) {
                return jogo;
            }
        }
        return null;
    }

    public Jogo getByMenorPreco() {
        int indexMenorPreco = 0;
        int menorPreco = 999;
        for (Jogo jogo : bancoDeDados.findAll()) {
            if (jogo.getPreco() < menorPreco) {
                indexMenorPreco = jogo.getId();
            }
        }
        return bancoDeDados.findAll().get(indexMenorPreco);
    }

    public String postJogo(Jogo jogo) {
        for (Jogo i : bancoDeDados.findAll()){
            if (i.getId() == jogo.getId()) {
                return "Ola mundo";
            }
        }
        bancoDeDados.addJogo(jogo);
        return "Foi";
    }
}
