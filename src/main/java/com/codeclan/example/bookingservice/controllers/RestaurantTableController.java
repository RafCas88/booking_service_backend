package com.codeclan.example.bookingservice.controllers;

import com.codeclan.example.bookingservice.repository.restaurantTables.RestaurantTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurantTables")
public class RestaurantTableController {
    @Autowired
    RestaurantTableRepository restaurantTableRepository;
}
