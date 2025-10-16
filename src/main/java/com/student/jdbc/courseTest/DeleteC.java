package com.student.jdbc.courseTest;

import java.util.ArrayList;
import java.util.Scanner;

import com.course.jdbc.dto.Course;
import com.course.jsbc.courseDao.CourseDao;
import com.course.jsbc.courseDao.courseDaoImpl;

public class DeleteC {
	public static void delete() {
		Scanner s=new Scanner(System.in);
		ArrayList <Course> a=new ArrayList<>();
		CourseDao cd=new courseDaoImpl();
		a=cd.getCourse();
		
		for(Course c:a) {
			System.out.println(c);
		}
		System.out.println("Enter the id");
		int id=s.nextInt();
		
		
		boolean t=cd.deleteCourse(id);
		if(t==true) {
			System.out.println("Deleted Successfull");
		}
		else {
			System.out.println("Failed to delete");
		}
		
	}

}
