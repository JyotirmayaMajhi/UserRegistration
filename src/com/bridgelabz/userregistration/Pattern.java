package com.bridgelabz.userregistration;

import java.util.Scanner;
public class Pattern {

	private String firstName, lastName, email, password, phoneNumber;

	

	public void isValidFirstName() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Name : ");
		firstName = sc.nextLine();
		boolean check = firstName.matches("^([A-Z]{1}+[a-z]{2,})*$");
		if (check == true) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid Add again");
			isValidFirstName();
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
