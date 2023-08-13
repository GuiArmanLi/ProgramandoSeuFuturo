package com.example.Catalogo.Controller;
import com.example.Catalogo.Model.Jogo;
import com.example.Catalogo.Service.ServiceJogo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/jogos")
public class ControllerJogo {
    @Autowired
    ServiceJogo serviceJogo;
    @GetMapping
    public List<Jogo> getJogos(){
        return serviceJogo.getJogos();
    }
    @GetMapping("/{id}")
    public Jogo getById(@PathVariable int id){
        return serviceJogo.getById(id);
    }

    @GetMapping("/menorPreco")
    public Jogo getByMenorPreco(){
        return serviceJogo.getByMenorPreco();
    }

    @PostMapping
    public String postJogo(@RequestBody Jogo jogo){
        return serviceJogo.postJogo(jogo);
    }
}
