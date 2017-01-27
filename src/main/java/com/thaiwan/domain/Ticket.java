package com.thaiwan.domain;

import javax.persistence.*;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @Column(name="ticketId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ticketId;
    @Column(name="passengerId")
    private int passengerId;
    @Column(name="routeNumber")
    private int routeNumber;


    public Ticket() {
    }

    public int getTicketId() {
        return ticketId;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }
}
