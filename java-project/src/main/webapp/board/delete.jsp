<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.List"%>
<%@page import="java100.app.domain.Board"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>



<!DOCTYPE html>
<html>
<head>
<title>게시판관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
<body>
<div class='container'>

<%
out.flush();
RequestDispatcher rd = request.getRequestDispatcher("/header");
rd.include(request, response);
BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
%>

<h1>[게시물 삭제]</h1>

<%
try {
    PrintWriter out2 = new PrintWriter(out);
    int no = Integer.parseInt(request.getParameter("no"));
    
    if (boardDao.delete(no) > 0) {
        out.println("<p>삭제했습니다.</p>");
    } else {
        out2.printf("<p>'%s'번의 게시물 정보가 없습니다.</p>\n", no); 
    }
    
} catch (Exception e) {
    e.printStackTrace(); // for developer
    out.println(e.getMessage()); // for user
}
%>

<p><a href='list.jsp' class='btn btn-primary btn-sm' >목록</a></p>

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
