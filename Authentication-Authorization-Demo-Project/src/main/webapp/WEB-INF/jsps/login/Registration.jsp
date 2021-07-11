<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
<h1>Student Details:</h1>
<form action="saveStudent" method="post">
<pre>
SNAME:<input type="text" name="sname"><br>
SCLASS:<input type="text" name="sclass"><br>
Email:<input type="text" name="email"><br>
PASSWORD:<input type="password" name="password"><br>
PHONENUMBER:<input type="text" name="phoneNumber"><br>
COLLEGENAME:<input type="text" name="collegeName"><br>
<input type=submit value="register">
</pre>
</form>

</body>
</html>