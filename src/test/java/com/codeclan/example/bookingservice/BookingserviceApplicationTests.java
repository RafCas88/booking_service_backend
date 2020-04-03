package com.codeclan.example.bookingservice;

import com.codeclan.example.bookingservice.models.Booking;
import com.codeclan.example.bookingservice.models.Customer;
import com.codeclan.example.bookingservice.models.RestaurantTable;
import com.codeclan.example.bookingservice.repository.bookings.BookingRepository;
import com.codeclan.example.bookingservice.repository.customers.CustomerRepository;
import com.codeclan.example.bookingservice.repository.restaurantTables.RestaurantTableRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

	@Test
	public void canFindAllBookings() {
		List<Booking> foundBookings = bookingRepository.findAll();
		assertEquals(3, foundBookings.size());
	}

	@Test
	public void canFindAllCustomers() {
		List<Customer> foundCustomers = customerRepository.findAll();
		assertEquals(3, foundCustomers.size());
	}

	@Test
	public void canFindAllRestaurantTables() {
		List<RestaurantTable> foundTables = restaurantTableRepository.findAll();
		assertEquals(3, foundTables.size());
	}
}
