package com.thaiwan.dao;

import com.thaiwan.domain.Route;

import java.sql.Time;
import java.util.List;

/**
 * Created by Tanya on 24.01.2017.
 */
public interface RouteDAO {
    public void addRoute(Route route);
    public List<Route> allRoutes();
    public void deleteRoute(Integer routeNumber);
}
