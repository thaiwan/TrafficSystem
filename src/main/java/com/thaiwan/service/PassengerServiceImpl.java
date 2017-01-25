package com.thaiwan.service;

import com.thaiwan.dao.PassengerDAO;
import com.thaiwan.domain.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PassengerServiceImpl implements PassengerService {

    @Autowired
    private PassengerDAO passengerDAO;

    @Transactional
    public void addPassenger(Passenger passenger) {
        passengerDAO.addPassenger(passenger);
    }

    @Transactional
    public List<Passenger> allPassengers() {
        return passengerDAO.allPassengers();
    }

    @Transactional
    public void deletePassenger(Integer passengerId) {
        passengerDAO.deletePassenger(passengerId);
    }
}
