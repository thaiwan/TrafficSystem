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

    @RequestMapping("/index")
    public String allRoutes(Map<String, Object> map){

        map.put("route", new Route());
        map.put("allRoutes", routeService.allRoutes());

        return "route";
    }

    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addRoute(@ModelAttribute("route") Route route,
                               BindingResult result) {

        routeService.addRoute(route);

        return "redirect:/index";
    }

    @RequestMapping("/delete/{routeNumber}")
    public String deleteRoute(@PathVariable("routeNumber") Integer routeNumber) {

        routeService.deleteRoute(routeNumber);

        return "redirect:/index";
    }
}
