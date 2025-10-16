package com.student.jdbc.test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int choice=0;
		Scanner s=new Scanner(System.in);
		
		do {
			System.out.println("---App Info-----");

			System.out.println("1. SignUp");
			System.out.println("2. Login");
			System.out.println("3. Forgot password");
			System.out.println("4. Exit");
			
			choice=s.nextInt();
			switch(choice) {
			case 1: Signup.signup();
				break;
			case 2:Login.login();
				break;
			case 3:Password.forget();
				break;
			case 4:System.out.println("Application terminate");
			break;
			default:System.out.println("Invalid choiice try again");
			
			}
			
		}
		while(choice!=4);
	
	}
	

}
