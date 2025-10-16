package com.student.jdbc.test;

import java.util.Scanner;

import com.student.jdbc.Student;
import com.student.jdbc.courseTest.Coursedetails;
import com.student.jdbc.courseTest.Delete;
import com.student.jdbc.courseTest.DeleteC;
import com.student.jdbc.courseTest.Insert;
import com.student.jdbc.courseTest.Update;
import com.student.jdbc.courseTest.View;
import com.student.jdbc.dao.DAO;
import com.student.jdbc.dao.daoMethod;

public class Login {
	
	public static void login() {
		
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the gmail");
		String gmail=sc.next();
		System.out.println("enter the Password");
		String password=sc.next();
		
		DAO d=new daoMethod();
		
		s=d.getStudent(gmail,password);
		if(s!=null) {
			System.out.println("Successfully login!!!! welcome  " +s.getName()+" "+s.getId());
			if(s.getId()==1) {
				Admin.admin(s);
			}
			else {
				App.app(s);
			}
			
			
		}
		else {
			System.out.println("gmail or password is not found");
		}
		 
		
		
	}

}
