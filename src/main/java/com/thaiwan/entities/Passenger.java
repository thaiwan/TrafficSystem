package com.thaiwan.entities;

import javax.persistence.*;
import java.sql.Date;

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

    public Passenger() {
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
}
