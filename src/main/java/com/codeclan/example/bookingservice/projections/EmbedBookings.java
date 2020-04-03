package com.codeclan.example.bookingservice.projections;

import com.codeclan.example.bookingservice.models.Booking;
import com.codeclan.example.bookingservice.models.Customer;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedBookings", types = Customer.class)
public interface EmbedBookings {
public String getFirstName();
public String getLastName();
public String getTelephoneNumber();
public Long getId();
public List<Booking> getBookings();
}
