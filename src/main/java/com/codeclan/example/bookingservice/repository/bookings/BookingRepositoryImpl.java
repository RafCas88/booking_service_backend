package com.codeclan.example.bookingservice.repository.bookings;

import com.codeclan.example.bookingservice.models.Booking;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class BookingRepositoryImpl implements BookingRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Booking> getBookingByDateAndTimeAndCustomerId(LocalTime time, LocalDate date, Long customerId) {
    List<Booking> result = null;

        Session session = entityManager.unwrap(Session.class);
        try{
            Criteria cr = session.createCriteria(Booking.class);
            cr.add(Restrictions.eq("time", time));
            cr.add(Restrictions.eq("date", date));
            cr.add(Restrictions.eq("customer.id", customerId));
            result = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
