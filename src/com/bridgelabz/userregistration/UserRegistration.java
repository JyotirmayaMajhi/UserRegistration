package com.bridgelabz.userregistration;

public class UserRegistration {

	public static void main(String[] args) {
		
		String firstName, lastName, email, password, phoneNumber;

		Pattern pattern = new Pattern();
		pattern.isValidFirstName();
		firstName = pattern.getFirstName();
		
		pattern.addLastName();
		lastName = pattern.getLastName();
		System.out.println("\nUser Data:-\n\tFirst Name : " + firstName + "\n\tLast Name : " + lastName);
		
		pattern.addEmail();
		email = pattern.getEmail();
		System.out.println(
				"\nUser Data:-\n\tFirst Name : " + firstName + "\n\tLast Name : " + lastName + 
				"\n\tEmail : " + email);
	}

}
