package com.student.jdbc.test;

import java.util.ArrayList;

import com.student.jdbc.paymentDao.paymentDao;
import com.student.jdbc.paymentDao.paymentDaoimpl;
import com.student.jdbc.paymentDto.payment;

public class ViewP {
	public static void viewp() {
		ArrayList<payment> a=new ArrayList<>();
		paymentDao p=new paymentDaoimpl();
		payment pa=new payment();
		
		a=p.getPayment();
		for(payment pay:a) {
			System.out.println(pay);
		}
	}

}
