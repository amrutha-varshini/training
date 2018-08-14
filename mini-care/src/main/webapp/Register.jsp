<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="Style.css">
<title>Register</title>
</head>
<body>
<h1>Welcome to Mini Care</h1>
<div class="middle">
<form action="" method="post">
<p>First Name</p>
<input type="text" name="fname" required/>
<br/>
<p>Last Name</p>
<input type="text" name="lname" required/>
<br/>
<p>Email</p>
<input type="email" name="ID" required/>
<br/>
<p>Password</p>
<input type="password" name="pwd" required/>
<br/>
<p>Phone Number</p>
<input type="text" name="phno" required/>
<br/>
<p>Zip Code</p>
<input type="text" name="zip" required/>
<br/>
<br/>
<input type="submit" value="Register"/>
<input type="reset" value="Reset"/>
</form>
</div>
</body>
</html>