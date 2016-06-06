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

	test3.jsp
	<hr>
	
	auth: ${auth }
	<hr>
	
	아래 처리 결과는 같다. 링크를 거는 다양한 방법을 연습한다.<br>
	
	<a href="test4?auth=007">쿠키저장 링크방법 1</a><br>
	<a href="${pageContext.request.contextPath}/param/test4?auth=007">쿠키저장 링크방법 2</a><br>
	<a href="<c:out value='${pageContext.request.contextPath}'/>/param/test4?auth=007">쿠키저장 링크방법 3</a><br>

</body>
</html>