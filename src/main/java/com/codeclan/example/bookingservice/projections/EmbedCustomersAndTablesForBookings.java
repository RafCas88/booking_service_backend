package com.codeclan.example.bookingservice.projections;

import com.codeclan.example.bookingservice.models.Booking;
import com.codeclan.example.bookingservice.models.Customer;
import com.codeclan.example.bookingservice.models.RestaurantTable;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Projection(name = "embedCustomersAndTablesForBookings", types = Booking.class)
public interface EmbedCustomersAndTablesForBookings {
    public LocalTime getBookingTime();
    public LocalDate getBookingDate();
    public Long getId();
    public List<RestaurantTable> getRestaurantTables();
    public Customer getCustomer();
}
