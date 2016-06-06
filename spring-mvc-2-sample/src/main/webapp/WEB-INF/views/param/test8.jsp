<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
	<style type="text/css">
		.error {
			color: #ff0000;
		}
	</style>
</head>
<body>

	test8.jsp<br>
	<%-- <spring:message code="required.id"></spring:message> --%>
	<hr>

	<form:form action="test9" method="post" commandName="userLogin">
		<!-- 폼에서 발생하는 모든 에러를 표시한다. -->
		<form:errors path="*" cssClass="error" element="div"/>
		<form:input path="id" /><form:errors path="id" cssClass="error" /><br>
		<form:input path="pw" /><form:errors path="pw" cssClass="error" /><br>
		<input type="submit" value="login"><br>
	</form:form>
</body>
</html>