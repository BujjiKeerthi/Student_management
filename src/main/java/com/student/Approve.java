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

/**
 * Servlet implementation class Approve
 */
@WebServlet("/Approve")
public class Approve extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pid=req.getParameter("payid");
		int Pid=Integer.parseInt(pid);
		String sid=req.getParameter("stid");
		int Sid=Integer.parseInt(sid);
		String cid=req.getParameter("cid");
		
		int Cid=Integer.parseInt(cid);
		String tid=req.getParameter("tid");
		long Tid=Long.parseLong(tid);
		String m=req.getParameter("method");
		String d=req.getParameter("date");
		String p=req.getParameter("path");
		String s=req.getParameter("action");
		System.out.println(Pid);
		payment pay=new payment();
		pay.setPaymentid(Pid);
		pay.setCourseid(Cid);
		pay.setStudentid(Sid);
		pay.setTransactionid(Tid);
		pay.setMethod(m);
		pay.setStatus(s);
		pay.setDate(d);
		pay.setPath(p);
		
		paymentDao pd=new paymentDaoimpl();
		boolean b=pd.upadatePayment(pay);
		
		
		if(b) {
			req.setAttribute("message", "Apporve");
			RequestDispatcher r=req.getRequestDispatcher("Approve.jsp");
			r.forward(req, resp);
			
		}
		else {
			req.setAttribute("message", "Rejected");
			RequestDispatcher r=req.getRequestDispatcher("Approve.jsp");
			r.forward(req, resp);
			
		}
		
	}

}
