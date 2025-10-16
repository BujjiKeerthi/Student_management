package com.student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.course.jsbc.courseDao.CourseDao;
import com.course.jsbc.courseDao.courseDaoImpl;

/**
 * Servlet implementation class DeleteCourse
 */
@WebServlet("/deleteCourse")
public class DeleteCourse extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String i=req.getParameter("id");
	int id=Integer.parseInt(i);
	
	
	CourseDao cdo=new courseDaoImpl() ;
	
	boolean b=cdo.deleteCourse(id);
	
	if(b) {
		RequestDispatcher rd=req.getRequestDispatcher("DeleteCourse.jsp");
		rd.forward(req, resp);
	}
	else {
		req.setAttribute("message", "Error");
		RequestDispatcher rd=req.getRequestDispatcher("DeleteCourse.jsp");
		rd.forward(req, resp);
	}
	}
	

}
