package com.thaiwan.dao;

import com.thaiwan.domain.Bus;

import java.util.List;

/**
 * Created by Tanya on 24.01.2017.
 */
public interface BusDAO {

    public void addBus(Bus bus);
    public List<Bus> allBuses();
    public void deleteBus(Integer busNumber);

}
