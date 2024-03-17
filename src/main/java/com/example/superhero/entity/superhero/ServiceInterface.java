package com.example.superhero.entity.superhero;

import java.util.List;
import java.util.Optional;

public interface ServiceInterface {
    
    List<Superhero> findAll();

    Superhero save(Superhero superhero);

    void deleteById(int id);

    Optional<Superhero> findById(int id);
}
