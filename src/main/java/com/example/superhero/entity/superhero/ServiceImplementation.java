package com.example.superhero.entity.superhero;

import java.util.List;
import java.util.Optional;

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
            throw new RuntimeException("Could not save superhero", ex);
        }
    }

    @Override
    public void deleteById(int id) {
       repository.deleteById(id);
    
    }

    @Override
    public Optional<Superhero> findById(int id){
        return repository.findById(id);
    }

   
    
}
