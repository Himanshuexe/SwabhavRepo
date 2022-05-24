$(document).ready(function() {
	$('.delete').click(function(event) {
		if (confirm("Are you Sure?")) {
			return true;
		} else {
			event.preventDefault();
			return false;
		}
	});
});