/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.spring.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.spring.demo.model.Customer;
import ru.spring.demo.repository.CustomerRepository;

import java.util.List;

@Slf4j
@Service
public class CustomerServiseImpl implements CustomerService {

	//	@Autowired
//	CustomerRepository customerRepository;
	@Autowired
	CustomerRepository customerRepository;


	@Override
	public Customer getById(Long id) {
		return customerRepository.findOne(id);
	}

	@Override
	public void save(Customer customer) {
customerRepository.save(customer);
	}

	@Override
	public void delete(Long id) {
customerRepository.delete(id);
	}

	@Override
	public List<Customer> setAll() {
		return customerRepository.findAll();
	}
}