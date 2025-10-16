package com.student.jdbc.courseTest;

import java.util.Scanner;

import com.course.jdbc.dto.Course;
import com.course.jsbc.courseDao.CourseDao;
import com.course.jsbc.courseDao.courseDaoImpl;

public class Insert {
	public static void insert() {
		Course c=new Course();
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the course name");
		c.setCourseName(s.next());
		System.out.println("Enter the course Info");
		c.setCourseInfo(s.next());
		System.out.println("Enter the month");
		c.setMonth(s.nextInt());
		System.out.println("Enter the Fees");
		c.setFees(s.nextFloat());
		
		CourseDao cd=new courseDaoImpl();
		
		boolean  i=cd.insertCourse(c);
		if(i==true) {
			System.out.println("Insertion is successfull");
		}
		else {
			System.out.println("Failed to insert");
		}
	}

}
