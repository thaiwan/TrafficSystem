package com.thaiwan.dao;

import com.thaiwan.domain.Passenger;

import java.util.Date;
import java.util.List;

/**
 * Created by Tanya on 24.01.2017.
 */
public interface PassengerDAO {
    public void addPassenger(Passenger passenger);
    public List<Passenger> allPassengers();
    public void deletePassenger(Integer passengerId);
}
