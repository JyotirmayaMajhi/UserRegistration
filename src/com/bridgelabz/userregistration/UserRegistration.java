package com.bridgelabz.userregistration;

public class UserRegistration {

	private String firstName, lastName, email, password, phoneNumber;
	
	public static void main(String[] args) {
		
		UserRegistration user = new UserRegistration();
		Pattern pattern = new Pattern();
		
		pattern.isValidFirstName(); 
		user.firstName = pattern.getFirstName();

		pattern.addLastName(); 
		user.lastName = pattern.getLastName();

		pattern.addEmail(); 
		user.email = pattern.getEmail();

		pattern.addPhoneNumber(); // Phone Number Adding
		user.phoneNumber = pattern.getPhoneNumber();
		user.display();
	}

	private void display() {
		
		System.out.println("\nUser Data:-\n\tFirst Name : " + firstName + 
				"\n\tLast Name : " + lastName + "\n\tEmail : "+ email + "\n\tPhone Number : " + phoneNumber);
		
	}

}
