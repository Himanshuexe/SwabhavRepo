<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.monocept.model.Student"%>
<%@page import="com.monocept.dto.UserDTO"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="home.css">
<title>Home</title>
</head>
<body>
	<%
		List<Student> students = (List) request.getAttribute("data");
	%>
	<p id="header">
		Found
		<%=students.size()%>
		students <span id="user"> <%
 	UserDTO user = (UserDTO) session.getAttribute("user");
 if (user == null) {
 	out.println("Guest User  <a href=" + "\"login\"" + ">login</a>");
 } else {
 	out.println(user.getName() + " <a href=" + "\"logout\"" + ">logout</a>");
 }
 %>
		</span>
	</p>
	<table class="table table-striped">
		<tr>
			<th>Roll No.</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>CGPA</th>
			<th>Courses</th>
			<th></th>
			<th></th>
		</tr>
		<%
			for (Student student : students) {
			out.println("<tr><td>" + student.getRollNo() + "</td><td>" + student.getFirstName() + "</td><td>"
			+ student.getLastName() + "</td><td>" + student.getCgpa() + "</td><td><a href=" + " \" courses?rollNo="
			+ student.getRollNo() + "\">courses</a></td><td><a href=" + " \" editstudent?rollNo=" + student.getRollNo()
			+ "\">edit</a></td><td><a class=" + "\"delete\"" + " href=" + "\"deletestudent?rollNo="
			+ student.getRollNo() + "\">delete</a></td></tr>");
		}
		%>
	</table>
	<center>
		<a href="addstudent">
			<button type="button" class="btn btn-light" href="/addstudent">Add
				Student</button>
		</a>
	</center>
	<script src="home.js"></script>
</body>
</html>