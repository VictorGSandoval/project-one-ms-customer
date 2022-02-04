package com.example.mscustomer.repository;

import com.example.mscustomer.model.CustomerEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomersRepository extends ReactiveMongoRepository<CustomerEntity,String> {
}
