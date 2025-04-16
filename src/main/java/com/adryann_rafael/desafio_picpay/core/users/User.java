package com.adryann_rafael.desafio_picpay.core.users;

import com.adryann_rafael.desafio_picpay.core.ddd.AggregateRoot;
import com.adryann_rafael.desafio_picpay.core.users.document.Document;

import java.util.Objects;

public class User extends AggregateRoot<UserID> {

    private Document document;

    public User(UserID id, Document document) {
        super(id);
        this.document = Objects.requireNonNull(document);
    }

    public Document document() {
        return document;
    }
}
