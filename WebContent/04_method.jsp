<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>get과 post 전송 방식의 폼과 서블릿 테스트</title>
</head>
<body>
	<form method="get" action="MethodServlet">
		<input type="submit" value="get 방식으로 호출하기">
	</form>
	<br><br>
	<form method="get" action="MethodServlet">
		<input type="submit" value="post 방식으로 호출하기">
	</form>
</body>
</html>
