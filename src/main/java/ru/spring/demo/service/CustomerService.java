package ru.spring.demo.service;

import ru.spring.demo.model.Customer;

import java.util.List;

/**
 * Класс CustomerService
 */
public interface CustomerService {

	Customer getById(Long id);
	void save(Customer customer);
	void delete(Long id);
	List<Customer> setAll();

}