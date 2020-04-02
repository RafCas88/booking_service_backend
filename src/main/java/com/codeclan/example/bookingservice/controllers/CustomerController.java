package com.codeclan.example.bookingservice.controllers;

import com.codeclan.example.bookingservice.repository.customers.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;
}
