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
color:red;
text-align: center;
font-size: 20px;
background-color: white;
padding:10px;
}

button{
padding:10px;
border-radius: 10px;
background-color: blue;
border:none;
color:white;

}

 </style>
</head>
<body>
<%
%>
<header>
 <h1>Update Course</h1>
</header>
<main>

<%String i= (String)request.getAttribute("id");
String name=(String)request.getAttribute("name");
String Gmail=(String)request.getAttribute("gmail");
String phone=(String)request.getAttribute("phone");




%>>

 <div class="conatiner">
  <h1>Update User</h1>
  <br>
  <form action="UserUpdate1" method="post">
  <label>ID</label><br>
  <input type="number" name="id" placeholder="Enter ID" value=<%=i%> readonly >
  <br>
   <label>Name</label><br>
  <input type="text" name="name" placeholder="Enter ID" value=<%=name%>  >
  <br>
   <label>Gmail</label><br>
  <input type="mail" name="mail" placeholder="Enter ID" value=<%=Gmail%> readonly >
  <br>
   <label>Phone</label><br>
  <input type="number" name="phone" placeholder="Enter ID" value=<%=phone%>  >
  <br>
  <label>Password</label><br>
  <input type="password" name="pass" placeholder="Enter Password" >
  <br>
  <label>Conform Password</label><br>
  <input type="password" name="Conformpass" placeholder="Enter Conform Password" >
  <br>
 
         <button type="submit">Update Course</button>
         
      </form>
 </div>
</main>

</body>
</html>