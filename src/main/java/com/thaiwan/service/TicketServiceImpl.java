package com.thaiwan.service;

import com.thaiwan.dao.TicketDAO;
import com.thaiwan.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketDAO ticketDAO;

    @Transactional
    public void addTicket(Ticket ticket) {
        ticketDAO.addTicket(ticket);
    }

    @Transactional
    public List<Ticket> allTickets() {
        return ticketDAO.allTickets();
    }

    @Transactional
    public void deleteTicket(Integer ticketId) {
        ticketDAO.deleteTicket(ticketId);
    }
}
