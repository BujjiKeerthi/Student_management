package com.student.jdbc.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.student.jdbc.Student;
import com.student.jdbc.paymentDao.paymentDao;
import com.student.jdbc.paymentDao.paymentDaoimpl;
import com.student.jdbc.paymentDto.payment;

public class Approve {
	public static void payment(Student s) {
		ArrayList<payment> a=new ArrayList<>();
		paymentDao p=new paymentDaoimpl();
		payment pa=new payment();
		Scanner sc=new Scanner(System.in);
		
		a=p.getPayment();
		for(payment pay:a) {
			System.out.println(pay);
			
		pa=p.getPayment(pay.getPaymentid());
		System.out.println("----info----");
		System.out.println("1. Approve");
		System.out.println("2. Decline");
		int i=0;
		System.out.println("Enter the choice");
		i=sc.nextInt();
		switch(i) {
		case 1:pay.setStatus("Success");
			break;
		case 2:pay.setStatus("Failed");
			break;
		}
		boolean c=p.upadatePayment(pa);
		if(c==true) {
			System.out.println("Payment approved");
		}
		else {
			System.out.println("payment Failed");
		}
		
		
	}

	}
}
