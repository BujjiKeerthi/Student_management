package com.student.jdbc.test;

import java.util.Scanner;

import com.course.jsbc.courseDao.CourseDao;
import com.course.jsbc.courseDao.courseDaoImpl;
import com.student.jdbc.Student;
import com.student.jdbc.paymentDao.paymentDao;
import com.student.jdbc.paymentDao.paymentDaoimpl;
import com.student.jdbc.testPay.Add;
import com.student.jdbc.testPay.UpdateAcc;
import com.student.jdbc.testPay.ViewAcc;
import com.student.jdbc.testPay.ViewPay;
import com.student.jdbc.testPay.ViewSta;

public class App {
	public static void app(Student sp) {
		int choice=0;
		Scanner s=new Scanner(System.in);
		CourseDao cdao=new courseDaoImpl();
		paymentDao pda=new paymentDaoimpl();
		
		do {
			System.out.println("---Info----");
			System.out.println("1. View Purchased Course");
			System.out.println("2. Add Course");
			System.out.println("3. View Account");
			System.out.println("4. Update Account");
			System.out.println("5. View Payment And Status");
			System.out.println("6. Exit");
			
			
			choice=s.nextInt();
			
			switch(choice) {
			case 1: ViewPay.viewP();
				break;
			case 2:Add.addCourse(sp);
				break;
			case 3: ViewAcc.viewacc(sp);
				break;
			case 4:UpdateAcc.update(sp);
				break;
			case 5:ViewSta.view(sp);
				break;
			case 6:System.out.println("Exit");
				break;
			}
			
			}
		while(choice!=6);
	}

	}
