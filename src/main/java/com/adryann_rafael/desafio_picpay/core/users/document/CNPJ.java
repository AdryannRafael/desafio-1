package com.adryann_rafael.desafio_picpay.core.users.document;

public class CNPJ extends Document {
    private String value;

    public CNPJ(String value) {
        super(DocumentType.CNPJ, value);
        this.value = value;
    }

    @Override
    void validate() {

    }
}
