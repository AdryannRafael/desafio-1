package com.adryann_rafael.desafio_picpay.core.users.document;

import com.adryann_rafael.desafio_picpay.core.ddd.ValueObjects;

import java.util.Objects;

public abstract class Document implements ValueObjects {

    private DocumentType type;

    public Document(DocumentType type) {
        this.type = Objects.requireNonNull(type);
    }
    abstract void validate();

    public DocumentType getType() {
        return type;
    }
}
