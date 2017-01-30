package com.thaiwan.domain;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.sql.Time;
import java.util.Set;

@Entity
@Table(name = "schedule")
public class Route {
    @Id
    @Column(name="routeNumber")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int routeNumber;
//    @Column(name = "busNumber")
//    private int busNumber;
    @Column(name = "departureTime")
    private Time departureTime;

    @Column(name = "arrivalTime")
    private Time arrivalTime;

    @ManyToOne
    @JoinColumn(name = "busNumber")
    private Bus bus;

    @ManyToOne
    @JoinColumn(name = "departureStationId")
    private Station departureStation;

    @ManyToOne
    @JoinColumn(name = "arrivalStationId")
    private Station arrivalStation;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "route")
    @Cascade(org.hibernate.annotations.CascadeType.REMOVE)
    private Set<Ticket> tickets;

    public Route() {
    }

    public int getRouteNumber() {
        return routeNumber;
    }

//    public int getBusNumber() {
//        return busNumber;
//    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public Time getArrivalTime() {
        return arrivalTime;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Station getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(Station departureStation) {
        this.departureStation = departureStation;
    }

    public Station getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(Station arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public Set<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }
}
