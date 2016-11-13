<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="Plugins/jquery-3.1.0.js"></script>
<script>
	$(document).ready(function() {
		$("h1").after("<h2>I'm Bad</h1>");
	})
</script>
</head>
<body>
	<h1>hello world!</h1>
	<form>
		<input id="condition" name="condition" />
		<input type="button" id="submit" />
	</form>
	<div id="context"></div>
	<script type="text/javascript">
		$("#submit").on("click", function() {
			$.ajax({
				url: "search.do",
				type: "GET",
				data: "condition=" + $("#condition").val(),
				dataType: "json",
				success: function(data) {
					$.each(data[0], function(i, temp) {
						$("#context").append(i + temp.userName + "<br />");
						
					})
				}
			})
		})
	</script>
	<h1>helloGit</h1>
</body>
</html>