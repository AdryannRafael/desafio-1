package com.adryann_rafael.desafio_picpay.core.users;

import com.adryann_rafael.desafio_picpay.core.users.document.CPF;

public class UserDefault extends User {
    public UserDefault(UserID id, CPF document, String name, Email email, Password password) {
        super(id, document, name, email, password);
    }
}
