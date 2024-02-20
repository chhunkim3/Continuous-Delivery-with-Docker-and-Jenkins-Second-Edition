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

class ConstantName = ConstantName.java;

public class ConstantName {
  public final static int FIRST_CONSTANT1 = 10;
  protected final static int SECOND_CONSTANT2 = 100;
  final static int third_Constant3 = 1000; // violation 'must match pattern'
  private final static int fourth_Const4 = 50; // violation 'must match pattern'
  public final static int log = 10; // violation 'must match pattern'
  protected final static int logger = 50; // violation 'must match pattern'
  final static int loggerMYSELF = 5; // violation 'must match pattern'
  final static int MYSELF = 100;
  protected final static int myselfConstant = 1; // violation 'must match pattern'
}
