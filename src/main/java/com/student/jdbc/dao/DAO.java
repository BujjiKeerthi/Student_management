package com.student.jdbc.dao;

import java.util.ArrayList;

import com.student.jdbc.Student;

public interface DAO {
	public boolean insertStudent(Student s);
	public boolean updateStudent(Student s);
	public boolean deleteStudent(Student s);
	
	public Student getStudent(String email,String pass);
	public Student getStudent(long phone,String email);
	public ArrayList<Student> getStudent();

}
