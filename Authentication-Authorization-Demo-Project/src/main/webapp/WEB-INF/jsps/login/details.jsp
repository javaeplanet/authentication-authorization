<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details Page</title>
</head>
<body>
<h2>Student Details:</h2>
<form action="saveStudentDetails" method="post">
<pre>
Student Name:<input type="text" name="studentName"><br>
Student Marks:<input type="text" name="studentMarks"><br>
Student Conduct:<input type="text" name="studentConduct"><br>
Percentage:<input type="text" name="percentage"><br>
Grade:<input type="text" name="grade"><br>
</pre>
<input type="submit" value="save">
</form>
</body>
</html>