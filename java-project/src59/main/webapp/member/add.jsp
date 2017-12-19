<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<!DOCTYPE html>
<html>
<head>
<title>회원관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
<body>
<div class='container'>

<h1>[회원 등록]</h1>

<jsp:include page="/header.jsp"/>

    <p>저장하였습니다.</p>

<p><a href='list' class='btn btn-primary btn-sm'>목록</a></p>
</div>
<jsp:include page="/footer.jsp"/>



<%@ include file="../jslib.txt" %>
</body>
</html>
    