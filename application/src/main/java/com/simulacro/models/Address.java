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
@Table(name = "address")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;

    @Column(name = "address")
    String name;

    @ManyToOne
    City city;

    String postalCode;

    @OneToMany(mappedBy = "address")
    List<Store> stores;

    @OneToMany(mappedBy = "address")
    List<Staff> staffs;


}
