package com.example.coco.service;

import com.example.coco.model.Jogo;
import com.example.coco.repository.BancoDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JogoService {
    @Autowired
    private BancoDados bancoDados;
    List<Jogo>jogos = bancoDados.findAll();

    public List<Jogo> findAll(){
        return bancoDados.findAll();
    }

    public Jogo getByid(int id){
        for (Jogo jogo: jogos){
            if (jogo.get_id()==id){
                return jogo;
            }
        }
        return null;
    }

    public String postJogo(Jogo jogo){
        for (Jogo listaJogos: bancoDados.findAll()){
            if (listaJogos.get_id()==jogo.get_id()){
                return "Jogo ja existe";
            }
        }

        jogos.add(jogo);
        return "Jogo cadastrado";
    }

    public String putJogo (int _id, String name, int price){
        for (Jogo listaJogo:jogos){
            if (listaJogo.get_id()==_id){
                jogos.get(_id).setName(name);
                jogos.get(_id).setPrice(price);

            } else if (listaJogo.get_id() != _id) {
                return "Jogo nao encontrado, por favor, insira o jogo ou coloque o parametro correto.";
            }
        }
        return null;
    }

    public String deleteJogo (int _id){
        for (Jogo jogo : jogos){
            if (jogo.get_id() == _id){
                jogos.remove(jogo.get_id());
                return "Jogo removido com sucesso!";
            }
        }

        return "Jogo nao pode ser removido";
    }
}
