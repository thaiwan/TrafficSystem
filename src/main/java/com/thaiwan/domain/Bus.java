package com.thaiwan.domain;

import com.thaiwan.dao.BusDAO;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "buses")
public class Bus {

    @Id
    @Column(name="busNumber")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int busNumber;
    @Column(name = "numberOfSeats")
    private int numberOfSeats;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "bus")
    @Cascade(org.hibernate.annotations.CascadeType.REMOVE)
    private Set<Route> routes;

    public Bus() {}

    public Bus(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Set<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(Set<Route> routes) {
        this.routes = routes;
    }
}
