package com.example.superhero.entity.superhero;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImplementation implements ServiceInterface {

    @Autowired
    private Repository repository;

    @Override
    public List<Superhero> findAll() { 
        return repository.findAll();
    }


    


    
}
