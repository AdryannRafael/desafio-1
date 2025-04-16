package com.adryann_rafael.desafio_picpay.core.users.document;

public class CPF extends Document{

    private String value;

    public CPF(String value) {
        super(DocumentType.CPF);
        this.value = value;
        this.validate();
    }

    @Override
    void validate() {

    }

    public String value() {
        return value;
    }
}
