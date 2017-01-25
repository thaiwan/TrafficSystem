package com.thaiwan.service;


import com.thaiwan.domain.Station;

import java.util.List;

public interface StationService {
    public void addStation(Station station);
    public List<Station> allStations();
    public void deleteStation(Integer stationId);
}
