package com.adryann_rafael.desafio_picpay.core.ddd;

import java.util.UUID;

public interface Identifier<T> extends ValueObjects {
     T value();
     Identifier from(T value);
     Identifier genarate();

     static UUID genarateUUID(){
          return UUID.randomUUID();
     }
}
