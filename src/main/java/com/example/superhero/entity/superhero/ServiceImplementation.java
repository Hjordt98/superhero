package com.example.superhero.entity.superhero;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class ServiceImplementation implements ServiceInterface {

    @Autowired
    private Repository repository;

    @Override
    public List<Superhero> findAll() { 
        return repository.findAll();
    }

    @Transactional
    public Superhero save(Superhero superhero) {
        try {
            return repository.save(superhero);
        } catch (Exception ex) {
            // Log the exception or perform other actions as needed
            throw new RuntimeException("Could not save superhero", ex);
        }
    }
}
