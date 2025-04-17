package com.adryann_rafael.desafio_picpay.core.ddd;

import java.util.Objects;

public abstract class Entity<T extends Identifier> {
    private T id;

    public Entity(T id) {
        this.id = id;
    }

    public abstract void validate();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity<?> entity = (Entity<?>) o;
        return Objects.equals(id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
