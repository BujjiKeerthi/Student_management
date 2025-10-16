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
 * Servlet implementation class UserRealUpdate
 */
@WebServlet("/UserUpdate1")
public class UserRealUpdate extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Student s=new Student();
	
	DAO d=new daoMethod();
	s.setId(Integer.parseInt(req.getParameter("id")));
	s.setName(req.getParameter("name"));
	s.setGmail(req.getParameter("mail"));
	s.setPhone(Long.parseLong(req.getParameter("phone")));
	String pass=(String)req.getParameter("pass");
	String conf=(String)req.getParameter("Conformpass");
	
	if(pass.equals(conf)) {
		s.setPass(pass);
	}
	
	boolean a=d.updateStudent(s);
	if(a) {
		RequestDispatcher r=req.getRequestDispatcher("UserUpdate.jsp");
		r.forward(req, resp);
	}
	else {
		RequestDispatcher r=req.getRequestDispatcher("AccountUpdate.jsp");
		r.forward(req, resp);
	}
	
	
	
}

}
