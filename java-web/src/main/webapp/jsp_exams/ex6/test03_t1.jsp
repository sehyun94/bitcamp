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
<h1>JSP:useBean테스트</h1>
<p>인스턴스 생성하기.</p>
<jsp:useBean id="list" class="java.util.ArrayList"/>


<%
list.add("홍길동");
list.add("임꺽정");
list.add("유관순");
%>

리스트 개수 : <%=list.size() %><br>

<%
java.util.ArrayList list2 = (java.util.ArrayList)pageContext.getAttribute("list");

%>
<p>
list2.get(1): <%=list2.get(1) %>
</p>
</body>
</html>






