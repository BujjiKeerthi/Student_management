package com.student.jdbc.test;

import java.util.Scanner;

import com.student.jdbc.Student;
import com.student.jdbc.dao.DAO;
import com.student.jdbc.dao.daoMethod;

public class Signup {
	
	public static void signup() {
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		s.setName(sc.next());
		System.out.println("Enter the Gmail");
		s.setGmail(sc.next());
		System.out.println("Enter the phone number");
		s.setPhone(sc.nextLong());
		System.out.println("enter the password");
		String pass=sc.next();
		System.out.println("enter the conform password");
		String conf=sc.next();
		
		if(pass.equals(conf)) {
			s.setPass(conf);
		}
		else {
			System.out.println("Pass is not match");
		}
		
		DAO d=new daoMethod();
		boolean res=d.insertStudent(s);
		
		if(res==true) {
			System.out.println("data is successfully inserted");
		}
		else {
			System.out.println("failed to insert");
		}
		
		
		
		
		
	}
	

}
