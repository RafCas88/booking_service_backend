package com.codeclan.example.bookingservice.models;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "telephone_number")
    private int telephoneNumber;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
