package com.example.superhero.entity.superhero;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@CrossOrigin
public class RestCtrl {
    
    @Autowired
    private ServiceInterface serviceInterface;

    @GetMapping("/")
    public Optional<List<Superhero>> findAllSuperheroes() {
        List<Superhero> superheroes = serviceInterface.findAll();
        return Optional.of(superheroes);
    }
}
