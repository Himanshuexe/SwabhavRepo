function myValidation(event) {
	var rollNo = document.querySelector("#rollNo").value;
	var firstName = document.querySelector("#firstName").value;
	var lastName = document.querySelector("#lastName").value;
	var cgpa = document.querySelector("#cgpa").value;
	const pass = false;
	// event.preventDefault();
	if (rollNo.length == 0) {
		event.preventDefault();
		alert("Enter a Roll No.");
		pass = false;
		returnToPreviousPage();
		return pass;
	}
	if (firstName.length == 0) {
		event.preventDefault();
		alert("Enter Firstname");
		pass = false;
		returnToPreviousPage();
		return pass;
	}
	if (lastName.length == 0) {
		event.preventDefault();
		alert("Enter Lastname");
		pass = false;
		returnToPreviousPage();
		return pass;
	}
	if (cgpa.length == 0) {
		event.preventDefault();
		alert("Enter cgpa");
		pass = false;
		returnToPreviousPage();
		return pass;
	} else {
		pass = true;
		// form.submit();
		alert("hi");
		return pass;
	}
}