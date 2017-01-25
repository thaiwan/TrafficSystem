package com.thaiwan.service;

import com.thaiwan.dao.RouteDAO;
import com.thaiwan.domain.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RouteServiceImpl implements RouteService {

    @Autowired
    private RouteDAO routeDAO;


    @Transactional
    public void addRoute(Route route) {
        routeDAO.addRoute(route);
    }

    @Transactional
    public List<Route> allRoutes() {
        return routeDAO.allRoutes();
    }

    @Transactional
    public void deleteRoute(Integer routeNumber) {
        routeDAO.deleteRoute(routeNumber);
    }
}
