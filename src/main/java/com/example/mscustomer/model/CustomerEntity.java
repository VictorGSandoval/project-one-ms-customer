package com.example.mscustomer.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collation = "Customer")
public class CustomerEntity {

    @Id
    private String idcustomer;
    private String name;
    private String lastname;
    private int dni;
    private String typcustomer;
}
