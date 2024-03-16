package com.example.superhero.entity.superhero;

import lombok.Data;
import javax.validation.constraints.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Data
@Table(name = "superhero")
public class Superhero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    @NotBlank
    private String first_name;

    @Column(name = "last_name")
    @NotBlank
    private String last_name;

    @Column(name = "release_date")
    @NotNull
    private int release_date;

    @Column(name = "hero_name")
    @NotBlank
    private String hero_name;

    @Column(name = "powers")
    @NotBlank
    private String powers;

    
}
