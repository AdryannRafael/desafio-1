package com.adryann_rafael.desafio_picpay.core.users.document;

public class CPF extends Document {

    public CPF(String value) {
        super(DocumentType.CPF, value);
        this.validate();
    }

    @Override
    void validate() {

    }

}
