package com.codeclan.example.bookingservice.controllers;

import com.codeclan.example.bookingservice.models.Customer;
import com.codeclan.example.bookingservice.repository.customers.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/{id}")
    public List<Customer> getCustomerById(@PathVariable Long id) {
        return customerRepository.findCustomerById(id);
    }
}
