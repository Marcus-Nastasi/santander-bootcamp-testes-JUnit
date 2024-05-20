package com.santander.testes.Exceptions;

import java.io.Serial;

public class PeopleException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public PeopleException(String message) {
        super(message);
    }
}


