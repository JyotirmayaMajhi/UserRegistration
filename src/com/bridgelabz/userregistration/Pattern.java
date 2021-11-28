package com.bridgelabz.userregistration;

import java.util.Scanner;
public class Pattern {

	private String firstName, lastName, email, password, phoneNumber;
	private static Pattern instance;

	Scanner sc = new Scanner(System.in);
	
	public Pattern() {
		
	}
	
	public static Pattern getInstance() {
		if(instance == null) {
			instance = new Pattern();
		}
		return instance;
	}
	
	public boolean isValidFirstName() {
		
		UserData userdata = UserData.getInstance();
		System.out.print("Enter First Name : ");
		firstName = sc.nextLine();
		userdata.setFirstName(firstName);
		boolean check = firstName.matches("^([A-Z]{1}+[a-z]{2,})*$");
		if (check == true) {
			
			System.out.println("Valid");
		} else {
			System.out.println("Invalid Add again(Eg:Jyotirmaya)");
//			isValidFirstName();
		}
		return check;
	}
	
	public boolean addLastName() {

		UserData userdata = UserData.getInstance();
		System.out.print("Enter Last Name : ");
		lastName = sc.nextLine();
		userdata.setLastName(lastName);
		boolean check = lastName.matches("^([A-Z]{1}+[a-z]{2,})*$");
		if (check == true) {
			
			System.out.println("Valid");
		} else {
			System.out.println("Invalid Add again (Eg:Majhi)");
//			addLastName();
		}
		return check;
	}
	
	public boolean addEmail(String emailAddress) {
		
		UserData userdata = UserData.getInstance();
//		System.out.print("Enter Email : ");
//		email = sc.nextLine();
		String email = emailAddress;
		userdata.setEmail(email);
		System.out.print(email);
		boolean check = email.matches("^[0-9a-zA-Z+-._]+@[-+_.0-9a-zA-Z]*.[a-zA-Z]{2,3}.([a-zA-z]{2,3})*$");
		if (check == true) {
//			userdata.setEmail(email);
			System.out.println("Valid");
		} else {
			System.out.println("Invalid Email Add again (Eg:abc.xyz@bl.co.in)");
//			addEmail();
		}
		return check;
	}
	
	public boolean addPhoneNumber() {
		
		UserData userdata = UserData.getInstance();
		System.out.print("Enter Phone Number : ");
		phoneNumber = sc.nextLine();
		userdata.setPhoneNumber(phoneNumber);
		boolean check = phoneNumber.matches("^([0-9]{1,2})\\s([0-9]{10})$");
		if (check == true) {
			
			System.out.println("Valid");
		} else {
			System.out.println("Invalid Phone Number Add again (Eg:91 9431295849)");	
//			addPhoneNumber();
		}
		return check;
	}
	
	public boolean addPassword() {
		
		UserData userdata = UserData.getInstance();
		System.out.print("Enter Password : ");
		password = sc.nextLine();
		userdata.setPassword(password);
		boolean check = password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*(@)).{8,}$");
		if (check == true) {
//			userdata.setPassword(password);
			System.out.println("Valid");
		} else {
			System.out.println("Invalid password format \\nAdd again [Atleast 8 Character, 1 Upper Case, Atleast one numeric number]");
//			addPassword();
		}
		return check;
	}
	
}
