<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <title>My webpage</title>
 <meta http-equiv="Cache-Control" content="no-store" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="0" />
 
 <style type="text/css">
    *{
        margin: 0;
        padding: 0;
        scrollbar-width: 0px;
    }
    body{
        width: 100%;
        height: 100%;
        scrollbar-width: 0px;
        
       
    }
header,footer{
 height: 70px;
 width: 100%;
 background-color: black;
 color: white;
 
 text-align: center;
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
p{
color:red}

 </style>
</head>
<body>
<header>
 <h1>Sign In Page</h1>
</header>
<main>
 <div class="conatiner">
  <h1>SignIn</h1>
  <br>
  <form action="sign" method="post">
  <label>Name</label><br>
  <input type="text" name="UserName" placeholder="Enter Username">
  <br>
  <label>Gmail</label><br>
  <input type="mail" name="gmail" placeholder="Enter the Gmail">
  <br>
   <label>Phone No</label><br>
  <input type="number" name="phone" placeholder="Enter the Phone Number">
  <br>
  
  <label>Password</label><br>
  <input type="Password" name="Password" placeholder="Enter Password">
  <br>
   <label>Conform password</label><br>
  <input type="Password" name="CPassword" placeholder="Enter Conform Password">
  <br>
 <%String a=" ";
 String s=(String)request.getAttribute("error"); %>
 <%if(s !=null){%>
 <p><%=s %></p>
 <%} else{%>
 
 <p><%=a %></p>	
 <%} %>
         <input type="submit" id="button">
         <p>If you have account <a href="login.jsp">click here</a>
         for login</p>
      </form>
 </div>
</main>
<footer>
 <h1>&copy; Copy Rights 2025</h1>
</footer>
</body>
</html>