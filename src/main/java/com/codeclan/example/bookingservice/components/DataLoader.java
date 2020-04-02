package com.codeclan.example.bookingservice.components;
import com.codeclan.example.bookingservice.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

    @Component
    public class DataLoader implements ApplicationRunner {

        @Autowired
        BookingRepository bookingRepository;

    }


