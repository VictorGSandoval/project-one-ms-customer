package com.example.mscustomer.controller;

import com.example.mscustomer.model.CustomerEntity;
import com.example.mscustomer.service.IServiceCustomers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class ControllerCustomers {
    @Autowired
    IServiceCustomers service;

    @GetMapping("/getCustomers")
    public Flux<CustomerEntity> getCustomer() {
        return service.findAll();
    }

    @PostMapping("/postCustomers")
    public Mono<CustomerEntity> postCustomers(@RequestBody CustomerEntity customer) {
        return service.save(customer);
    }
}
