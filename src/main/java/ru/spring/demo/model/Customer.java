/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.spring.demo.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Simple JavaBean demo in object that represents Customer.
 *
 */
@Entity
@Table(name="customers")
@Getter
@Setter
@ToString

public class Customer extends BaseEntitty {
	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	@Column(name="address")
	private String address;

	@Column(name="budget")
	private BigDecimal budget;

}