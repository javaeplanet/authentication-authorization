<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Student Details:</h2>
<table border="1">
<tr>
<th>Student Name</th>
<th>Student Marks</th>
<th>Student Conduct</th>
<th>Percentage</th>
<th>Grade</th>

</tr>
<c:forEach items="${studentDetails}" var="details">
<tr>
<td>${{details.studentName}}</td>
<td>${{details.studentMarks}}</td>
<td>${{details.studentConduct}}</td>
<td>${{details.percentage}}</td>
<td>${{details.grade}}</td>
</tr>
</c:forEach>
</table>
</body>
</html>