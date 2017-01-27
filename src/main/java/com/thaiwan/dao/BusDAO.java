package com.thaiwan.dao;

import com.thaiwan.domain.Bus;

import java.util.List;


public interface BusDAO {

    public void addBus(Bus bus);
    public List<Bus> allBuses();
    public void deleteBus(Integer busNumber);

}
