package com.thaiwan.service;


import com.thaiwan.domain.Route;

import java.util.List;

public interface RouteService {
    public void addRoute(Route route);
    public List<Route> allRoutes();
    public void deleteRoute(Integer routeNumber);
}
