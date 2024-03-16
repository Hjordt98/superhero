package com.example.superhero.entity.superhero;

import java.util.List;

public interface ServiceInterface {
    
    List<Superhero> findAll();

    Superhero save(Superhero superhero);
}
