package com.example.mscustomer.repository;

import com.example.mscustomer.model.CustomerEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ICustomersRepository extends ReactiveMongoRepository<CustomerEntity,String> {

    Flux<CustomerEntity> findByDni(int dni);

}
