package com.thaiwan.service;

import com.thaiwan.dao.StationDAO;
import com.thaiwan.domain.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StationServiceImpl implements StationService {

    @Autowired
    private StationDAO stationDAO;

    @Transactional
    public void addStation(Station station) {
        stationDAO.addStation(station);
    }

    @Transactional
    public List<Station> allStations() {
        return stationDAO.allStations();
    }

    @Transactional
    public void deleteStation(Integer stationId) {
        stationDAO.deleteStation(stationId);
    }
}
