package com.example.superhero.entity.superhero;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@CrossOrigin
public class RestCtrl {
    
    /*----------------------- IMPLEMENTATION -------------------------*/

    @Autowired
    private ServiceInterface serviceInterface;

    /*----------------------- GET (READ) ---------------------------- */

    @GetMapping("/")
    public ResponseEntity<List<Superhero>> findAllSuperheroes() {
        List<Superhero> superheroes = serviceInterface.findAll();
        if (superheroes.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(superheroes, HttpStatus.OK);
        }
    }
       

    /*----------------------- POST (CREATE) ---------------------------- */

    @PostMapping("/")
    public ResponseEntity<String> postSuperhero(@Valid @RequestBody Superhero superhero) {
        Superhero superhero_to_save = serviceInterface.save(superhero);

        if (superhero_to_save == null) {
            return new ResponseEntity<String>("Could not save superhero, please fill out every", HttpStatus.NOT_ACCEPTABLE);
        } else {
            return new ResponseEntity<String>("Superhero succesfully saved", HttpStatus.CREATED);
        }
    
    }
}
