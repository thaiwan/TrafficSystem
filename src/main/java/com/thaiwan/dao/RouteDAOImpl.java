package com.thaiwan.dao;

import com.thaiwan.domain.Route;

import java.sql.Time;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RouteDAOImpl implements RouteDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addRoute(Route route) {
        sessionFactory.getCurrentSession().save(route);
    }

    @SuppressWarnings("unchecked")
    public List<Route> allRoutes() {
        return sessionFactory.getCurrentSession().createQuery("from Route")
                .list();
    }

    public void deleteRoute(Integer routeNumber) {
        Route route = (Route) sessionFactory.getCurrentSession().load(
                Route.class, routeNumber);
        if (null != route) {
            sessionFactory.getCurrentSession().delete(route);
        }
    }
}
