package com.bridgelabz.userregistration;

public class UserRegistration {

	private String firstName, lastName, email, password, phoneNumber;
	
	public static void main(String[] args) throws InvalidUserDetailsException {
		
		UserData userdata = UserData.getInstance();
		UserRegistration user = new UserRegistration();
		
		Pattern pattern = new Pattern();
		pattern.userEntry();
		
	}
}
