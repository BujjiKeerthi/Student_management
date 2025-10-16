<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <title>My webpage</title>
 <style type="text/css">
    *{
        margin: 0;
        padding: 0;
    }
    body{
        width: 100%;
        height: 100%;
        overflow: hidden;
    }
header,footer{
 height: 100px;
 width: 100%;
 background-color: black;
 color: white;

 text-align: center;
  align-content: center;
}

footer{
position: relative;
top: 100px;
}
.conatiner{
 width: 350px;
 box-shadow: 0px 0px 10px black;
 text-align: center;
 margin: 50px auto;
 border-radius: 10px;
 padding: 10px;
}
label{
 font-size: larger;
}
input{
 margin: 10px;
 width: 250px;
 height: 30px;
 border-top-style: none;
 border-right-style: none;
 border-left-style: none;
 outline: none;
}
#button{
 height: 30px;
 width: 100px;
 border: none;
 border-radius: 10px;
 background-color: blue;
 color: white;
}
#button:active{
 background-color: white;
 color: black;
 border:3px solid black;
}

#red{
color:red;
background:white;
border-radius:20px;
padding:10px;
}
#green{
color:green;
background:white;
border-radius:20px;
padding:10px;
}


 </style>
</head>
<body>

<header>
 <h1>Login Page</h1>
</header>
<main>
<% if(request.getAttribute("message")!=null){ %>

<br>

<center><span id="green"><%=request.getAttribute("message") %></span></center>

<%} %>



<% if(request.getAttribute("mess")!=null){ %>

<br>

<center><span id="green"><%=request.getAttribute("mess") %></span></center>

<%} %>
<%if(request.getAttribute("Error")!=null){ %>
<center><span id="red"><%=request.getAttribute("Error") %></span></center>

<%} %>


 <div class="conatiner">
  <h1>Login</h1>
  <form action="login" method="post">
  <label>Gmail</label><br>
  <input type="text" name="UserName" placeholder="Enter Gmail">
  <br>
  <label>Password</label><br>
  <input type="Password" name="Password" placeholder="Enter Password">
  <br>
         <a href="forgot.jsp">Forgot Password?</a>
         <br><br>
         <input type="submit" id="button">
         <p>Don't have account <a href="sign.jsp">click here</a>
         for signup</p>
      </form>
 </div>
</main>
<footer>
 <h1>&copy; Copy Rights 2025</h1>
</footer>
</body>
</html>