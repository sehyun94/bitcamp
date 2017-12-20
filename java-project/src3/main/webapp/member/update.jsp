<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.List"%>
<%@page import="java100.app.domain.Member"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.MemberDao"%>
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

<%
MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);
%>
<jsp:include page="/header.jsp"/>


<h1>[회원 변경]</h1>
<%
try {
    Member member = new Member();
    member.setNo(Integer.parseInt(request.getParameter("no")));
    member.setName(request.getParameter("name"));
    member.setEmail(request.getParameter("email"));
    member.setPassword(request.getParameter("password"));

    if (memberDao.update(member) > 0) { %>
        <p>변경하였습니다.</p>
        
    <%
    }
} catch (Exception e) {
    e.printStackTrace();  %>

<%=e.getMessage()%>
<% }  %>
<p><a href='list.jsp' class='btn btn-primary btn-sm'>목록</a></p>

<jsp:include page="/footer.jsp"/>
</div>

<%@ include file="../jslib.txt" %>
</body>
</html>


    