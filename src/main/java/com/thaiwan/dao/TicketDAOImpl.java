package com.thaiwan.dao;

import com.thaiwan.domain.Ticket;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDAOImpl implements TicketDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addTicket(Ticket ticket) {
        sessionFactory.getCurrentSession().save(ticket);
    }

    @SuppressWarnings("unchecked")
    public List<Ticket> allTickets() {
        return sessionFactory.getCurrentSession().createQuery("from Ticket")
                .list();
    }

    public void deleteTicket(Integer ticketId) {
        Ticket ticket = (Ticket) sessionFactory.getCurrentSession().load(
                Ticket.class, ticketId);
        if (null != ticket) {
            sessionFactory.getCurrentSession().delete(ticket);
        }
    }
}
