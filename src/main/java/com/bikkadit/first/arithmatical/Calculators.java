package com.bikkadit.first.arithmatical; // Define the package name

public class Calculators { // Define the class

	// Method to add two numbers
	public int Addition(int a, int b) {
		int c = a + b; // Perform addition
		System.out.println("Addition = " + c); // Print the result of addition
		return c; // Return the result
	}

	// Method to subtract two numbers
	public int Substraction(int a, int b) {
		int c = a - b; // Perform subtraction
		System.out.println("Substraction = " + c); // Print the result of subtraction
		return c; // Return the result
	}

	// Method to multiply two numbers
	public int Multiplication(int a, int b) {
		int c = a * b; // Perform multiplication
		System.out.println("Multiplication = " + c); // Print the result of multiplication
		return c; // Return the result
	}

	// Method to divide two numbers
	public int Division(int a, int b) {
		int c = a / b; // Perform division
		System.out.println("Division = " + c); // Print the result of division
		return c; // Return the result
	}
}
