package com.thaiwan.domain;

import com.thaiwan.dao.BusDAO;

import javax.persistence.*;
import java.util.List;



@Entity
@Table(name = "buses")
public class Bus {

    @Id
    @Column(name="busNumber")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int busNumber;
    @Column(name = "numberOfSeats")
    private int numberOfSeats;


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

}
