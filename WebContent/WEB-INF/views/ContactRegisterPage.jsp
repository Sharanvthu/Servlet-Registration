<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact Register </title>
<link rel="" href="" >
</head>
<body>

<form action="<%=request.getContextPath() %>/login" method="post">
    <div class="container">
        <div class="LogDetails">
            <p class="Header">ENTER YOUR CONTACT DETAILS </p>
            <div class="Entry">
                    <input class="Name" type="text" placeholder="Enter your Name" name="name">
                    <input class="Number" type="number" placeholder="Enter your Name" name="number">
                    <button class="But-sub">SUBMIT</button>
                   
            </div>
        </div>
    </div>
</form>

</body>
</html>