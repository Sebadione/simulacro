package com.simulacro.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "film")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "film_id")
    long id;

    String title;

    String description;

    String releaseYear;

    @ManyToOne
    Language language;

    int rentalDuration;

    double rentalRate;

    int length;

    double replacementCost;

    String rating;

    String specialFeatures;

    @ManyToMany
    @JoinTable(name = "film_actor",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id"))
    List<Actor> actors;

    @ManyToMany
    @JoinTable(name = "film_category",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    List<Category> categories;
}
