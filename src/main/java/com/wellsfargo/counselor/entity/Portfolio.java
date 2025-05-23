package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Portfolio {
    @Id
    @GeneratedValue
    private int portfolioId;

    @Column (nullable = false)
    private String creationDate;

    private Client client;

    public int getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(int portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    protected Portfolio() {}
    public Portfolio(int portfolioId, String creationDate, Client client) {
        this.portfolioId = portfolioId;
        this.creationDate = creationDate;
        this.client = client;
    }
}
