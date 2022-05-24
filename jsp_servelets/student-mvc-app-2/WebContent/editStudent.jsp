<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.monocept.model.*"%>
<%@page import="com.monocept.service.*"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<link rel="stylesheet" href="studentForm.css">
<title>Edit Student Details</title>
</head>
<body>
	<%
		int rollNo = Integer.parseInt(request.getParameter("rollNo"));
	List<Student> students;
	StudentService studentService;
	studentService = StudentService.getInstance();
	Student resultStudent = null;
	students = studentService.getStudents();
	for (Student student : students) {
		if (student.getRollNo() == rollNo)
			resultStudent = student;
	}
	%>
	<center>
		<form action="editstudent" method="POST"
			onsubmit="myValidation(event);">
			<div class="form-group">
				Roll No.:<input type="number" class="form-control" name="rollNo"
					id="rollNo" value=<%=resultStudent.getRollNo()%> /><br />
			</div>
			<div class="form-group">
				First name:<input type="text" class="form-control" name="firstName"
					id="firstName" value=<%=resultStudent.getFirstName()%> /><br />
			</div>
			<div class="form-group">
				Last name:<input type="text" class="form-control" name="lastName"
					id="lastName" value=<%=resultStudent.getLastName()%> /><br />
			</div>
			<div class="form-group">
				CGPA:<input type="number" step="0.1" min="0" class="form-control"
					name="cgpa" id="cgpa" value=<%=resultStudent.getCgpa()%> /><br />
			</div>
			<center>
				<input type="submit" class="btn btn-primary" value="update"
					id="submit" />
			</center>
		</form>
	</center>
	<script src="validation.js"></script>
</body>
</html>