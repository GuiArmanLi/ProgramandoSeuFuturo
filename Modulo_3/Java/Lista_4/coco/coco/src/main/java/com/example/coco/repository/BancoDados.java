package com.example.coco.repository;

import com.example.coco.model.Jogo;

import java.util.ArrayList;
import java.util.List;

public class BancoDados {

    private List<Jogo>jogos = new ArrayList<>();


    private BancoDados(){
        jogos.add(new Jogo(1,"pirulito",20));
        jogos.add(new Jogo(2,"pocoyo",30));
        jogos.add(new Jogo(3,"lola",5));
    }
    public List<Jogo> findAll(){
        return jogos;
    }

}
