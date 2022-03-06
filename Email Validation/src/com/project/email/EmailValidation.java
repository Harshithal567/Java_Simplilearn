package com.project.email;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {

		List<String> emails = new ArrayList<String>();
		// valid the email addresses
		emails.add("Srushti.1@me.com");
		emails.add("madhu.2@me.com");
		emails.add("pavithra.3@me.org"); 
		
		// invalid email addresses
		emails.add("tom.example.com");
        emails.add("jerry.@example.@.com@org");
		emails.add("mickey@.example@.com@me");

		for (String value : emails)
		{
			System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));

		}
		System.out.println("Enter valid email id to check");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));

	}

	public static boolean isValidEmail(String email) {
		String regex = "^(.+)@(.+)$";
		// initialize the Pattern object
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();

	}

}
