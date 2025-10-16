package com.student.jdbc.courseTest;

import java.util.ArrayList;

import com.course.jdbc.dto.Course;
import com.course.jsbc.courseDao.CourseDao;
import com.course.jsbc.courseDao.courseDaoImpl;

public class Coursedetails {
//@SuppressWarnings("unchecked")
public static void details() {
	
	ArrayList<Course> a=new ArrayList<>();
	CourseDao cd=new courseDaoImpl();
	a=cd.getCourse();
//	System.out.println(a);
	
	for(Course c:a) {
		System.out.println(c.getCourseId()+"|"+c.getCourseName()+"|"+c.getCourseInfo()+"|"+c.getMonth()+"|"+c.getFees());
		
	}
}
}
