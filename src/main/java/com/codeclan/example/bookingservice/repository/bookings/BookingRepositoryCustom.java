package com.codeclan.example.bookingservice.repository.bookings;

import com.codeclan.example.bookingservice.models.Booking;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface BookingRepositoryCustom {
    List<Booking> getBookingByDateAndTimeAndCustomerId(LocalTime time, LocalDate date, Long customerId);

}
