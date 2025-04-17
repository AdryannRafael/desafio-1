package com.adryann_rafael.desafio_picpay.core.users;

import com.adryann_rafael.desafio_picpay.core.ddd.ValueObjects;

public class Email implements ValueObjects {
    private final String value;

    public Email(String value) {
        this.value = value;
        this.validate();
    }

    public void validate(){

    }
}
