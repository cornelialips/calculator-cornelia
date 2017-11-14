package com.example.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.classes.Calculator;

public class CalculatorTest {
	Calculator calculator = new Calculator();

	@Test
	public void test() {
		assertEquals(calculator.addition(2, 2), 4, 0);

	}

	@Test
	public void test2() {
		assertEquals(calculator.subtraction(2, 2), 0, 0);

	}

	public void test3() {
		assertEquals(calculator.division(2, 2), 1, 0);
	}

	public void test4() {
		assertEquals(calculator.multiplication(2, 2), 4, 0);
	}
}
