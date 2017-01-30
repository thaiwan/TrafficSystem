package com.thaiwan.domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.annotations.Cascade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

@Entity
@Table(name = "passengers")
public class Passenger {
    @Id
    @Column(name="passengerId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int passengerId;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "dateOfBirth")
    private Date dateOfBirth;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "passenger")
    @Cascade(org.hibernate.annotations.CascadeType.REMOVE)
    private Set<Ticket> tickets;

    public Passenger() {
    }

    public Passenger(String name, String surname, Date dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public int getPassengerId() {
        return passengerId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Set<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }
}
