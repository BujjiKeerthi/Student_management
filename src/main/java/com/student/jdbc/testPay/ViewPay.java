package com.student.jdbc.testPay;

import java.util.ArrayList;

import com.course.jdbc.dto.Course;
import com.course.jsbc.courseDao.CourseDao;
import com.course.jsbc.courseDao.courseDaoImpl;
import com.student.jdbc.paymentDao.paymentDao;
import com.student.jdbc.paymentDao.paymentDaoimpl;
import com.student.jdbc.paymentDto.payment;

public class ViewPay {
	public static void viewP() {
		ArrayList <payment> payments=new ArrayList<>();
		paymentDao pay=new paymentDaoimpl();
		CourseDao cdoa=new courseDaoImpl();
		payments=pay.getPayment();
		
		if(payments ==null || payments.isEmpty()){
			System.out.println("course not found");
		}
		else {
			for(payment p:payments) {
				Course c=cdoa.getCourse(p.getCourseid());
				if(p.getStatus().equalsIgnoreCase("pending")) {
					System.out.println("----------Course Information--------");
					System.out.println("Course ID:"+p.getCourseid());
					System.out.println("Course Name:"+c.getCourseName());
					System.out.println("Course Info:"+c.getCourseInfo());
					System.out.println("Duration:"+c.getMonth());
					System.out.println("Status :"+p.getStatus());
					System.out.println("The course will be added to your account as soon as the admin allow you");					
				}
				else if(p.getStatus().equalsIgnoreCase("failed")) {
					System.out.println("Something went wrong ,please try again later");
					
				}
				else {
					System.out.println(c);
				}
			}
			
		}
		
	}

}
