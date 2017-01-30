package com.thaiwan.domain;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "stations")
public class Station {
    @Id
    @Column(name="stationId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int stationId;
    @Column(name="stationName")
    private String stationName;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "departureStation")
    @Cascade(org.hibernate.annotations.CascadeType.REMOVE)
    private Set<Route> departureRoutes;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "arrivalStation")
    @Cascade(org.hibernate.annotations.CascadeType.REMOVE)
    private Set<Route> arrivalRoutes;

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

    public Set<Route> getDepartureRoutes() {
        return departureRoutes;
    }

    public void setDepartureRoutes(Set<Route> departureRoutes) {
        this.departureRoutes = departureRoutes;
    }

    public Set<Route> getArrivalRoutes() {
        return arrivalRoutes;
    }

    public void setArrivalRoutes(Set<Route> arrivalRoutes) {
        this.arrivalRoutes = arrivalRoutes;
    }
}
