package com.student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.course.jdbc.dto.Course;
import com.course.jsbc.courseDao.CourseDao;
import com.course.jsbc.courseDao.courseDaoImpl;
import com.student.jdbc.paymentDao.paymentDao;
import com.student.jdbc.paymentDao.paymentDaoimpl;
import com.student.jdbc.paymentDto.payment;

/**
 * Servlet implementation class ViewPurchase
 */
@WebServlet("/ViewPurchase")
public class ViewPurchase extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession s= req.getSession();
		int a=Integer.parseInt(s.getId());
		paymentDao p=new paymentDaoimpl();
		Course c=new Course();
		CourseDao cdao=new courseDaoImpl();
		payment pay=new payment();
		pay=p.getPayment(a);
		
		c=cdao.getCourse(pay.getCourseid());
		
		
		
		
	}
}
