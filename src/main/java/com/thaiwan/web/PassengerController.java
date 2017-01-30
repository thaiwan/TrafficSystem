package com.thaiwan.web;

import com.thaiwan.domain.Passenger;
import com.thaiwan.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @RequestMapping("/passenger/index")
    public String allPassengers(Map<String, Object> map){

//        map.put("passenger", new Passenger());
        map.put("allPassengers", passengerService.allPassengers());

        return "passenger";
    }

    @RequestMapping("/passenger/")
    public String formForaddPassenger() {
        return "addPassenger";
    }

    @RequestMapping(value = "/passenger/add", method = RequestMethod.POST)
    public String addPassenger(@ModelAttribute("passenger") Passenger passenger,
                         BindingResult result) {

        passengerService.addPassenger(passenger);

        return "redirect:/passenger/index";
    }

    @RequestMapping("/passenger/delete/{passengerId}")
    public String deletePassenger(@PathVariable("passengerId") Integer passengerId) {

        passengerService.deletePassenger(passengerId);

        return "redirect:/passenger/index";
    }
}
