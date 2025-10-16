package com.student.jdbc.courseTest;

import java.util.ArrayList;
import java.util.Scanner;

import com.course.jdbc.dto.Course;
import com.course.jsbc.courseDao.CourseDao;
import com.course.jsbc.courseDao.courseDaoImpl;

public class Update {
	public static void update() {
		Course c=new Course();
		Scanner sc=new Scanner(System.in);
		ArrayList<Course> ca=new ArrayList<>();
		CourseDao cd=new courseDaoImpl();
		ca=cd.getCourse();
		
		for(Course i:ca) {
			System.out.println(i);
			
		}
		System.out.println("Enter the CourseId");
		int id=sc.nextInt();
		
		 c=cd.getCourse(id);
		 boolean i = false;
		 int choice=0;
		 
		 if(c.getCourseId()==id) {
			 
			 do {
				System.out.println("1. CourseName");
				System.out.println("2. CourseInfo");
				System.out.println("3. CourseMonth");
				System.out.println("4. Coursefee");
				System.out.println("5. Exit");
				System.out.println("Enter the choice");
				 choice=sc.nextInt();
				
			switch(choice) {
//			case :System.out.println("Enter the CourseId");
//				c.setCourseId(sc.nextInt());
//				break;
			case 1:System.out.println("Enter the CourseName");
				c.setCourseName(sc.next());
				break;
			case 2:System.out.println("Enter the CourseInfo");
				c.setCourseInfo(sc.next());
				break;
			case 3:System.out.println("Enter the Month");
				c.setMonth(sc.nextInt());
				break;
			case 4:System.out.println("Enter the Fees");
				c.setFees(sc.nextFloat());
				break;
			case 5:System.out.println("Exit");
				break;
			
			
				
			default:System.out.println("Invalid choice");
			
			}
			i=cd.updateCourse(c);
			
			 }while(choice!=5);
			 
			  
		 }
		 if(choice!=5) {
		 if(i==true) {
			  System.out.println("Updated successfully");
		  }
		 else {
			 System.out.println("Info not found");
		 }
		 }
		
		
	}

}
