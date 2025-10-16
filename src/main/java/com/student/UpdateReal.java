package com.student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.course.jdbc.dto.Course;
import com.course.jsbc.courseDao.CourseDao;
import com.course.jsbc.courseDao.courseDaoImpl;

/**
 * Servlet implementation class UpdateReal
 */
@WebServlet("/Course1")
public class UpdateReal extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Course c= new Course();
		c.setCourseId(Integer.parseInt(req.getParameter("id")));
		c.setCourseName(req.getParameter("Name"));
		c.setCourseInfo(req.getParameter("info"));
		c.setMonth(Integer.parseInt(req.getParameter("month")));
		c.setFees(Float.parseFloat(req.getParameter("fee")));
		
		CourseDao cdo=new courseDaoImpl();
		
		boolean b=cdo.updateCourse(c);
		if(b) {
			RequestDispatcher rd=req.getRequestDispatcher("Update.jsp");
			rd.forward(req, resp);
		}
		else {
			req.setAttribute("message", "Error");
			RequestDispatcher rd= req.getRequestDispatcher("UpdateCourse.jsp");
			rd.forward(req, resp);
		}
		
		
		
		
	}
	

}
