<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="Style.css">
<title>My Profile</title>
</head>
<body>
<h1>Welcome to Mini Care</h1>
<div class="middle3">
<span class="button1"><a href="JobSearch.jsp">Job Search</a></span> 
<span class="button1"><a href="MyProfile.jsp">My Profile</a></span> 
<br/>
<br/>
</div>
<div class="middle">
<form action="" method="post">
<p>First Name</p>
<input type="text" name="fname" value="aa" required/>
<br/>
<p>Last Name</p>
<input type="text" name="lname" value="bb" required/>
<br/>
<p>Email</p>
<input type="email" name="ID" value="a@a.com" readonly/>
<br/>
<p>Password</p>
<input type="password" name="pwd" value="aaa" required/>
<br/>
<p>Profile Title</p>
<input type="text" name="ptitle" value=""/>
<br/>
<p>Description</p>
<textarea name="pdesc"></textarea>
<br/>
<p>Phone Number</p>
<input type="text" name="phno" value="123" required/>
<br/>
<p>Zip Code</p>
<input type="text" name="zip" value="56023" required/>
<br/>
<br/>
<input type="submit" value="Register"/>
<input type="reset" value="Reset"/>
</form>
</div>
</body>
</html>