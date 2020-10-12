package com.sapient.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sapient.service.MathService;

public class TestMathService {
	MathService mathService;

	@BeforeEach
	void initialize() {
		mathService = new MathService();
	}

	@Test
	void TestFibonacci() {
		int result1 = mathService.getFibonacciNo(-10);
		Assertions.assertEquals(-1, result1);
		int result2 = mathService.getFibonacciNo(0);
		Assertions.assertEquals(0, result2);
		int result3 = mathService.getFibonacciNo(1);
		Assertions.assertEquals(1, result3);
		int result4 = mathService.getFibonacciNo(5);
		Assertions.assertEquals(5, result4);
	}
	
	@Test
	void TestFactorial() {
		int result1 = mathService.getFactorial(-10);
		Assertions.assertEquals(-1, result1);
		int result2 = mathService.getFactorial(0);
		Assertions.assertEquals(1, result2);
		int result3 = mathService.getFactorial(1);
		Assertions.assertEquals(1, result3);
		int result4 = mathService.getFactorial(5);
		Assertions.assertEquals(120, result4);
	}	

	@Test
	void TestCheckPrime() {
		boolean result1 = mathService.checkPrime(1);
		Assertions.assertEquals(false, result1);
		boolean result2 = mathService.checkPrime(11);
		Assertions.assertEquals(true, result2);
	}	

	
}
