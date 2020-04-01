package com.codeclan.example.bookingservice.models;

import javax.persistence.*;

@Entity
@Table
public class RestaurantTable {

    @Column(name = "table_number")
    private int tableNumber;

    @Column(name = "number_of_seats")
    private int numberOfSeats;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
