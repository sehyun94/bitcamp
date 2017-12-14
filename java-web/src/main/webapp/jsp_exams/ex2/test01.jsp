<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>  
<h1>스크립트릿(scriptle element)</h1>
<p>JSP 페이지에 자바 코드를 넣을 사용한다</p>

<%-- JSP 페이지에 주석을 넣고 싶은가 ? 이렇게 하라! 이것은 자바 소스코드로 
바뀌지 않는다. 그냥 버러진다. <--!근데 간혹가다가 개발자가 이렇게 주석을 
다는 경우가 있다 이것은 HTML 주석으로 웹 브라우저가 무시하는 것이다.
JSP 엔진 입장에서는 그냥 템플릿으로 실행하는 것이다.--!> --%>

<h2>JSP스크립트릿</h2>
<pre class='jsp'>
&lit; %
int a = 10;
int b = 20;
out.println(a+b);
%>
</pre>

<h2>생성된 자바 코드</h2>
<pre class="java">
int a = 10;
int b = 20;
out.println(a+b);
</pre>


</body>
</html>