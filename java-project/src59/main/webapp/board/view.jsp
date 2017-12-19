
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib  uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>



<!DOCTYPE html>
<html>
<head>
<title>게시판관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
<body>
<div class='container'>

<jsp:include page="/header.jsp"/>


<h1>[게시물 상세 정보]</h1>


<c:if test="${not empty board}">
<form action='update' method='post'>
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
<a href='delete?no=${board.no}' class='btn btn-primary btn-sm'>삭제</a>
</form>


</c:if>
<c:if test="${empty board}">
   <p>'${param.no}'번의 게시물 정보가 없습니다.</p>
</c:if>




<jsp:include page="/footer.jsp"/>

</div>

<%@ include file="../jslib.txt" %>
</body>
</html>


