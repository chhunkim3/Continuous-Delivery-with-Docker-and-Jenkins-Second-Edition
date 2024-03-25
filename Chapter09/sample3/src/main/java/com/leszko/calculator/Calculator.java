package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.io.*

/** Calculator logic */
@Service
public class Calculator {
	@Cacheable("sum")
	public int sum(int a, int b) {
		return a + b;
	}

        @Cacheable("div")
        public int div(int a, int b) {
		If (b = 0){
			System.out.println("Error: Denominator CANNOT be 0");
		}
		Else{
                	return a / b;
		}
        }
}
