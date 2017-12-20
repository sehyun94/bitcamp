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
BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
%>
<jsp:include page="/header.jsp"/>

<h1>[게시물 변경]</h1>
<%
try {
    Board board = new Board();
    board.setNo(Integer.parseInt(request.getParameter("no")));
    board.setTitle(request.getParameter("title"));
    board.setContent(request.getParameter("content"));

    if (boardDao.update(board) > 0) { %>
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
