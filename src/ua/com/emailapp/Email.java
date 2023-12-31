package ua.com.emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapasity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "anycompany.com";
	
	//Constactor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//Call a method asking for the department - return the department
		this.department = setDepertment();

		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);

		
		//Combine elements to generate email
		email = generateEmail(department);

	}
	
	//Generates the correct email depending on the availability of the department
	public String generateEmail(String dep) {
		if(!dep.isBlank()) dep =  dep + ".";
		return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + dep + companySuffix;
	}

	//Ask for the department
	private String setDepertment() {
		System.out.println("New worker: " + firstName + "\nDEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
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
	
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapasity = capacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapasity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + "\n" +
				"COMPANY EMAIL: " + email + "\n" + 
				"MAILBOX CAPACITY: " + mailboxCapasity + "mb";
	}
	
}