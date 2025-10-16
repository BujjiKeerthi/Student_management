package com.student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.student.jdbc.Student;
import com.student.jdbc.dao.DAO;
import com.student.jdbc.dao.daoMethod;

/**
 * Servlet implementation class sign
 */
@WebServlet("/sign")
public class sign extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("UserName");
		String gmail=req.getParameter("gmail");
		String p=req.getParameter("phone");
		long phone=Long.parseLong(p);
		String pass=req.getParameter("Password");
		String cpass=req.getParameter("CPassword");  
		
		Student s=new Student();
		s.setName(name);
		s.setGmail(gmail);
		s.setPhone(phone);
		if(pass.equals(cpass)) {
				s.setPass(cpass);
				DAO d=new daoMethod();
				boolean i=d.insertStudent(s);
				req.setAttribute("message", "SignIn Successfull");
				RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
				rd.forward(req, resp);
			
		}
		else {
			req.setAttribute("error", "Password Mismatch");
			RequestDispatcher rd=req.getRequestDispatcher("sign.jsp");
			rd.forward(req, resp);
			
		}
		
	}
}
