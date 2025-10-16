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
#h1{
    margin: 0 auto;
}

 </style>
</head>
<body>
<header>
 <h1 id="h1">New Password Page</h1>
</header>
<main>
 <div class="conatiner">
  <form action="newPass" method="post">
  <h1>New Password</h1>
  <br>	
 
  <label>Password</label><br>

  <input type="password" name="pass" placeholder="Enter the password">
  <br>
   <label>Conform Password</label><br>
  <input type="password" name="conform" placeholder="Enter the Password">
  <br>
  
  <input type="submit" id="button">
  </form>
 </div>
</main>
<footer>
 <h1>&copy; Copy Rights 2025</h1>
</footer>
</body>
</html>