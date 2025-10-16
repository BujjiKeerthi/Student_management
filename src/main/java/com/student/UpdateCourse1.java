package com.student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class UpdateCourse
 */
@WebServlet("/update1")
public class UpdateCourse1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String i=req.getParameter("id");
		String name=req.getParameter("name");
		String info=req.getParameter("info");
		String m=req.getParameter("month");
		String f=req.getParameter("fee");
		req.setAttribute("i", i);
		req.setAttribute("name", name);
		req.setAttribute("info", info);
		req.setAttribute("m", m);
		req.setAttribute("f", f);
		RequestDispatcher rd=req.getRequestDispatcher("UpdateCourse.jsp");
		rd.forward(req, resp);
		
	}
	

}
