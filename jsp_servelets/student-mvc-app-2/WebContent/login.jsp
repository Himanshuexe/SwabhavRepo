<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<title>Login</title>
</head>
<body>
	<center>
		<form action="login" method="POST">
			<div class="form-group">
				Login Id:<input type="number" class="form-control" name="loginId"
					id="loginId" /><br />
			</div>
			<div class="form-group">
				Password:<input type="password" class="form-control" name="password"
					id="password" /><br />
			</div>
			<center>
				<input type="submit" class="btn btn-primary" value="login"
					id="submit" />
			</center>
		</form>
	</center>
</body>
</html>