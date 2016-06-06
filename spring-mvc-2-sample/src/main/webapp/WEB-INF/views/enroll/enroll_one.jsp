<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>jAcademy</title>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.map"></script>
	<script type="text/javascript">
		$(function(){
			//alert("jQuery-ready-for-use!")
		});
	</script>
</head>
<body>

	enroll_one.jsp
	<hr>
	
	<form action="enroll?action=two" method="post">
		name: <input type="text" name="name"><br>
		<input type="submit" value="next"><br>
	</form>

</body>
</html>