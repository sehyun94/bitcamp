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
RequestDispatcher rd = request.getRequestDispatcher("/header");
rd.include(request, response);
%>


<h1>[회원 변경]</h1>
<%
try {
    PrintWriter out2 = new PrintWriter(out);
    Member member = new Member();
    member.setNo(Integer.parseInt(request.getParameter("no")));
    member.setName(request.getParameter("name"));
    member.setEmail(request.getParameter("email"));
    member.setPassword(request.getParameter("password"));

    if (memberDao.update(member) > 0) {
        out.println("<p>변경하였습니다.</p>");
    } else {
        out2.printf("</p>'%d'번 회원의 정보가 없습니다.</p>\n", member.getNo()); 
    }

} catch (Exception e) {
    e.printStackTrace(); // for developer
    out.println(e.getMessage()); // for user
}
%>
<p><a href='list.jsp' class='btn btn-primary btn-sm'>목록</a></p>

<%
out.flush();
rd = request.getRequestDispatcher("/footer");
rd.include(request, response);
%>
</div>
<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>
<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>
<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js'></script>
</body>
</html>


    