<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	
	<h3>ContextPath</h3>
	누락: <a href="/hello">hello</a><br>
	정상: <a href='<c:url value="/hello" />'>hello</a><br>
	<hr>
	
	<h3>컨트롤러에서 뷰 지정 생략 시 url을 뷰의 이름으로 사용</h3>
	<a href="lazy">lazy</a>
	<hr>
	
	<h3>클래스 레벨 매핑정보 + 메서드 레벨 매핑정보를 세트로 사용</h3>
	<a href="hello">hello</a><br>
	<a href="hello/one">hello/one</a><br>
	<hr>
	
	<h3>사용자 친화적으로 url을 사용 </h3>
	디아블로 게임/아시아 서버/캐릭터 아이디(@PathVariable로 path를 받아서 연동)<br>
	<a href="diablo/asia/gildong">diablo/asia/gildong</a><br>
	<hr>
	
	<h3>게시판 url 매핑 전략</h3>
	GET 방식의 파라미터 key=value 쌍을 url 매핑전략으로 사용한다.<br>
	value는 생략하고 key만을 매핑전략으로 사용하기도 한다.<br>
	<a href="board?action=list">board?action=list</a><br>
	<hr>
	
	<h3>컨트롤러로부터 뷰에 데이터를 전달할 때 사용하는 객체</h3>
	Model, ModelMap, ModelAndView<br>
	<a href="model/ret_string">model/ret_string.jsp</a><br>
	<a href="model/ret_modelandview">model/ret_modelandview.jsp</a><br>
	<hr>
	
	<h3>로그인 처리</h3>
	<a href="login">login</a><br>
	<hr>
	
	<h3>파라미터 처리</h3>
	<a href="param/test1">param/test1</a> HttpServletRequest<br>
	<a href="param/test2">param/test2</a> @RequestParam<br>
	<a href="param/test3">param/test3</a> @CookieValue<br>
	<a href="param/test6">param/test6</a> @ModelAttribute<br>
	<a href="param/test8">param/test8</a> Validator, BindingResult<br>
	<a href="param/test10">param/test10</a> JSON 문자열로 응답<br>
	<hr>
	
	<h3>SessionAttribute</h3>
	여러 페이지에 걸쳐서 데이터를 POST방식으로 서버가 받아서 마지막에 모아서 처리하고 할 때 사용한다.<br>
	<a href="enroll?action=one">enroll?action=one</a><br>
	<hr>
	
	<h3>예외 처리</h3>
	<a href="none">없는페이지</a> web.xml에 서버 상태코드로 설정<br>
	<a href="divide">0으로 나누기 예외발생</a> 컨트롤러 내 @ExceptionHandler로 설정<br>
	<a href="throw">직접 Exception 발생 시키기</a> web.xml에 예외자료형으로 설정<br>
	<a href="custom_exception">직접 만든 CustomGenericException 발생 시키기</a> root-context.xml에 설정<br>
	<a href="one_exception">직접 만든 OneException 발생 시키기</a> @ControllerAdvice<br>
	<hr>
	
	<h3>AJAX</h3>
	@PostConstruct, @RestController, @JsonView, @RequestBody<br>
	<a href="ajax?sample">ajax?sample</a><br>
</body>
</html>
