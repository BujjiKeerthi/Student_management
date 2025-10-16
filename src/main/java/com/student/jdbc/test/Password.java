package com.student.jdbc.test;

import java.util.Scanner;

import com.student.jdbc.Student;
import com.student.jdbc.dao.DAO;
import com.student.jdbc.dao.daoMethod;

public class Password {
	public static void forget() {
		Student s=new Student();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Email");
		String email=sc.next();
		System.out.println("enter the phone number");
		long ph=sc.nextLong();
		
		
		DAO d=new daoMethod();
		
		s=d.getStudent(ph, email);
		if(s==null) {
			System.out.println("Wrong Email ot phone");
		}
		
		if(email.equals(s.getGmail()) && ph==s.getPhone()) {
//			if(s.getId()==1) {
//				System.out.println("ADMIN");
//			}
//			else {
//				System.out.println("Student");
//				
//			}
			Update.update(s);
			
		}
		
	}

}
