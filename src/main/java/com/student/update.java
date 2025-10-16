package com.student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.student.jdbc.Student;
import com.student.jdbc.dao.DAO;
import com.student.jdbc.dao.daoMethod;

/**
 * Servlet implementation class update
 */
@WebServlet("/update")
public class update extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession s = req.getSession(true);
		String gmail = req.getParameter("gmail");
		String p = req.getParameter("phone");
		long phone = Long.parseLong(p);
		Student st = new Student();
		DAO d = new daoMethod();
		st = d.getStudent(phone, gmail);

		if (st != null) {
			s.setAttribute("student", st);
			RequestDispatcher rd = req.getRequestDispatcher("newPass.jsp");
			rd.forward(req, resp);

		}
		else {
			req.setAttribute("mess", "User Not Found");
			RequestDispatcher rd = req.getRequestDispatcher("forgot.jsp");
			rd.forward(req, resp);
			
		}
	}

}
