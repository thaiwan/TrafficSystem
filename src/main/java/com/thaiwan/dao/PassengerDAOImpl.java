package com.thaiwan.dao;

import com.thaiwan.domain.Passenger;

import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PassengerDAOImpl implements PassengerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addPassenger(Passenger passenger) {
        sessionFactory.getCurrentSession().save(passenger);
    }

    @SuppressWarnings("unchecked")
    public List<Passenger> allPassengers() {
        return sessionFactory.getCurrentSession().createQuery("from Passenger")
                .list();
    }

    public void deletePassenger(Integer passengerId) {
        Passenger passenger = (Passenger) sessionFactory.getCurrentSession().load(
                Passenger.class, passengerId);
        if (null != passenger) {
            sessionFactory.getCurrentSession().delete(passenger);
        }
    }
}
