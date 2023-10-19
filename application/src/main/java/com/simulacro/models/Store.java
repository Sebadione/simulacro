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
@Table(name = "store")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;

    @OneToOne
    Staff managerStaff;

    @ManyToOne
    Address address;

    @OneToMany(mappedBy = "store")
    List<Staff> staff;



}
