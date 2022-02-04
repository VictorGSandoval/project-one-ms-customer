package com.example.mscustomer.service;

import com.example.mscustomer.model.CustomerEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IServiceCustomers {

    Flux<CustomerEntity> findAll();

    Mono<CustomerEntity> save(CustomerEntity customer);
}