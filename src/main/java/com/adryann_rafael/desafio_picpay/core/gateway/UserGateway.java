package com.adryann_rafael.desafio_picpay.core.gateway;

import com.adryann_rafael.desafio_picpay.core.users.Seller;
import com.adryann_rafael.desafio_picpay.core.users.UserDefault;
import com.adryann_rafael.desafio_picpay.core.users.document.Document;

public interface UserGateway {
    boolean existsUserByDocument(Document document);

    Seller createSeller(Seller seller);

    UserDefault createUserDefault(UserDefault userDefault);
}
