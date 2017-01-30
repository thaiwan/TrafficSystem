package com.thaiwan.web;

import com.thaiwan.domain.Ticket;
import com.thaiwan.service.PassengerService;
import com.thaiwan.service.RouteService;
import com.thaiwan.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class TicketController {

    @Autowired
    private TicketService ticketService;
    @Autowired
    private RouteService routeService;
    @Autowired
    private PassengerService passengerService;

    @RequestMapping("/ticket/index")
    public String allTickets(Map<String, Object> map){

//        map.put("ticket", new Ticket());
        map.put("allTickets", ticketService.allTickets());

        return "ticket";
    }

    @RequestMapping(value = "/ticket/", method = RequestMethod.GET)
    public String formForAddTicket(Map<String, Object> map) {
        map.put("allPassengers", passengerService.allPassengers());
        map.put("allRoutes", routeService.allRoutes());
        return "addTicket";
    }

    @RequestMapping(value = "/ticket/add", method = RequestMethod.POST)
    public String addTicket(@ModelAttribute("ticket") Ticket ticket,
                           BindingResult result) {

        ticketService.addTicket(ticket);

        return "redirect:/ticket/index";
    }

    @RequestMapping("/ticket/delete/{ticketId}")
    public String deleteTicket(@PathVariable("ticketId") Integer ticketId) {

        ticketService.deleteTicket(ticketId);

        return "redirect:/ticket/index";
    }
}
