package com.santander.testes.Domain;

import com.santander.testes.Exceptions.AccountException;

public class TransferBetweenAccounts {

    private final Account acFrom;
    private final Account acTo;

    public TransferBetweenAccounts(Account acFrom, Account acTo) {
        this.acFrom = acFrom;
        this.acTo = acTo;
    }

    public void transfer(double amount) throws AccountException {
        if (amount <= 0) throw new AccountException("Value must be more than 0");
        this.acFrom.setBalance(this.acFrom.getBalance() - amount);
        this.acTo.setBalance(this.acFrom.getBalance() + amount);
    }

    public Account getAcFrom() {
        return acFrom;
    }

    public Account getAcTo() {
        return acTo;
    }
}


