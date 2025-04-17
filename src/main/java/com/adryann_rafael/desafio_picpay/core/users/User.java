package com.adryann_rafael.desafio_picpay.core.users;

import com.adryann_rafael.desafio_picpay.core.ddd.AggregateRoot;
import com.adryann_rafael.desafio_picpay.core.users.document.Document;

import static java.util.Objects.requireNonNull;

public abstract class User extends AggregateRoot<UserID> {

    private Document document;
    private String name;
    private Email email;
    private Password password;

    public User(UserID id, Document document, String name, Email email, Password password) {
        super(id);
        this.document = requireNonNull(document);
        this.name = name;
        this.email = requireNonNull(email);
        this.password = password;
        this.validate();
    }

    public Document document() {
        return document;
    }

    public String name() {
        return name;
    }

    public Email email() {
        return email;
    }

    public Password password() {
        return password;
    }

    @Override
    public void validate() {

    }

}
