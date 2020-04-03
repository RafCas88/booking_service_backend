package com.codeclan.example.bookingservice.configurations;

import com.codeclan.example.bookingservice.models.Booking;
import com.codeclan.example.bookingservice.models.Customer;
import com.codeclan.example.bookingservice.models.RestaurantTable;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

public class SpringDataRestGlobalConfig extends RepositoryRestConfigurerAdapter {

    private static final String CORS_BASE_PATTERN = "/**";
    private static final String ALLOWED_ORIGINS = "*";
    private static final String ALLOWED_HEADERS = "*";
    private static final String ALLOWED_METHODS = "*";

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.getCorsRegistry()
                .addMapping(CORS_BASE_PATTERN)
                .allowedOrigins(ALLOWED_ORIGINS)
                .allowedHeaders(ALLOWED_HEADERS)
                .allowedMethods(ALLOWED_METHODS);
        config.exposeIdsFor(Booking.class, Customer.class, RestaurantTable.class);
    }
}
