package com.thaiwan.dao;

import com.thaiwan.domain.Ticket;

import java.util.List;

/**
 * Created by Tanya on 24.01.2017.
 */
public interface TicketDAO {
    public void addTicket(Ticket ticket);
    public List<Ticket> allTickets();
    public void deleteTicket(Integer ticketId);
}
