package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/** Calculator logic */
@Service
public class Calculator {
	@Cacheable("sum")
	public int sum(int a, int b) {
		return a + b;
	}

        @Cacheable("div")
        public int div(int a, int b) {
		 if (b == 0) { 
			throw new IllegalArgumentException("Denominator CANNOT be 0"); 
		}
                else return a / b;
		}
	}
}
