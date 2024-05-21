package com.santander.testes;

import com.santander.testes.Domain.Account;

public class TransferBetweenAccounts {

    private final double value;
    private final Account acFrom;
    private final Account acTo;

    public TransferBetweenAccounts(double value, Account acFrom, Account acTo) {
        this.value = value;
        this.acFrom = acFrom;
        this.acTo = acTo;
    }

    public void transfer() {

    }

    public double getValue() {
        return value;
    }

    public Account getAcFrom() {
        return acFrom;
    }

    public Account getAcTo() {
        return acTo;
    }
}


