package com.student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.student.jdbc.Student;
import com.student.jdbc.dao.DAO;
import com.student.jdbc.dao.daoMethod;

/**
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String a=req.getParameter("Gmail");
		String p=req.getParameter("Phone");
		long Phone=Long.parseLong(p);
		DAO d=new daoMethod();
		Student s=new Student();
		s=d.getStudent(Phone, a);
		
		boolean b=d.deleteStudent(s);
		if(b) {
			
			RequestDispatcher rd=req.getRequestDispatcher("DeleteUser.jsp");
			rd.forward(req, resp);
		}
		else {
			
		}
		
	}
}
