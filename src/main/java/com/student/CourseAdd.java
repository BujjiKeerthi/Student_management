package com.student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.apache.catalina.connector.Response;

import com.course.jdbc.dto.Course;
import com.course.jsbc.courseDao.CourseDao;
import com.course.jsbc.courseDao.courseDaoImpl;

/**
 * Servlet implementation class Course
 */
@WebServlet("/Course")
public class CourseAdd extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Course c=new Course();
		CourseDao cd=new courseDaoImpl();
		c.setCourseName(req.getParameter("Name"));
		c.setCourseInfo(req.getParameter("info"));
		c.setMonth(Integer.parseInt(req.getParameter("month")));
		c.setFees(Float.parseFloat(req.getParameter("fee")));
	boolean b=cd.insertCourse(c);
	
	if(b) {
		resp.sendRedirect("AddCourse.jsp");
	}
	
	
	}
}
