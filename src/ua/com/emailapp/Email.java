package ua.com.emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapasity;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = ".anycompany.com";
	
	//Constactor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		//Call a method asking for the department - return the department
		this.department = setDepertment();
		System.out.println("Department: " + this.department);
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
		System.out.println("Your email is: " + email);
	}
	
	//Ask for the department
	private String setDepertment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
		Scanner in = new Scanner(System.in);
		int departmentChoise = in.nextInt();
		String retunrChoise = "";
		switch(departmentChoise) {
		case 1: retunrChoise = "sales"; break;
		case 2: retunrChoise = "development"; break;
		case 3: retunrChoise = "accounting"; break;
		}
		in.close();
		return retunrChoise;
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz1234567890!@#$%&*?";
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			int randomValue = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(randomValue);
		}
		return String.valueOf(password);
	}
	
	
	
	
	
	
	
	

}
