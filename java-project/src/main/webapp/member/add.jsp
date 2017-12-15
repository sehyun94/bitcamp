<%@page import="java100.app.domain.Member"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<% MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class); %> 
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

<%
try {

    Member member = new Member();
    member.setName(request.getParameter("name"));
    member.setEmail(request.getParameter("email"));
    member.setPassword(request.getParameter("password"));
    memberDao.insert(member);  %>

    <p>저장하였습니다.</p>
<%
} catch (Exception e) {
    e.printStackTrace(); %> 
    <%= e.getMessage() %> 
    <% } %>

<p><a href='list.jsp' class='btn btn-primary btn-sm'>목록</a></p>
</div>
<jsp:include page="/footer.jsp"/>



<%@ include file="../jslib.txt" %>
</body>
</html>
    