package com.codeclan.example.bookingservice.repository.bookings;

import com.codeclan.example.bookingservice.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
