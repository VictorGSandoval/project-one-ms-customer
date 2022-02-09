package com.microservice.customer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Customer {

	@Id
	private String id;
	private String name;
	private String lastname;
	private int dni;
	private String typcustomer;
	

}
