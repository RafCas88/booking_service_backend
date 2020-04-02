package com.codeclan.example.bookingservice.controllers;

import com.codeclan.example.bookingservice.repository.bookings.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    BookingRepository bookingRepository;
}
