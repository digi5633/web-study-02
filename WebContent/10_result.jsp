<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>직업과 관심분야 선택하기</title>
	</head>
	
	<body>
		당신이 선택한 직업과 관심분야 입니다.<br>
		직업 : ${job}<br>
		관심분야 : ${arrToItems}<br>
		<br><a href='javascript:history.go(-1)'>뒤로가기</a>
	</body>
</html>