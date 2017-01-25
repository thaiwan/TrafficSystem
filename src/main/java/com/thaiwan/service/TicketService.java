package com.thaiwan.service;


import com.thaiwan.domain.Ticket;

import java.util.List;

public interface TicketService {
    public void addTicket(Ticket ticket);
    public List<Ticket> allTickets();
    public void deleteTicket(Integer ticketId);
}
