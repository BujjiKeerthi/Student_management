package com.course.jsbc.courseDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.course.jdbc.dto.Course;
import com.student.jdbc.connection.Connector;

public class courseDaoImpl implements CourseDao {
	private Connection con;
	public courseDaoImpl() {
		this.con=Connector.request();
	}
	

	@Override
	public boolean insertCourse(Course c) {
		String Query="Insert into course values(0,?,?,?,?)";
		int i=0;
		 try {
			PreparedStatement ps=con.prepareStatement(Query);
			ps.setString(1, c.getCourseName());
			ps.setString(2, c.getCourseInfo());
			ps.setLong(3, c.getMonth());
			ps.setFloat(4, c.getFees());
			
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
	public boolean updateCourse(Course c) {
		// TODO Auto-generated method stub
		int i=0;
		String query="Update course set coursename=?,courseInfo=?,month=?,fees=? where courseid=?";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, c.getCourseName());
			ps.setString(2, c.getCourseInfo());
			ps.setInt(3, c.getMonth());
			ps.setFloat(4,c.getFees());
			ps.setInt(5, c.getCourseId());
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
	public boolean deleteCourse(int id) {
		String query="delete from course where courseid=?";
		int i=0;
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);
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
	public Course getCourse(int id) {
		String query="Select * from course where courseid=?";
		
		Course c=null;
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);
			
			ResultSet r=ps.executeQuery();
			
			while(r.next()) {
				 c=new Course();
				c.setCourseId(r.getInt(1));
				c.setCourseName(r.getString(2));
				c.setCourseInfo(r.getString(3));
				c.setMonth(r.getInt(4));
				c.setFees(r.getFloat(5));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public ArrayList<Course> getCourse() {
		ArrayList<Course> a=new ArrayList<>();
		
		
		
		String Query="Select * from course";
		try {
			PreparedStatement ps=con.prepareStatement(Query);
			ResultSet r=ps.executeQuery();
//			System.out.println(r);
			while(r.next()) {
				Course co=new Course();
				co.setCourseId(r.getInt(1));
				co.setCourseName(r.getString(2));
				co.setCourseInfo(r.getString(3));
				co.setMonth(r.getInt(4));
				co.setFees(r.getFloat(5));
				
				a.add(co);
//				System.out.println(a);
			
				
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// TODO Auto-generated method stub
		return a;
	}
	

}
