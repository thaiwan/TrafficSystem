package com.thaiwan.web;

import com.thaiwan.domain.Bus;
import com.thaiwan.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class BusController {

    @Autowired
    private BusService busService;

    @RequestMapping("/")
    public String defaultAddress() {
        return "about";
    }

    @RequestMapping("/bus/index")
    public String allBuses(Map<String, Object> map){

//        map.put("bus", new Bus());
        map.put("allBuses", busService.allBuses());

        return "bus";
    }

    @RequestMapping("/bus/")
    public String formForAddBus() {
        return "addBus";
    }

    @RequestMapping(value = "/bus/add", method = RequestMethod.POST)
    public String addBus(@ModelAttribute("bus") Bus bus,
                             BindingResult result) {

        busService.addBus(bus);

        return "redirect:/bus/index";
    }

    @RequestMapping("/bus/delete/{busNumber}")
    public String deleteBus(@PathVariable("busNumber") Integer busNumber) {

        busService.deleteBus(busNumber);

        return "redirect:/bus/index";
    }

}
