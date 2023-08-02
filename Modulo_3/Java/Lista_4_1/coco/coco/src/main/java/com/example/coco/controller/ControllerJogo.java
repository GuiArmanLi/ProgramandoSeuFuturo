package com.example.coco.controller;

import com.example.coco.model.Jogo;
import com.example.coco.repository.BancoDados;
import com.example.coco.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ControllerJogo {
    @Autowired
    private JogoService jogoService;
    @GetMapping
    private List<Jogo> findAll(){
     return jogoService.findAll();
    }

    @GetMapping("/{_id}")
    public Jogo getById (@PathVariable int _id){
        return jogoService.getByid(_id);
    }
    @PostMapping
    public String postJogo(@RequestBody Jogo jogo){
        return jogoService.postJogo(jogo);
    }

    @PutMapping("/{_id}")
    public String putJogo(@PathVariable int _id, @RequestBody String name, int price){
        return jogoService.putJogo(_id, name, price);
    }
    @DeleteMapping("/{_id}")
    public String deleteJogoById(@PathVariable int _id) {
        return jogoService.deleteJogo(_id);
    }
}
