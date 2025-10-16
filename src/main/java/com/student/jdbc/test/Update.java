package com.student.jdbc.test;

import java.util.Scanner;

import com.student.jdbc.Student;
import com.student.jdbc.dao.DAO;
import com.student.jdbc.dao.daoMethod;

public class Update {
	public static void update(Student st) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		System.out.println("--------Update Info----------");
		System.out.println("1. Name");
		System.out.println("2. Gmail");
		System.out.println("3. Password");
		System.out.println("4. Phone");
		
		System.out.println("Enter the choice");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:System.out.println("Enter the name to be updated");
			st.setName(sc.next());
			break;
		case 2:System.out.println("Enter the Gmail to be updated");
			st.setGmail(sc.next());
			break;
		case 3:System.out.println("Enter the new password");
			String s1=sc.next();
			System.out.println("Enter the conform password");
			String s2=sc.next();
		
				if(s1.equals(s2)) {
						st.setPass(sc.next());
					}
				else {
					System.out.println("Passworld is mismatch");
				}
				break;
		case 4:System.out.println("Enter the Phone number to be updated");
			st.setPhone(sc.nextLong());
			break;
		
		
		
		}
		
		
		
		
		
		
		DAO d=new daoMethod();
		
		boolean t=d.updateStudent(st);
		
		if(t==true) {
			System.out.println("updated successfully");
		}
		else {
			System.out.println("Error");
		}
	}

}
