/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.spring.demo.model.Customer;

/**
 * Repository interface for {@link Customer} class.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}