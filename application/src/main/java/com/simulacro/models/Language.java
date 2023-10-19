package com.simulacro.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "language")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "language_id")
    private long id;

    private String name;

    @OneToMany(mappedBy = "language")
    private List<Film> films;
}
