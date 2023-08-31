package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Float purchasePrice;

    @Column(nullable = false)
    @DateTimeFormat(pattern = "isoDateTime")
    private String purchaseTimestamp;

    @Column(nullable = false)
    private Integer quantity;

    // Add a foreign key from the `Advisor` entity using the `@ManyToOne` annotation.
    @ManyToOne
    @JoinColumn(name = "portfolioId")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Portfolio portfolio;


    protected Security() {

    }

    public Security(String name, String category, Float purchasePrice, String purchaseTimestamp, Integer quantity, Portfolio portfolio) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseTimestamp = purchaseTimestamp;
        this.quantity = quantity;
        this.portfolio = portfolio;     //FK
    }

    public Long getSecurityId() {
        return securityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category= category;
    }

    public Float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Float purchasePrice) {
        this.purchasePrice= purchasePrice;
    }

    public String getPurchaseTimestamp() {
        return purchaseTimestamp;
    }

    public void setPurchaseTimestamp(String purchaseTimestamp) {
        this.purchaseTimestamp= purchaseTimestamp;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity= quantity;
    }

    // getter and setter for the portfolio field
    
    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio= portfolio;
    }

}