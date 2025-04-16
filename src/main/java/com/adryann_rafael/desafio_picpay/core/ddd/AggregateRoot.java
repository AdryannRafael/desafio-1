package com.adryann_rafael.desafio_picpay.core.ddd;

public abstract class AggregateRoot<T extends Identifier> extends Entity<T> {

    public AggregateRoot(T id) {
        super(id);
    }
}
