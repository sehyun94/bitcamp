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
RequestDispatcher rd = request.getRequestDispatcher("/header.jsp");
rd.include(request, response);
BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
%>


<h1>[게시물 상세 정보]</h1>

<%
try {
    int no = Integer.parseInt(request.getParameter("no"));
    Board board = boardDao.selectOne(no);

    if (board != null) {
        pageContext.setAttribute("board", board);
%>        
<form action='update.jsp' method='post'>
<div class='form-group row'>
<label class='col-sm-2 col-form-label col-form-label-sm' for='no'>번호</label>
<div class='col-sm-10'>
<input class='form-control' readonly id='no' type='number' name='no' value='${board.no}'> 
                    
</div>
</div>

<div class='form-group row'>
<label  class='col-sm-2 col-form-label col-form-label-sm' for='title'>제목</label>
<div class='col-sm-10'>
<input  class='form-control' id='title' type='text' name='title' 
value='${board.title}'> 
</div>
</div>

<div class='form-group row'>
<label  class='col-sm-2 col-form-label col-form-label-sm' for='content'>내용</label>
<div class='col-sm-10'>
<input class='form-control' id='content' type='text' name='content' 
value='${board.content}'> 

</div>
</div>

<div class='form-group row'>
<label class='col-sm-2 col-form-label col-form-label-sm' for='date'>등록일</label>
<div class='col-sm-10'>
<input class='form-control' readonly id='date' type='text' name='date' 
value='${board.regDate}'> 
</div>
</div>

<div class='form-group row'>
<label class='col-sm-2 col-form-label col-form-label-sm' for='viewCount'>조회수</label>
<div class='col-sm-10'>
<input class='form-control' readonly id=' viewCount' type='text' name='viewCount' 
value='${board.viewCount}'> 
</div>
</div>

<button class='btn btn-primary btn-sm'>변경</button>
<a href='delete.jsp?no=${board.no}' class='btn btn-primary btn-sm'>삭제</a>
</form>

<%        
    } else { %>
        <p>'${param.no}'번의 게시물 정보가 없습니다.</p>
  <%  }

} catch (Exception e) {
    e.printStackTrace();  %>

<%=e.getMessage()%>
<% }  %>


<%
out.flush();
rd = request.getRequestDispatcher("/footer.jsp");
rd.include(request, response);
%>

</div>

<%@ include file="../jslib.txt" %>
</body>
</html>


