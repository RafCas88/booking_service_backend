package com.codeclan.example.bookingservice.components;
import com.codeclan.example.bookingservice.models.Booking;
import com.codeclan.example.bookingservice.models.Customer;
import com.codeclan.example.bookingservice.models.RestaurantTable;
import com.codeclan.example.bookingservice.repository.bookings.BookingRepository;
import com.codeclan.example.bookingservice.repository.customers.CustomerRepository;
import com.codeclan.example.bookingservice.repository.restaurantTables.RestaurantTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
    public class DataLoader implements ApplicationRunner {

        @Autowired
        BookingRepository bookingRepository;

        @Autowired
        CustomerRepository customerRepository;

        @Autowired
        RestaurantTableRepository restaurantTableRepository;

        public DataLoader() {

        }

        public void run(ApplicationArguments args) {

            Customer customer1 = new Customer("Raffaele", "Castaldo", "07796264481");
            customerRepository.save(customer1);
            Customer customer2 = new Customer("Silvia", "Antonacci", "07795784449");
            customerRepository.save(customer2);
            Customer customer3 = new Customer("Antonia", "De Luca", "0775677890");
            customerRepository.save(customer3);

            Booking booking1 = new Booking(LocalTime.parse("18:00"), LocalDate.parse("31-10-2020"));
            bookingRepository.save(booking1);
            Booking booking2 = new Booking(LocalTime.parse("19:00"), LocalDate.parse("16-05-2020"));
            bookingRepository.save(booking2);
            Booking booking3 = new Booking(LocalTime.parse("20:00"), LocalDate.parse("10-12-2020"));
            bookingRepository.save(booking3);

            RestaurantTable restaurantTable1 = new RestaurantTable(1, 4);
            restaurantTableRepository.save(restaurantTable1);
            RestaurantTable restaurantTable2 = new RestaurantTable(2, 5);
            restaurantTableRepository.save(restaurantTable2);
            RestaurantTable restaurantTable3 = new RestaurantTable(3, 6);
            restaurantTableRepository.save(restaurantTable3);
        }
}


