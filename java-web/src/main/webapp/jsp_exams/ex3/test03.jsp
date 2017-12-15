<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
<h1>표현식 (expression element ) 테스트II</h1>
<%int age =18;%>
나이<%= age %>는 <%= (age < 19) ? "미성년" : "성년" %> 입니다.

</body>
</html>






