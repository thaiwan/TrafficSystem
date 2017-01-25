package com.thaiwan.dao;

import com.thaiwan.domain.Station;

import java.util.List;

/**
 * Created by Tanya on 24.01.2017.
 */
public interface StationDAO {
    public void addStation(Station station);
    public List<Station> allStations();
    public void deleteStation(Integer stationId);
}
