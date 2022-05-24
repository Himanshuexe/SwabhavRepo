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
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="studentForm.css">
<script>
	$(document).ready(function() {
		$("#rollNo").onblur(function(e) {
			var rollNo = $('#rollNo').val();

			$.ajax({
				url : "ajax'",
				data : {
					rollNo : rollNo
				},
				type : "POST",
				success : function(result) {
					$("#rollNoError").html("Roll No taken");
				},
				error : function(e) {
					console.log("Something went wrong");
				}
			});
		});
	});
</script>
<title>Add Student</title>
</head>
<body>
	<center>
		<form action="addstudent" method="POST" onsubmit= myValidation(event)>
			<div class="form-group">
				Roll No.:<input type="number" class="form-control" name="rollNo"
					id="rollNo" /><br />
				<p id="rollNoError"></p>
			</div>
			<div class="form-group">
				First name:<input type="text" class="form-control" name="firstName"
					id="firstName" /><br />
			</div>
			<div class="form-group">
				Last name:<input type="text" class="form-control" name="lastName"
					id="lastName" /><br />
			</div>
			<div class="form-group">
				CGPA:<input type="number" step="0.1" class="form-control"
					name="cgpa" id="cgpa" /><br />
			</div>
			<center>
				<input type="submit" class="btn btn-primary" value="add" id="submit" />
			</center>
		</form>
	</center>
	<script type="text/javascript" src="validation.js"></script>
</body>
</html>