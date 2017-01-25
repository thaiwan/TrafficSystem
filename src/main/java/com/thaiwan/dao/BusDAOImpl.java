package com.thaiwan.dao;

import com.thaiwan.domain.Bus;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BusDAOImpl implements BusDAO{

    @Autowired
    private SessionFactory sessionFactory;

    public void addBus(Bus bus) {
        sessionFactory.getCurrentSession().save(bus);
    }



    @SuppressWarnings("unchecked")
    public List<Bus> allBuses() {
        return sessionFactory.getCurrentSession().createQuery("from Bus")
                .list();
    }

    public void deleteBus(Integer busNumber) {
        Bus bus = (Bus) sessionFactory.getCurrentSession().load(
                Bus.class, busNumber);
        if (null != bus) {
            sessionFactory.getCurrentSession().delete(bus);
        }
    }
}
