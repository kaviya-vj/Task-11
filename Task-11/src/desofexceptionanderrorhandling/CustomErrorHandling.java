package desofexceptionanderrorhandling;

import java.util.Scanner;

// custom Exception   //to use the method present in the exception class using inheritance keyword "extends"
class InvalidAgeException extends Exception {

	public String toString() {

		return "InvalidAgeException: Age must be 18 or above";
	}
}

public class CustomErrorHandling {

	public static void main(String[] args) {

		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int a = sc.nextInt();

		try {
			if (a < 18) {
				// if age less than 18 throw custom exception using "throw" keyword, to
				// handle the exception we are using try and catch block
				throw new InvalidAgeException();
			} else {
				System.out.println("Age is valid");
			}
		} catch (Exception e) {

			System.out.println(e.toString());

			// to check the program
			System.out.println("End");
		} finally {
			// Close the scanner
			if (sc != null) {
				sc.close();
			}
		}
	}
}
