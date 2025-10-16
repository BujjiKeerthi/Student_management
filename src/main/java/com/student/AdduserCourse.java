package com.student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.student.jdbc.paymentDao.paymentDao;
import com.student.jdbc.paymentDao.paymentDaoimpl;
import com.student.jdbc.paymentDto.payment;
import com.student.jdbc.testPay.TransactionID;

/**
 * Servlet implementation class AdduserCourse
 */
@WebServlet("/AdduserCourse")
public class AdduserCourse extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sid=(String)req.getParameter("sid");
		String cid=(String)req.getParameter("cid");
		int s=Integer.parseInt(sid);
		int c=Integer.parseInt(cid);
		String method =(String)req.getParameter("paymentMode");	
		
		payment pay=new payment();		
		
		pay.setStudentid(s);
		pay.setCourseid(c);
		pay.setTransactionid(TransactionID.transaction());
		pay.setMethod(method);
		pay.setPath("non");
		paymentDao p=new paymentDaoimpl();
		boolean b=p.insertPayment(pay);
		if(b) {
			RequestDispatcher r =req.getRequestDispatcher("AddUserCourse.jsp");
			r.forward(req, resp);
		}
		else {
			RequestDispatcher r =req.getRequestDispatcher("UserCourseAdd.jsp");
			r.forward(req, resp);
		}
	}

}
