package com.codeclan.example.bookingservice.repository.customers;

import com.codeclan.example.bookingservice.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
