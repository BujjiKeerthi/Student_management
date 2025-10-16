   package com.student.jdbc.paymentDao;

import java.util.ArrayList;

import com.student.jdbc.paymentDto.payment;

public interface paymentDao {
	public boolean insertPayment(payment p );
	public boolean upadatePayment(payment p);
	public boolean deletePayment(payment p);
	public payment getPayment(int paymentId);
	public ArrayList<payment> getPaymentByStudentId(int studentId);
	public ArrayList<payment> getPayment();

}
 