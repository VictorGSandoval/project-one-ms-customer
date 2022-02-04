package com.example.mscustomer.service;

import com.example.mscustomer.model.CustomerEntity;
import com.example.mscustomer.repository.ICustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ServiceCustomersImpl implements  IServiceCustomers{
    @Autowired
    ICustomersRepository repository;

    @Override
    public Flux<CustomerEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<CustomerEntity> save(CustomerEntity customer) {
        return repository.save(customer);
    }
}
