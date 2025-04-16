package com.adryann_rafael.desafio_picpay.core.users.document;

public class CNPJ extends Document {
    private String value;

    public CNPJ(String value) {
        super(DocumentType.CNPJ);
        this.value = value;
    }

    @Override
    void validate() {

    }

    public String value() {
        return value;
    }
}
