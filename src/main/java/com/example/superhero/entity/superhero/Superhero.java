package com.example.superhero.entity.superhero;

import lombok.Data;
import javax.validation.constraints.NotNull;
import jakarta.persistence.*;

@Entity
@Data
@Table(name = "superhero")
public class Superhero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    @NotNull(message = "First name cannot be null")
    private String first_name;

    @Column(name = "last_name")
    @NotNull(message = "Last name cannot be null")
    private String last_name;

    @Column(name = "release_date")
    @NotNull(message = "Release date cannot be null")
    private int release_date;

    @Column(name = "hero_name")
    @NotNull(message = "Hero name cannot be null")
    private String hero_name;

    @Column(name = "powers")
    @NotNull(message = "Powers cannot be null")
    private String powers;

    
}
