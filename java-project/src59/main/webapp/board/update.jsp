<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.List"%>
<%@page import="java100.app.domain.Board"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib  uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<!DOCTYPE html>
<html>
<head>
<title>게시판관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
<body>
<div class='container'>


<jsp:include page="/header.jsp"/>

<h1>[게시물 변경]</h1>

<c:if test="${count > 0}">
            <p>변경하였습니다.</p>
</c:if>
<c:if test="${count == 0}">
    <p>'${param.no}'의 게시물 정보가 없습니다.</p>
</c:if>

<p><a href='list' class='btn btn-primary btn-sm'>목록</a></p>

<jsp:include page="/footer.jsp"/>

</div>

<%@ include file="../jslib.txt" %>
</body>
</html>
