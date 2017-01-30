package com.thaiwan.domain;

import javax.persistence.*;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @Column(name="ticketId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ticketId;


    @ManyToOne
    @JoinColumn(name = "passengerId")
    private Passenger passenger;

    @ManyToOne
    @JoinColumn(name = "routeNumber")
    private Route route;

    public Ticket() {
    }

    public int getTicketId() {
        return ticketId;
    }

//    public int getPassengerId() {
//        return passengerId;
//    }

//    public int getRouteNumber() {
//        return routeNumber;
//    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

//    public void setPassengerId(int passengerId) {
//        this.passengerId = passengerId;
//    }

//    public void setRouteNumber(int routeNumber) {
//        this.routeNumber = routeNumber;
//    }


    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
