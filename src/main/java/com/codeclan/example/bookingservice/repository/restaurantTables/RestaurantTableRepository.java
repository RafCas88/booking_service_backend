package com.codeclan.example.bookingservice.repository.restaurantTables;
import com.codeclan.example.bookingservice.models.RestaurantTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantTableRepository extends JpaRepository<RestaurantTable, Long> {
}
