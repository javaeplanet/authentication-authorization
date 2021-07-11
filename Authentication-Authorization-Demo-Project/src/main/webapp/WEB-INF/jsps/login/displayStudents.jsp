<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Students List:</h2>
<table>
<tr>
<th>Student No</th>
<th>Student Name</th>
<th>Student class</th>
<th>Student Email</th>
<th>Password</th>
<th>College Name</th>
</tr>
<c:forEach items="${students}" var="student">
<tr>
<td>${student.sno}</td>
<td>${student.sname }</td>
<td>${student.sclass}</td>
<td>${student.collegeName}</td>
</tr>
</c:forEach>
</table>
</body>
</html>