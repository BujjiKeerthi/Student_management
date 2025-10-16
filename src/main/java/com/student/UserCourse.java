package com.student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class UserCourse
 */
@WebServlet("/UserCourse")
public class UserCourse extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sid=(String)req.getParameter("stid");
		String cid=(String)req.getParameter("cid");
		
		
		req.setAttribute("cid", cid);
		req.setAttribute("sid", sid);
		RequestDispatcher r=req.getRequestDispatcher("UserCourseAdd.jsp");
		r.forward(req, resp);
	}
}
