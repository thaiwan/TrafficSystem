package com.thaiwan.domain;

import javax.persistence.*;

@Entity
@Table(name = "stations")
public class Station {
    @Id
    @Column(name="stationId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int stationId;
    @Column(name="stationName")
    private String stationName;


    public Station() {
    }


    public int getStationId() {
        return stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
}
