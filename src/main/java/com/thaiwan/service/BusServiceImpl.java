package com.thaiwan.service;

import com.thaiwan.dao.BusDAO;
import com.thaiwan.domain.Bus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BusServiceImpl implements BusService {

    @Autowired
    private BusDAO busDAO;

    @Transactional
    public void addBus(Bus bus) {
        busDAO.addBus(bus);
    }

    @Transactional
    public List<Bus> allBuses() {
        return busDAO.allBuses();
    }

    @Transactional
    public void deleteBus(Integer busNumber) {
        busDAO.deleteBus(busNumber);
    }

    @Transactional
    public Bus findBus(Integer busNumber) {
        return busDAO.findBus(busNumber);
    }
}
