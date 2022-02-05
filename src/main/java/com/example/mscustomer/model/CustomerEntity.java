package com.example.mscustomer.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "Customers")
public class CustomerEntity {

    @Id
    private String id;
    private String name;
    private String lastname;
    private int dni;
    private String typcustomer;
}
