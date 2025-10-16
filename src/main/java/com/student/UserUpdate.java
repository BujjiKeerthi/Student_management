package com.student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class UserUpdate
 */
@WebServlet("/UserUpdate")
public class UserUpdate extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String s=(String)req.getParameter("id");
		String name=(String)req.getParameter("name");
		String gmail=(String)req.getParameter("mail");
		String phone=(String)req.getParameter("phone");
		
		
		
		req.setAttribute("id", s);
		req.setAttribute("name", name);
		req.setAttribute("gmail", gmail);
		req.setAttribute("phone", phone);
		RequestDispatcher r=req.getRequestDispatcher("AccountUpdate.jsp");
		r.forward(req, resp);
	}
}
