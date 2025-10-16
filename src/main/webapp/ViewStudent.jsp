<%@page import="com.student.jdbc.dao.DAO"%>
<%@page import="com.student.jdbc.dao.daoMethod"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.student.jdbc.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
    height: 70px;
    width: 100%;
    text-align: center;
	line-height:70px;
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
            <% if(st.getId()==1) {%>
            <div class="nav">
                <ul class="nav-list1">
                   <li><a href="ViewStudent.jsp">View All Student</a></li>
                    <li><a href="DeleteUser.jsp">Delete User</a></li>
                    <li><a href="AddCourse.jsp">Add Course</a></li>
                     <li><a href="Update.jsp">Update Course</a></li>
                      <li><a href="DeleteCourse.jsp">Delete Course</a></li>
                    <li><a href="ViewPayment.jsp">View Payment</a></li>
                    <li><a href="Approve.jsp">Approve Payment</a></li>
                </ul>
            </div>
        </div>
        <div class="page">
                <div class="p1">
                    <div class="login">
                        <h4>login Successfull!</h4>
                    </div>
                    <div class="log">
                        <h4>Welcome <%=st.getName() %></h4>

                    </div>
                </div>
                <div class="footer">
                  <%ArrayList<Student> a=new ArrayList<>();
                  DAO d=new daoMethod();
                  a=d.getStudent();
                  if (a != null && a.size()>1) { 
                  %>
                      <table border="1">
                          <tr>
                              <th>ID</th>
                              <th>Name</th>
                              <th>Gmail</th>
                              <th>Phone</th>
                          </tr>

                          <% 
                          for (Student stud : a) { 
                              if (stud.getId() > 1) { 
                          %>
                              <tr>
                                  <td><%= stud.getId() %></td>
                                  <td><%= stud.getName() %></td>
                                  <td><%= stud.getGmail() %></td>
                                  <td><%= stud.getPhone() %></td>
                              </tr>
                          <% 
                              } 
                          } 
                          %>
                      </table>
                      </div>
                  <% 
                  } else { 
                  %>
                      <div >
                          Student Not found
                      </div>
                      <%} 
                      }
                      %>
                      
                  
                  
                  
                  </div>
                 

                  
             
                
            </div>
</body>
</html>