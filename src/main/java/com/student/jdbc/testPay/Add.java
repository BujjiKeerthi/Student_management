package com.student.jdbc.testPay;

import java.util.ArrayList;
import java.util.Scanner;

import com.course.jdbc.dto.Course;
import com.course.jsbc.courseDao.CourseDao;
import com.course.jsbc.courseDao.courseDaoImpl;
import com.student.jdbc.Student;
import com.student.jdbc.paymentDao.paymentDao;
import com.student.jdbc.paymentDao.paymentDaoimpl;
import com.student.jdbc.paymentDto.payment;

public class Add {
	public static void addCourse(Student s) {
		payment pay=new payment();
		paymentDao p=new paymentDaoimpl();
		pay.setStudentid(s.getId());
		ArrayList<Course> a=new ArrayList<>();
		CourseDao cdoa=new courseDaoImpl();
		
		a=cdoa.getCourse();
		for(Course c:a ) {
			System.out.println(c);
		}
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the course id");
		int id=sc.nextInt();
		Course c=cdoa.getCourse(id);
		
		
		pay.setCourseid(id);
		pay.setTransactionid(TransactionID.transaction());
		sc.nextLine();
		
		
		System.out.println("Total amount"+c.getFees() );
		System.out.println("1. Cash");
		System.out.println("2. UPI");
		System.out.println("3. DebitCard");
		System.out.println("4. CreditCard");
		
		
		int choice =0;
		System.out.println("Enter the Method");
		choice=sc.nextInt();
		switch(choice) {
		case 1:pay.setMethod("Cash");
			break;
		case 2:pay.setMethod("UPI");
			break;
		case 3:pay.setMethod("DebitCard");
			break;
		case 4:pay.setMethod("CreditCard");
			break;
		}
		
		pay.setPath("NA");
		
		
		
		
		
		
		boolean b=p.insertPayment(pay);
		if(b==true) {
			
			System.out.println("data Add");
		}
		else {
			System.out.println("Faild");
		}
	}

}
