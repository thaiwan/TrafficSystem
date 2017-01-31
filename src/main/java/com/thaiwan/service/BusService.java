package com.thaiwan.service;

import com.thaiwan.domain.Bus;

import java.util.List;

public interface BusService {

    public void addBus(Bus bus);

    public List<Bus> allBuses();

    public void deleteBus(Integer busNumber);

    public Bus findBus(Integer busNumber);

}
