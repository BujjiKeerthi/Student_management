
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
color:red}

 </style>
</head>
<body>
<header>
 <h1>Add Course</h1>
</header>
<main>
 <div class="conatiner">
  <h1>Add Course</h1>
  <br>
  <form action="Course" method="post">
  <label>Name</label><br>
  <input type="text" name="Name" placeholder="Enter Coursename">
  <br>
  <label>Info</label><br>
  <input type="text" name="info" placeholder="Enter the CourseInfo">
  <br>
   <label>Month</label><br>
  <input type="number" name="month" placeholder="Enter the Month">
  <br>
  
  <label>Fee</label><br>
  <input type="number" name="fee" placeholder="Enter Fee">
  <br>

 
         <input type="submit" id="button" value="ADD COURSE">
         
      </form>
 </div>
</main>

</body>
</html>