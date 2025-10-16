package com.student.jdbc.courseTest;

import java.util.ArrayList;

import com.student.jdbc.Student;
import com.student.jdbc.dao.DAO;
import com.student.jdbc.dao.daoMethod;

public class View {
	public static void view() {
		ArrayList<Student> sc=new ArrayList<>();
		DAO d=new daoMethod();
		sc=d.getStudent();
		for(Student s:sc) {
		System.out.println(s);
	}

}
}
