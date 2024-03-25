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

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Superhero>> findById(@PathVariable int id) {
        List<Superhero> superheroes = serviceInterface.findById();
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

    /*----------------------- DELETE (DELETE) ---------------------------- */

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteSuperhero(@PathVariable int id) {
    Optional<Superhero> superheroToFind = serviceInterface.findById(id);

    if (!superheroToFind.isPresent()) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No superhero with entered ID exists");  
    } else {
        serviceInterface.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Superhero successfully deleted");
    }
}

    /*----------------------- UPDATE (UPDATE) ---------------------------- */

    @PutMapping("/{id}")
    public ResponseEntity<String> updateSuperhero (@PathVariable int id, @Valid @RequestBody Superhero superhero, BindingResult bindingResult) {
        Optional<Superhero> superhero_to_update = serviceInterface.findById(id);

        if (!superhero_to_update.isPresent()) 
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No superhero with entered ID exists"); 
        else if (bindingResult.hasErrors()) {
            return new ResponseEntity<String>("Could not save superhero, please check for missing fields and make sure all attributes are filled", HttpStatus.BAD_REQUEST);
        } else {
            superhero_to_update.get().setFirst_name(superhero.getFirst_name());
            superhero_to_update.get().setLast_name(superhero.getLast_name());
            superhero_to_update.get().setHero_name(superhero.getHero_name());
            superhero_to_update.get().setPowers(superhero.getPowers());
            superhero_to_update.get().setRelease_date(superhero.getRelease_date());

            serviceInterface.save(superhero_to_update.get());
            return new ResponseEntity<String>("succesfully updated superhero", HttpStatus.ACCEPTED);
        }
    }
}