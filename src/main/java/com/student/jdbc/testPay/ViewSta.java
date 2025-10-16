package com.student.jdbc.testPay;

import java.util.ArrayList;

import com.course.jdbc.dto.Course;
import com.course.jsbc.courseDao.CourseDao;
import com.course.jsbc.courseDao.courseDaoImpl;
import com.student.jdbc.Student;
import com.student.jdbc.paymentDao.paymentDao;
import com.student.jdbc.paymentDao.paymentDaoimpl;
import com.student.jdbc.paymentDto.payment;

public class ViewSta {
	public static void view(Student s) {
		paymentDao pdoa=new paymentDaoimpl();
		CourseDao cdao=new courseDaoImpl();
		ArrayList<payment> a=new ArrayList<>();
		Course c=new Course();
		
		a=pdoa.getPaymentByStudentId(s.getId());
		for(payment p:a) {
		c=cdao.getCourse(p.getCourseid());
		System.out.println(p);
		if(p.getStatus().equalsIgnoreCase("pending")) {
			System.out.println("Your payment is still under approval by admin");
		}
		}
		
		
		
		
		
	}

}
