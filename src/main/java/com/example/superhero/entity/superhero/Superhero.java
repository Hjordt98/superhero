package com.example.superhero.entity.superhero;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.*;

@Entity
@Data
@Table
public class Superhero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "release_date")
    private int release_date;

    @Column(name = "hero_name")
    private String hero_name;

    @Column(name = "powers")
    private String powers;

    
}
