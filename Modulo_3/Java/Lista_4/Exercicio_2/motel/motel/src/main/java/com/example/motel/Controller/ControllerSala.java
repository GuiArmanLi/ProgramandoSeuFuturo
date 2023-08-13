package com.example.motel.Controller;
import com.example.motel.Repository.BancoDeDados;
import com.example.motel.Service.ServiceSala;
import com.example.motel.model.ModelSala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("motel")
public class ControllerSala {
    @Autowired
    ServiceSala service;
    @GetMapping
    public List<ModelSala> getSalas(){
        return service.getAll();
    }
    @PutMapping("/{id}")
    public String putSala(@PathVariable int id,@RequestBody ModelSala sala){
        return service.putSala(id, sala);
    }
}
