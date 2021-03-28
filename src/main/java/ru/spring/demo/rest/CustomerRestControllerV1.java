/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.spring.demo.rest;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import ru.spring.demo.model.Customer;
import ru.spring.demo.service.CustomerService;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerRestControllerV1 {
	@Autowired
	private CustomerService customerService;

	@RequestMapping(value ="{id}", method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Customer> saveCustomer(@RequestBody @Valid Customer customer) {
		HttpHeaders headers=new HttpHeaders();
		if(customer == null) {
			return new ResponseEntity<>(customer, headers, HttpStatus.CREATED);
		}
	}
		public ResponseEntity<Customer> updateCustomer(@RequestBody @Valid Customer customer,
		UriComponentsBuilder builder) {

		}

}