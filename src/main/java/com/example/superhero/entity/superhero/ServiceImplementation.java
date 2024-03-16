package com.example.superhero.entity.superhero;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exception_handler.SuperheroSaveException;

@Service
public class ServiceImplementation implements ServiceInterface {

    @Autowired
    private Repository repository;

    @Override
    public List<Superhero> findAll() { 
        return repository.findAll();
    }

    @Override
    public Superhero save(Superhero superhero) {
    try {
        return repository.save(superhero);
    } catch (Exception ex) {
        throw new SuperheroSaveException("Could not save superhero", ex);
    }
    }
}
