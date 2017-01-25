package com.thaiwan.service;


import com.thaiwan.domain.Passenger;

import java.util.List;

public interface PassengerService {

    public void addPassenger(Passenger passenger);
    public List<Passenger> allPassengers();
    public void deletePassenger(Integer passengerId);
}
