package com.thaiwan.dao;

import com.thaiwan.domain.Station;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StationDAOImpl implements StationDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addStation(Station station) {
        sessionFactory.getCurrentSession().save(station);
    }

    @SuppressWarnings("unchecked")
    public List<Station> allStations() {
        return sessionFactory.getCurrentSession().createQuery("from Station")
                .list();
    }

    public void deleteStation(Integer stationId) {
        Station station = (Station) sessionFactory.getCurrentSession().load(
                Station.class, stationId);
        if (null != station) {
            sessionFactory.getCurrentSession().delete(station);
        }
    }
}
