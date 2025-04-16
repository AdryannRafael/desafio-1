package com.adryann_rafael.desafio_picpay.core.users;

import com.adryann_rafael.desafio_picpay.core.ddd.Identifier;
import com.adryann_rafael.desafio_picpay.core.exception.InvalidEntity;

import java.util.Objects;

public class UserID implements Identifier<String> {
    private final String value;

    public UserID(final String value) {
        if(value == null){
            throw new InvalidEntity("ID value cannot be null");
        }
        if(value.trim().isEmpty()){
            throw new InvalidEntity("ID value cannot be empty");
        }
        this.value = Objects.requireNonNull(value, "ID cannot be null");
    }


    @Override
    public String value() {
        return this.value;
    }

    @Override
    public UserID from(String value) {
        return new UserID(value);
    }

    @Override
    public Identifier genarate() {
        return new UserID(Identifier.genarateUUID().toString());
    }
}
