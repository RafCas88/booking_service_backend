package com.codeclan.example.bookingservice;

import com.codeclan.example.bookingservice.repository.bookings.BookingRepository;
import com.codeclan.example.bookingservice.repository.customers.CustomerRepository;
import com.codeclan.example.bookingservice.repository.restaurantTables.RestaurantTableRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingserviceApplicationTests {

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	RestaurantTableRepository restaurantTableRepository;

	@Test
	void contextLoads() {
	}
}
