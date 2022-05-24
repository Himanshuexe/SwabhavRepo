<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Iterator"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Beer Recommendations JSP</h1>
	<p>
		<%
			List styles = (List) request.getAttribute("styles");
		Iterator iterator = styles.iterator();
		while (iterator.hasNext()) {
			out.println("<br>try:" + iterator.next());
		}
		%>
	
</body>
</html>