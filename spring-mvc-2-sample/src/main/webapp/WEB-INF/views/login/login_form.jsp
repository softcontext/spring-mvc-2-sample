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

	login_form.jsp
	<hr>
	
	<c:if test="${not empty userId }">
		<c:out value="${userId }" />님 환영합니다.&nbsp;
		<a href="login?action=logout">logout</a>
	</c:if>
	<c:if test="${empty userId }">
		<form action="login?action=login" method="post">
			<input type="text" name="id"><br>
			<input type="password" name="pw"><br>
			<input type="submit" value="login"><br>
		</form>
	</c:if>
	
</body>
</html>