package com.codeclan.example.bookingservice.repository.bookings;

import com.codeclan.example.bookingservice.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
    List<Booking> getBookingByDateAndTimeAndCustomerId(LocalTime time, LocalDate date, Long customerId);
}
