package com.student.jdbc.paymentDao;
import com.student.jdbc.connection.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.student.jdbc.connection.Connector;
import com.student.jdbc.paymentDto.payment;

public class paymentDaoimpl implements paymentDao {
	private Connection con;
	public paymentDaoimpl() {
		this.con=Connector.request();
	}

	@Override
	public boolean insertPayment(payment p) {
		String Check="select * from payment where studentid=? and courseid=?";
		String query="Insert Into payment values(0,?,?,?,?,'pending',SYSDATE(),?)";
		int i=0;
		
		try {
			PreparedStatement ps1=con.prepareStatement(Check);
			ps1.setInt(1, p.getStudentid());
			ps1.setInt(2, p.getCourseid());
			ResultSet r=ps1.executeQuery();
			if(r.next()) {
				System.out.println("Course Already Add to the Account");
			}
			else {
			
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, p.getStudentid());
			ps.setInt(2, p.getCourseid());
			ps.setLong(3, p.getTransactionid());
			ps.setString(4, p.getMethod());
			ps.setString(5, p.getPath());
			i=ps.executeUpdate();	
			
			
			}return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean upadatePayment(payment p) {
		String query="update payment set status='Success' where paymentid=?";
		int i=0;
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, p.getPaymentid());
			i=ps.executeUpdate();
			return i>0;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean deletePayment(payment p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public payment getPayment(int p) {
		String query ="Select * from payment where paymentid=?";
		payment  pay=null;
		
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, p);
			
			ResultSet r=ps.executeQuery();
			while(r.next()) { 
				pay=new payment();
				pay.setPaymentid(r.getInt(1));
				pay.setStudentid(r.getInt(2));
				pay.setCourseid(r.getInt(3));
				pay.setTransactionid(r.getLong(4));
				pay.setMethod(r.getString(5));
				pay.setStatus(r.getString(6));
				pay.setDate(r.getString(7));
				pay.setPath(r.getString(8));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pay;
	}

	@Override
	public ArrayList<payment> getPaymentByStudentId(int studentId) {
		// TODO Auto-generated method stub
		String query ="Select * from payment where studentid=?";
		ArrayList<payment> p=new ArrayList<>();
		payment  pay=null;
		
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, studentId);
			
			ResultSet r=ps.executeQuery();
			while(r.next()) { 
				pay=new payment();
				pay.setPaymentid(r.getInt(1));
				pay.setStudentid(r.getInt(2));
				pay.setCourseid(r.getInt(3));
				pay.setTransactionid(r.getLong(4));
				pay.setMethod(r.getString(5));
				pay.setStatus(r.getString(6));
				pay.setDate(r.getString(7));
				pay.setPath(r.getString(8));
				p.add(pay);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public ArrayList<payment> getPayment() {
		String query="Select * from payment";
		ArrayList<payment> payment=new ArrayList<>();
		payment pay=null;
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet r=ps.executeQuery();
			
			
			while(r.next()) {
				pay=new payment();
				
				pay.setPaymentid(r.getInt(1));
				pay.setStudentid(r.getInt(2));
				pay.setCourseid(r.getInt(3));
				pay.setTransactionid(r.getLong(4));
				pay.setMethod(r.getString(5));
				pay.setStatus(r.getString(6));
				pay.setDate(r.getString(7));
				
				payment.add(pay);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
		return payment;
	}
	

	
}
