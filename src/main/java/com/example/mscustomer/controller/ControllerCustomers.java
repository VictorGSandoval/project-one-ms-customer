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
    public Flux<CustomerEntity> getCustom() {
        return service.findAll();
    }

    @GetMapping("/getCustomersByDNI/{dni}")
    public Flux<CustomerEntity> getCustomersByDni(@PathVariable("dni") int dni) {

        return service.findCustomerByDni(dni);
    }

    @PostMapping("/postCustomers")
    public Mono<CustomerEntity> postCustomers(@RequestBody CustomerEntity customer) {

        return service.save(customer);
    }

    @PostMapping("/updateCustomer")
    public Mono<CustomerEntity> updateCustomers(@RequestBody CustomerEntity customer) {

        return service.update(customer);
    }

    @PostMapping("/delete/{id}")
    void delete(@PathVariable("id") String id) {
        service.delete(id);
    }
}
