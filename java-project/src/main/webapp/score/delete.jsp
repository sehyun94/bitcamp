<%@page import="java100.app.domain.Score"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.ScoreDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>


<!DOCTYPE html>
<html>
<head>
<title>성적관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>

</head>
<body>
<div class='container'>
<%
ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(ScoreDao.class);

RequestDispatcher rd = request.getRequestDispatcher("/header");
rd.include(request, response);

try {
    int no = Integer.parseInt(request.getParameter("no"));

    if (scoreDao.delete(no) > 0) {
        out.println("<p>삭제했습니다.</p>");
    } else {
        out.printf("<p>'%d'의 성적 정보가 없습니다.</p>\n", no);
    }

} catch (Exception e) {
    e.printStackTrace(); // for developer
    out.println(e.getMessage()); // for user
            
    rd = request.getRequestDispatcher("/footer");
    rd.include(request, response);
}
%>

<h1>[성적 삭제]</h1>
<p>삭제했습니다.</p>
<p><a href='list.jsp' class='btn btn-primary btn-sm'>목록</a></p>
<footer>
비트캠프 자바100기@2017
</footer>
</div>
<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>
<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>
<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js'></script>
</body>
</html>


