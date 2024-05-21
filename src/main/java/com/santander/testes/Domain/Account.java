package com.santander.testes.Domain;

public class Account {

    private final long id;
    private final int agency;
    private double balance;

    public Account(long id, int agency, double balance) {
        this.id = id;
        this.agency = agency;
        this.balance = balance;
    }

    public int getAgency() {
        return agency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
