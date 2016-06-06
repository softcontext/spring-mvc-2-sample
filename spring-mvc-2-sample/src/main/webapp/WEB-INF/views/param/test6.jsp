<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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

	test6.jsp
	<hr>

	<c:forEach var="h" items="${hobbies }">
		<c:out value="${h }" /><br>
	</c:forEach>
	<hr>
	
	<form action="test7" method="post">
		<input type="text" name="id"><br>
		<input type="password" name="pw"><br>
		<input type="submit" value="login"><br>
	</form>

</body>
</html>