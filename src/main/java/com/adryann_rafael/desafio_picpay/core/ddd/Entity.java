package com.adryann_rafael.desafio_picpay.core.ddd;

public abstract class Entity<T extends Identifier> {
    private T id;

    public Entity(T id) {
        this.id = id;
    }
}
