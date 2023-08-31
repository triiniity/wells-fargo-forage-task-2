package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate creationDate;

    // Add a foreign key from the `Client` entity using the `@ManyToOne` annotation.
    @ManyToOne
    @JoinColumn(name = "clientId")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Client client;


    protected Portfolio() {

    }

    public Portfolio(LocalDate creationDate, Client client) {
        this.creationDate = creationDate;
        this.client = client;     //FK
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate= creationDate;
    }

    // getter and setter for the client field
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}