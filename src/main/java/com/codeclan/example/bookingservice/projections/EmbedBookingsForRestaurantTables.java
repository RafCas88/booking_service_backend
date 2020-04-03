package com.codeclan.example.bookingservice.projections;

import com.codeclan.example.bookingservice.models.Booking;
import com.codeclan.example.bookingservice.models.RestaurantTable;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedBookingsForRestaurantTables", types = RestaurantTable.class)
public interface EmbedBookingsForRestaurantTables {
    public Long getId();
    public List<Booking> getBookings();
}
