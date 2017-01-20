package com.thaiwan.entities;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "schedule")
public class Schedule {
    @Id
    @Column(name="routeNumber")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int routeNumber;
    @Column(name = "busNumber")
    private int busNumber;
    @Column(name = "departureTime")
    private Time departureTime;
    @Column(name = "departureStationId")
    private int departureStationId;
    @Column(name = "arrivalTime")
    private Time arrivalTime;
    @Column(name = "arrivalStationId")
    private int arrivalStationId;

    public Schedule() {
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public int getDepartureStationId() {
        return departureStationId;
    }

    public Time getArrivalTime() {
        return arrivalTime;
    }

    public int getArrivalStationId() {
        return arrivalStationId;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public void setDepartureStationId(int departureStationId) {
        this.departureStationId = departureStationId;
    }

    public void setArrivalTime(Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setArrivalStationId(int arrivalStationId) {
        this.arrivalStationId = arrivalStationId;
    }
}
