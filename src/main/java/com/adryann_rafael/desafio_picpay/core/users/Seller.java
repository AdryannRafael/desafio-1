package com.adryann_rafael.desafio_picpay.core.users;

import com.adryann_rafael.desafio_picpay.core.users.document.Document;

public class Seller extends User {

    public Seller(UserID id, Document document, String name, Email email, Password password) {
        super(id, document, name, email, password);
    }
}
