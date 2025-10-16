package com.student.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.student.jdbc.Student;
import com.student.jdbc.connection.Connector;

public class daoMethod implements DAO{
	private Connection con;
	
	public daoMethod() {
		this.con=Connector.request();
	}

	@Override
	public boolean insertStudent(Student s) {
		String query="insert into student values(0,?,?,?,?)";
		int i=0;
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,s.getName());
			ps.setString(2,s.getGmail());
			
			ps.setString(3, s.getPass());
			ps.setLong(4, s.getPhone());
			 i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0) {
			return true;
		}
		else {
			return false;
		}
		
		
		
		
		
	}

	@Override
	public boolean updateStudent(Student s) {
		String query="UPDATE STUDENT SET NAME=?,GAMIL=?,PASSWORD=?,PHONE=? WHERE ID=?";
		int i=0;
		try {
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1,s.getName());
			ps.setString(2, s.getGmail());
			ps.setString(3, s.getPass());
			ps.setLong(4, s.getPhone());
			ps.setInt(5, s.getId());
			
			i=ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean deleteStudent(Student s) {
		String Query="DELETE FROM STUDENT WHERE NAME=?";
		int i=0;
		
		try {
			PreparedStatement ps=con.prepareStatement(Query);
			ps.setString(1, s.getName());
			i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public Student getStudent(String email, String pass) {
		String query="Select * from student where gamil=? and password=?";
		
		try {
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, email);
			ps.setString(2, pass);
			
			ResultSet r=ps.executeQuery();
			
			while(r.next()) {
				int i=r.getInt(1);
			String n=r.getString(2);
			String e=r.getString(3);
			String p=r.getString(4);
			Long ph=r.getLong(5);
			
			Student s=new Student();
			s.setId(i);
			s.setName(n);
			s.setGmail(e);
			s.setPass(p);
			s.setPhone(ph);
			
			return s;
			
			
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}

	@Override
	public Student getStudent(long phone, String email) {
		String Query="SELECT * FROM STUDENT WHERE GAMIL=? AND PHONE=?";
		
		try {
			PreparedStatement ps=con.prepareStatement(Query);
			ps.setString(1,email);
			ps.setLong(2, phone);
			ResultSet r=ps.executeQuery();
			while(r.next()) {
				int i=r.getInt(1);
				String s=r.getString(2);
				String p=r.getString(4);
				String g=r.getString(3);
				Long ph=r.getLong(5);
				Student s1=new Student();
				s1.setId(i);
				s1.setName(s);
				s1.setPass(p);
				s1.setGmail(g);
				s1.setPhone(ph);
				
				return s1;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public ArrayList<Student> getStudent() {
		String query="SELECT * FROM STUDENT";
		
		Student s=null;
		ArrayList<Student> sp =new ArrayList<>();
		
		try {
			PreparedStatement ps=con.prepareStatement(query);
			
			ResultSet r=ps.executeQuery();
			while(r.next()) {
				s=new Student();
				s.setId(r.getInt(1));
				s.setName(r.getString(2));
				s.setGmail(r.getString(3));
				s.setPass(r.getString(4));
				s.setPhone(r.getLong(5));
				sp.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sp;
	}
	
	

}
