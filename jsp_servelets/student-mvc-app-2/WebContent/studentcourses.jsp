<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.monocept.model.*"%>
<%@page import="com.monocept.service.*"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int rollNo = Integer.parseInt(request.getParameter("rollNo"));
	List<Student> students;
	StudentService studentService;
	List<Course> courses;
	studentService = StudentService.getInstance();
	Student resultStudent = null;
	students = studentService.getStudents();
	for (Student student : students) {
		if (student.getRollNo() == rollNo)
			resultStudent = student;
	}
	courses = resultStudent.getCourses();
	%>
	<p id="header">
		Found
		<%=courses.size()%>
		courses
	</p>

</body>
</html>