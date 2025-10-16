<%@page import="java.util.HashSet"%>
<%@page import="com.student.jdbc.paymentDao.paymentDaoimpl"%>
<%@page import="com.student.jdbc.paymentDao.paymentDao"%>
<%@page import="com.course.jdbc.dto.Course"%>
<%@page import="com.course.jsbc.courseDao.courseDaoImpl"%>
<%@page import="com.course.jsbc.courseDao.CourseDao"%>
<%@page import="com.student.jdbc.paymentDto.payment"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.student.jdbc.dao.DAO"%>
<%@page import="com.student.jdbc.dao.daoMethod"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.student.jdbc.Student"%>

<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<style>
    *{
    padding: 0px;
    margin: 0px;
}
body{
    overflow: hidden;
}
 
.nav-bar{
    background-color: #343a40;
    color: white;
    padding: 50px;
    width: 20%;
    height: 90vh;
    display: flex;
    flex-direction: column;
   align-items: center;
   
}

.nav-list  li{
    list-style: none;
    height: 60px;
    width: 100%;
    text-align: center;
	line-height:60px;
    scrollbar-width: none;
    padding: 10px;
    cursor: pointer;
    
    
}
.nav-list  li:hover{
border-radius:10px;
background-color:#080808;
cursor: pointer;
;

}
.photo img{
    border-radius:50%;
    width: 180px;

}
.photo{
    text-align: center;
    padding: 40px;
    scroll-behavior: smooth;
    -ms-overflow-style: none;
    line-height: 20px;

}
.nav-list  li a{
    text-decoration: none;
    color: white;
    font-family: Arial, Helvetica, sans-serif;

}

.nav-list li a:hover{
    color: beige;
    
}
.nav-list1  li a{
    text-decoration: none;
    color: white;
    font-family: Arial, Helvetica, sans-serif;

}

.nav-list1 li a:hover{
    color: beige;
    
}
.nav-list1  li{
    list-style: none;
    height: 30px;
    width: 100%;
    text-align: center;
	line-height:30px;
    scrollbar-width: none;
    padding: 10px;
    cursor: pointer;
    
    
}
.nav-list1  li:hover{
border-radius:10px;
background-color:#080808;
cursor: pointer;
;

}

.cont{
    display: flex;
}
.page {
            width: 100%;
            margin: 30px 0px 0px 0px;


        }

        .login {
            margin: 0px;
            margin-left:30px;
            background: linear-gradient(90deg, #1B5E20, #d8e0d9);
            color: #E0F2F1;
            line-height: 50px;
            width: 60vw;
            height: 50px;

        }
        .login h4{
        margin-left: 10px;
        }

        .log {
            height: 50px;
            line-height: 50px;
        }
.error{
color: red;
}
.footer {
            margin: 0px;
            display:flex;
            justify-content:center;
            align-items:center;
            margin-left: 50px;
            background: linear-gradient(135deg, #0D0D0D, #628b86);
            color: #E0F2F1;
            width: 80%;
            height:80vh;
            border-radius: 50px;
            margin-top: 20px;
            
        }
        .footer1{ 
        	margin: 0px;
            display:flex;
            justify-content:center;
            align-items:center;
            margin-left: 50px;
            background: linear-gradient(135deg, #0D0D0D, #628b86);
            color: #E0F2F1;
            width: 80%;
            height:80vh;
            border-radius: 50px;
            margin-top: 20px;
        }

        .footer button{
            padding: 30px;
            border:none;
            border-radius: 20px
        }
        .footer button:hover{
        cursor: pointer; 
        
        }
        .p1{
            display: flex;
            justify-content: space-between;
        }
        
        
        .log h4{
        margin-right: 10px;
        }
        table tr,td,th{
        padding:10px;
        }
   </style>
<body>
<%HttpSession s=request.getSession(); %>
<%Student st=(Student)s.getAttribute("student") ;%>
    <div class="cont">
        <div class="nav-bar">
            <div class="photo">
                <img src="image.jpg" alt="User Photo" class="user-photo">
                <h4><%=st.getName() %></h4>
            </div>
                   <div class="nav">
                <ul class="nav-list">
                    <li><a href="ViewPurchase.jsp">View Purchased</a></li>
                    <li><a href="AddUserCourse.jsp">Add Course</a></li>
                    <li><a href="ViewAccountStudent.jsp">View Account</a></li>
                    <li><a href="UserUpdate.jsp">Update Account</a></li>
                    <li><a href="PaymentStatus.jsp">Payment And Status</a></li>
                </ul>
            </div>
        </div>
         <div class="page">
                <div class="p1">
                    
                    
                </div>
                <div class="footer">
                     <%payment p=new payment();
                     ArrayList <payment>a=new ArrayList();
                     paymentDao pay=new paymentDaoimpl();
                     CourseDao cd=new courseDaoImpl();
                     HashSet <Integer> h=new HashSet<>();
                     a=pay.getPayment();
						for(payment pa:a){
							Course c=new Course();
							c=cd.getCourse(pa.getCourseid());
							if(h.contains(pa.getCourseid())){
								%>
								
								<h1 style="color:red">Error !! already course exits</h1>
								<% continue;
							}
							else{
								h.add(pa.getCourseid());
							}
							
							if(pa.getStatus().equalsIgnoreCase("pending")){
								%>
								<pre><%= 
								"your course is still under the approval of admin"
								%></pre>
								
							
						
                   
                     
                  <% } else if(pa.getStatus().equalsIgnoreCase("failed")) {%>
                  
                  	<p><%="Something went Wrong"  %></p>
                  
						<%}
                  else{%>
                  <%=c %>
                	  
                	  <%
                  }
						}
						
                  %>
            </div>
        </div>
    </div>
</body>
</html>

     

    

    
</body>
</html>