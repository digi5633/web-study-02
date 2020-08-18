<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>텍스트 박스에 입력된 값 얻어오기</title>
</head>
<body>
	<form method="get" action="ParamServlet">
		아이디 : <input type="text" name="id"><br>
		나  이 : <input type="text" name="age"><br>
		<input type="submit" name="전송">
	</form>
</body>
</html>