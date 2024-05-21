package com.santander.testes.Domain;

import com.santander.testes.Exceptions.AccountException;

public class TransferBetweenAccounts {

    private final double value;
    private final Account acFrom;
    private final Account acTo;

    public TransferBetweenAccounts(double value, Account acFrom, Account acTo) {
        this.value = value;
        this.acFrom = acFrom;
        this.acTo = acTo;
    }

    public void transfer(double ammount) throws AccountException {
        if (ammount <= 0) throw new AccountException("Value must be more than 0");
        this.acFrom.setBalance(this.acFrom.getBalance() - ammount);
        this.acTo.setBalance(this.acFrom.getBalance() + ammount);
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


