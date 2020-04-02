package com.codeclan.example.bookingservice.controllers;

import com.codeclan.example.bookingservice.models.Booking;
import com.codeclan.example.bookingservice.repository.bookings.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/date{date}/time{time}/customer{customerId}")
    public List<Booking>getBookingByDateAndTimeAndCustomerId(@PathVariable String time, @PathVariable String date, @PathVariable Long customerId) {
        LocalTime getTime = LocalTime.parse(time);
        LocalDate getDate = LocalDate.parse(date);
        return bookingRepository.getBookingByDateAndTimeAndCustomerId(getTime, getDate, customerId);
    }
}
