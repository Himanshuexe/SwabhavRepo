<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.monocept.model.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<table class="table table-striped">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Department</th>
			<th>College Id</th>
		</tr>
		<%
			Student student = (Student) request.getAttribute("data");
		out.println("<tr><td>" + student.getId() + "</td><td>" + student.getName() + "</td><td>" + student.getDept()
				+ "</td><td>" + student.getCollegeId() + "</td></tr>");
		%>
	</table>
</body>
</html>