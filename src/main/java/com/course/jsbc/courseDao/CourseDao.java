package com.course.jsbc.courseDao;

import java.util.ArrayList;

import com.course.jdbc.dto.Course;

public interface CourseDao {
	
	public boolean insertCourse(Course c);
	public boolean updateCourse(Course c);
	public boolean deleteCourse(int id);
	
	public Course getCourse(int id);
	public ArrayList<Course> getCourse();
	
	
}
