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
RequestDispatcher rd = request.getRequestDispatcher("/header");
rd.include(request, response);
BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
%>
<h1>[게시물 등록]</h1>
<%
try {
    Board board = new Board();
    board.setTitle(request.getParameter("title"));
    board.setContent(request.getParameter("content"));

    boardDao.insert(board);
    out.println("<p>저장하였습니다.</p>");

} catch (Exception e) {
    e.printStackTrace(); // for developer
    out.println(e.getMessage()); // for user
}
%>

<div class='form-group row'>
<div class='col-sm-10'>
<a href='list.jsp' class='btn btn-primary btn-sm'>목록</a>
</div>
</div>

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

