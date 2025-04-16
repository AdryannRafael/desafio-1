package com.adryann_rafael.desafio_picpay.core.exception;

public class InvalidEntity extends RuntimeException {
    public InvalidEntity(String message) {
        super(message);
    }

    public InvalidEntity(String message, Throwable cause) {
        super(message, cause);
    }
}
