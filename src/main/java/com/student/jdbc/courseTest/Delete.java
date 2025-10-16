package com.student.jdbc.courseTest;

import java.util.Scanner;

import com.student.jdbc.Student;
import com.student.jdbc.dao.DAO;
import com.student.jdbc.dao.daoMethod;

public class Delete {
public static void delete() {
	DAO d=new daoMethod();
	Student s=new Student();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name");
	s.setName(sc.next());
	boolean t=d.deleteStudent(s);
	if(t==true) {
		System.out.println("Deleted successfully");
	}
	else {
		System.out.println("failed to delete");
	}
}
}
