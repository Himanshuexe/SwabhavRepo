<%@page import="java.io.OutputStream"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.monocept.model.Image"%>
<%@page import="com.mysql.cj.jdbc.Blob"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		try {
		Image image = (Image) request.getAttribute("image");
		Blob blob = image.getData();
		byte byteArray[] = blob.getBytes(1, (int) blob.length());
		response.setContentType("image/gif");
		OutputStream os = response.getOutputStream();
		os.write(byteArray);
		os.flush();
		os.close();
	} catch (Exception e) {
	}
	%>
	<img alt="img" src="data:image/jpeg;base64,${user.base64imageFile}"/>
</body>
</html>