<%@page import="java100.app.domain.Board"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<title>게시판</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>

<jsp:include page="../header.jsp"/>

<h1>게시물 목록</h1>

<jsp:include page="../listToolbar.jsp"/>


<table class='table table-hover'>
<thead>
<tr>
<th>번호</th><th>제목</th><th>등록일</th><th>조회수</th><th>작성자</th>
</tr>
</thead>
<tbody>

<c:forEach items="${list}" var="board">
        <tr>
        <td>${board.no}</td>
        <td><a href='${board.no}'>${board.title}</a></td>
        <td>${board.regDate}</td>
        <td>${board.viewCount}</td>
        <td>${board.writer.name}</td>
        </tr>
</c:forEach>

</tbody>
</table>

<c:set var="prevPageDisabled" value="${(pageNo > 1) ? '':'disabled'}"/>
<c:set var="prevPageTabIndex" value="${(pageNo > 1) ? 0 : -1 }"/>
<c:set var="nextPageDisabled" value="${(pageNo < lastPageNo) ? '' : 'disabled' }"/>
<c:set var="nextPageTabIndex" value="${(pageNo < lastPageNo) ? 0 : -1 }"/>

<nav aria-label="Page navigation">
    <ul class="pagination justify-content-center">
    <li class="page-item ${prevPageDisabled}"><a class="page-link" 
        href="list?pn=${pageNo - 1}"
        tabindex="${prevPageTabIndex}">이전</a></li>
        
    <li class="page-item"><a class="page-link" href="#">${pageNo}</a></li>
    
    <li class="page-item ${nextPageDisabled}"><a class="page-link" 
    href="list?pn=${pageNo + 1}"
    tabindex="${nextPageTabIndex}">다음</a></li>
  </ul>
</nav>

<jsp:include page="../footer.jsp"/>

</div>

<jsp:include page="../jslib.jsp"/>

</body>
</html>
    