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

<h1>[게시물 목록]</h1>
<p><a href='form.jsp' class='btn btn-primary btn-sm'>추가</a></p>
<table class='table table-hover'>
<thead>
<tr>
<th>번호</th><th>제목</th><th>등록일</th><th>조회수</th>
</tr>
</thead>
<tbody>

<%
try {

    List<Board> list = boardDao.selectList();
    PrintWriter out2 = new PrintWriter(out);
    for (Board board : list) {
        out2.printf("<tr><td>%d</td><td>"
                + "<a href='view.jsp?no=%d'>%s</a>"
                + "</td><td>%s</td><td>%-5d</td></tr>\n",
                board.getNo(),
                board.getNo(),
                board.getTitle(), 
                board.getRegDate(),
                board.getViewCount());
    }

} catch (Exception e) {
    e.printStackTrace(); // for developer
    out.println(e.getMessage()); // for user

}
%>

</tbody>
</table>
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


