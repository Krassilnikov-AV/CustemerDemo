/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package ru.spring.demo.model;

import lombok.*;

import javax.persistence.*;

/**
 * Base class with property ID.
 */
@MappedSuperclass
@Getter
@Setter
@ToString

public class BaseEntitty {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
}