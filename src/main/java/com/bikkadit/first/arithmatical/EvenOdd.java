package com.bikkadit.first.arithmatical; // Define the package name

public class EvenOdd { // Define the class

	// Method to check if a number is even or odd
	public boolean evenOddNumber(int number) {
		// Check if the number is divisible by 2
		if (number % 2 == 0) {
			System.out.println("Entered number is Even"); // Print if the number is even
			return true; // Return true if the number is even
		} else {
			System.out.println("Entered number is Odd"); // Print if the number is odd
			return false; // Return false if the number is odd
		}
	}
}
