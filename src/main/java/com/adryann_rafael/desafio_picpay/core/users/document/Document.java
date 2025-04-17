package com.adryann_rafael.desafio_picpay.core.users.document;

import com.adryann_rafael.desafio_picpay.core.ddd.ValueObjects;

import java.util.Objects;

public abstract class Document implements ValueObjects {

    private DocumentType type;
    private String value;

    public Document(DocumentType type, String value) {
        this.type = Objects.requireNonNull(type);
        this.value = value;
    }
    abstract void validate();

    public DocumentType getType() {
        return type;
    }

    public String value() {
        return value;
    }
}
