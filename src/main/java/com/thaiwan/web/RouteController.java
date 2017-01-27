package com.thaiwan.web;

import com.thaiwan.domain.Route;
import com.thaiwan.service.RouteService;
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

    @RequestMapping("/route/index")
    public String allRoutes(Map<String, Object> map){

        map.put("route", new Route());
        map.put("allRoutes", routeService.allRoutes());

        return "route";
    }

    @RequestMapping("/route/")
    public String home() {
        return "redirect:/route/index";
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
