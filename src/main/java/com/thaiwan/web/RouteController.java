package com.thaiwan.web;

import com.thaiwan.domain.Bus;
import com.thaiwan.domain.Route;
import com.thaiwan.domain.Station;
import com.thaiwan.service.BusService;
import com.thaiwan.service.RouteService;
import com.thaiwan.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class RouteController {

    @Autowired
    private RouteService routeService;
    @Autowired
    private BusService busService;
    @Autowired
    private StationService stationService;

    @RequestMapping("/route/index")
    public String allRoutes(Map<String, Object> map){

//        map.put("route", new Route());
        map.put("allRoutes", routeService.allRoutes());

        return "route";
    }

    @RequestMapping(value = "/route/", method = RequestMethod.GET)
    public String formForAddRoute(Map<String, Object> map) {
//        map.put("bus", new Bus());
        map.put("allBuses", busService.allBuses());
//        map.put("departureStation", new Station());
        map.put("allStations", stationService.allStations());
//        map.put("arrivalStation", new Station());
        return "addRoute";
    }

    @RequestMapping(value = "/route/add", method = RequestMethod.POST)
    public String addRoute(@ModelAttribute("route") Route route,
                               BindingResult result) {

        routeService.addRoute(route);

        return "redirect:/route/index";
    }

    @RequestMapping("/route/delete/{routeNumber}")
    public String deleteRoute(@PathVariable("routeNumber") Integer routeNumber) {

        routeService.deleteRoute(routeNumber);

        return "redirect:/route/index";
    }
}
