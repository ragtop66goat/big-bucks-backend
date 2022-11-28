package com.ragtop66goat.bigBucks.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Long id;

    private String email;

    private String startDate;

    private String endDate;

    public Client() {

    }

    public Client(Long id, String email, String startDate, String endDate) {
        this.id = id;
        this.email = email;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Client(Client client) {
        this.id = client.id;
        this.email = client.email;
        this.startDate = client.startDate;
        this.endDate = client.endDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
