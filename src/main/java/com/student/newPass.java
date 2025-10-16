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
 * Servlet implementation class newPass
 */
@WebServlet("/newPass")
public class newPass extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession s = req.getSession(false);
		String pass = req.getParameter("pass");
		String confpass = req.getParameter("conform");

		Student gmail = (Student) s.getAttribute("student");

		if (pass.equals(confpass)) {
			DAO d = new daoMethod();
			if (gmail != null) {
				gmail.setPass(confpass);
				boolean i = d.updateStudent(gmail);
				if (i) {
					req.setAttribute("mess", "Updated Successfully!");
					RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
					rd.forward(req, resp);
				} else {
					req.setAttribute("mess", "Failed!");
					RequestDispatcher rd = req.getRequestDispatcher("newPass.jsp");
					rd.forward(req, resp);

				}
			}

			s.invalidate();
			System.out.println("Session ended");
		}

	}

}
