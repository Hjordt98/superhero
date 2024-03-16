package com.example.superhero.entity.superhero;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;




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
    public ResponseEntity<String> postSuperhero(@Valid @RequestBody Superhero superhero, BindingResult bindingResult) {
        
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<String>("Could not save superhero, please check for missing fields and make sure all attributes are filled", HttpStatus.BAD_REQUEST);
        } else {
            serviceInterface.save(superhero);
            return new ResponseEntity<String>("succesfully saved superhero", HttpStatus.ACCEPTED);
        }
    }
}
