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
RequestDispatcher rd = request.getRequestDispatcher("/header");
rd.include(request, response);
BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
%>


<h1>[게시물 상세 정보]</h1>

<%
try {
    PrintWriter out2 = new PrintWriter(out);
    int no = Integer.parseInt(request.getParameter("no"));
    Board board = boardDao.selectOne(no);

    if (board != null) {
        
        out.println("<form action='update.jsp' method='post'>");
        out.println("<div class='form-group row'>");
        out.println("<label class='col-sm-2 col-form-label col-form-label-sm' for='no'>번호</label>");
        out.println("<div class='col-sm-10'>");
        out2.printf("<input class='form-control' readonly id='no' type='number' name='no' value='%d'>\n", 
                    board.getNo());
        out.println("</div>");
        out.println("</div>");
        
        out.println("<div class='form-group row'>");
        out.println("<label  class='col-sm-2 col-form-label col-form-label-sm' for='title'>제목</label>");
        out.println("<div class='col-sm-10'>");
        out2.printf("<input  class='form-control' id='title' type='text' name='title' value='%s'>\n", 
                    board.getTitle());
        out.println("</div>");
        out.println("</div>");
        
        out.println("<div class='form-group row'>");
        out.println("<label  class='col-sm-2 col-form-label col-form-label-sm' for='content'>내용</label>");
        out.println("<div class='col-sm-10'>");
        out2.printf("<input class='form-control' id='content' type='text' name='content' value='%s'>\n", 
                    board.getContent());
        out.println("</div>");
        out.println("</div>");
        
        out.println("<div class='form-group row'>");
        out.println("<label class='col-sm-2 col-form-label col-form-label-sm' for='date'>등록일</label>");
        out.println("<div class='col-sm-10'>");
        out2.printf("<input class='form-control' readonly id='date' type='text' name='date' value='%s'>\n", 
                    board.getRegDate());
        out.println("</div>");
        out.println("</div>");
        
        out.println("<div class='form-group row'>");
        out.println("<label class='col-sm-2 col-form-label col-form-label-sm' for='viewCount'>조회수</label>");
        out.println("<div class='col-sm-10'>");
        out2.printf("<input class='form-control' readonly id=' viewCount' type='text' name='viewCount' value='%d'>\n", 
                    board.getViewCount());
        out.println("</div>");
        out.println("</div>");
        
                        
        out.println("<div class='form-group row'>");
        out.println("<div class='col-sm-10'>");
        out.println("<button class='btn btn-primary btn-sm'>변경</button>");
        out2.printf("<a href='delete.jsp?no=%d' class='btn btn-primary btn-sm'>삭제</a>\n",board.getNo());
        out.println("</form>");
       
        out.println("</div>");
        out.println("</div>");
        
        
        
    } else {
        out2.printf("<p>'%s'번의 게시물 정보가 없습니다.</p>\n", no);
    }

} catch (Exception e) {
    e.printStackTrace(); // for developer
    out.println(e.getMessage()); // for user
}
%>


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


