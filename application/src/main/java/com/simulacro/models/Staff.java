package com.simulacro.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "staff")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String firstName;

    private String lastName;

    @ManyToOne
    private Address address;

    private String email;

    @ManyToOne
    private Store store;

    private int active;

    private String username;

    private String password;
}
