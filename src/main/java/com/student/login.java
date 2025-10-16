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
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession hs=req.getSession();
	String gmail=req.getParameter("UserName");
	String pass=req.getParameter("Password");
	DAO d= new daoMethod();
	
	Student s=new Student();
	s=d.getStudent(gmail, pass);
	if(s!=null) {
	hs.setAttribute("student", s);
	req.setAttribute("message", "Login Successfull");
	RequestDispatcher rd=req.getRequestDispatcher("Dashboard.jsp");
	rd.forward(req, resp);
	}
	else{
		req.setAttribute("Error", "Gmail or password is not maching ");
		RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
		rd.forward(req, resp);
		
	}
	
}

}
