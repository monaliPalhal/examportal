<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "info.vinod.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login page</title>
</head>

<body> 

    <!-- Give Servlet reference to the form as an instances  
    GET and POST services can be according to the problem statement-->
    <form action = 'try.jsp'method="post"> 
        <p>username:</p>  
        <!-- Create an element with mandatory name attribute, 
        so that data can be transfer to the servlet using getParameter() -->
        <input type="text" name="username"> 
        <br/> 
        <p>password:</p>  
        <input type="password" name="password"> 
        <br/><br/><br/> 
        <button type="submit" name ="submit">submit</button>
        <button type="reset" '<jsp:forward page="login1.html"></jsp:forward>'>reset</button>
         
    </form> 
</body>
</html>