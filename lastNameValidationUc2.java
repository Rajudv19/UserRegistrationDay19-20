package com.BridgeLabs.day20;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lastNameValidationUc2 {

	private static void ValidatinguserFirstName() {
		//UC1 User need to enter valid First Name
		String firstNamePattern = "[A-Z]{1}[a-z]{2,}";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String firstName = scanner.next();

		Pattern pattern = Pattern.compile(firstNamePattern);
		Matcher matcher = pattern.matcher(firstName);
		boolean result = matcher.matches();

		if(result == true)
			ValidatinguserLastName();
		else
			System.out.println("First Name is Invalid");
	}

	private static void ValidatinguserLastName() {
		//UC2 User need to enter valid Last Name
		String lastNamePattern = "[A-Z]{1}[a-z]{2,}";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Last Name:");
		String lastName = scanner.next();

		Pattern pattern1 = Pattern.compile(lastNamePattern);
		Matcher matcher1 = pattern1.matcher(lastName);
		boolean result1 = matcher1.matches();

		if(result1 == true)
			System.out.println("Last Name is Valid");
		else
			System.out.println("Last Name is invalid");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration program");
		ValidatinguserFirstName();
	}
}