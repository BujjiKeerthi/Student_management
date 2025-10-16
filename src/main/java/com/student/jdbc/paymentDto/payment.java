package com.student.jdbc.paymentDto;

public class payment {
	private int paymentid;
	private int Studentid;
	private int courseid;
	@Override
	public String toString() {
		return "payment [paymentid=" + paymentid + ", Studentid=" + Studentid + ", courseid=" + courseid
				+ ", transactionid=" + transactionid + ", method=" + method + ", status=" + status + ", date=" + date
				+ ", path=" + path + "]";
	}
	private long transactionid;
	private String method;
	private String status;
	private String date;
	private String path;
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	public int getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}
	public int getStudentid() {
		return Studentid;
	}
	public void setStudentid(int studentid) {
		Studentid = studentid;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public long getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(long transactionid) {
		this.transactionid = transactionid;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	
	}
	
	

}
