package com.student.jdbc;

public class Student {
	
//	Intance Variable
	private int  id;
	private String name;
	private String gmail;
	private String pass;
	private long phone;
	
	
	
	
//
//	
//
//	
//	
//	
////	Payment
//	
//	
//	
//
//	
////	Payment Getter AND SETTER
//	public int getPaymentid() {
//		return paymentid;
//	}
//	public void setPaymentid(int paymentid) {
//		this.paymentid = paymentid;
//	}
//	public int getStudentid() {
//		return Studentid;
//	}
//	public void setStudentid(int studentid) {
//		Studentid = studentid;
//	}
//	public int getCourseid() {
//		return courseid;
//	}
//	public void setCourseid(int courseid) {
//		this.courseid = courseid;
//	}
//	public long getTransactionid() {
//		return transactionid;
//	}
//	public void setTransactionid(long transactionid) {
//		this.transactionid = transactionid;
//	}
//	public String getMethod() {
//		return method;
//	}
//	public void setMethod(String method) {
//		this.method = method;
//	}
//	public String getStatus() {
//		return status;
//	}
//	public void setStatus(String status) {
//		this.status = status;
//	}
//	public String getDate() {
//		return date;
//	}
//	public void setDate(String date) {
//		this.date = date;
//	}
//	
	
	
	
//	STUDENT GETTER AND SETTER
public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", gmail=" + gmail + ", phone=" + phone + "\n";
	}

	
	
	

	
	

}
