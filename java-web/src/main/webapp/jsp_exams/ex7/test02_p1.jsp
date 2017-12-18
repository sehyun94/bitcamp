<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
<h1>PageContext 보관소</h1>
서블릿/JSP 페이지를 실행 할 때 생성되고 실행이 끝나면 제거된다.<br>
다른 JSP(including/forwarding)와 공유하지 않는다.<br>

<%
pageContext.setAttribute("name", "홍길동");
%>
<p>
<jsp:include page="test02_p2.jsp"></jsp:include>
</p>

<hr>
<p>
<%=pageContext.getAttribute("name") %>
</p>



</body>
</html>






