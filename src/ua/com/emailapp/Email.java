package ua.com.emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapasity;
	private String alternateEmail;
	
	//Constactor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		//Call a method asking for the department - return the department
		this.department = setDepertment();
		System.out.println("Department: " + this.department);
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

}
