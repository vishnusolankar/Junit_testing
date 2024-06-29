package com.bikkadit.first.arithmatical; // Define the package name

import static org.junit.jupiter.api.Assertions.assertEquals; // Import the assertEquals method for assertions
import org.junit.jupiter.api.Test; // Import the Test annotation from JUnit

class CalculatorsTest { // Define the test class

	Calculators c = new Calculators(); // Create an object of the Calculators class

	@Test // Define a test method for the addition method
	public void additionTest() 
	{
		/*
		 * int actualResult = c.Addition(50,20); int expectedResult= 70;
		 * assertEquals(expectedResult, actualResult);
		 */

		assertEquals(70, c.Addition(50, 20)); // Assert that the addition method returns the correct result
	}

	@Test // Define a test method for the subtraction method
	public void substractionTest() {
		int actualResult = c.Substraction(50, 4); // Perform subtraction
		int expectedResult = 46; // Define the expected result
		assertEquals(expectedResult, actualResult); // Assert that the subtraction method returns the correct result
	}

	@Test // Define a test method for the multiplication method
	public void multiplicationTest() {
		int actualResult = c.Multiplication(15, 4); // Perform multiplication
		int expectedResult = 60; // Define the expected result
		assertEquals(expectedResult, actualResult); // Assert that the multiplication method returns the correct result
	}

	@Test // Define a test method for the division method
	public void divisionTest() {
		int actualResult = c.Division(40, 5); // Perform division
		int expectedResult = 8; // Define the expected result
		assertEquals(expectedResult, actualResult); // Assert that the division method returns the correct result
	}
}
