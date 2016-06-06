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
			//쿠키 값을 바로 확인하기 위해 재 로드한다.
			window.onload = function() {
			    if(!window.location.hash) {
			        window.location = window.location + '#loaded';
			        window.location.reload();
			    }
			};
		});
	</script>
</head>
<body>

	test4.jsp
	<hr>

	쿠키로 저장 된 값: ${cookie.auth.value }
	<hr>
	
	<a href="${pageContext.request.contextPath}/param/test5">쿠기 삭제</a>
	

</body>
</html>