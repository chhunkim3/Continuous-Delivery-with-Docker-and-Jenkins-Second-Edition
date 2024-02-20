package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/** Calculator for the Exercise 5.2 */
@Service
public class Calculator {

	@Cacheable("sum")
	public int sum(int a, int b) {
		return a + b;
	}
}
