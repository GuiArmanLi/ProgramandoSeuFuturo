package com.example.Catalogo.Repository;
import com.example.Catalogo.Model.Jogo;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BancoDeDados {
    List<Jogo> jogos = new ArrayList<Jogo>();

    public List<Jogo> findAll (){
        return jogos;
    }
    public void addJogo (Jogo jogo){
        jogos.add(jogo);
    }
}
