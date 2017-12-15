<%@page import="java100.app.domain.Member"%>
<%@page import="java100.app.dao.MemberDao"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.domain.Score"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.ScoreDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>



<!DOCTYPE html>
<html>
<head>
<title>회원관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
<body>
<div class='container'>

<%
MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);
%>

<jsp:include page="/header.jsp"/>

<h1>[회원 상세정보]</h1>

<%
try {
int no = Integer.parseInt(request.getParameter("no"));
Member member = memberDao.selectOne(no);
if (member != null) {   %>

<form action='update.jsp' method='post'>
<div class='form-group row'>
<label class='col-sm-2 col-form-label' for='no'>번호</label>
<div class='col-sm-10'>
<input class='form-control' readonly id='no' type='number' name='no' 
value='<%=member.getNo()%>'> 
</div>
</div>

<div class='form-group row'>
<label class='col-sm-2 col-form-label' for='name'>이름</label>
<div class='col-sm-10'>
<input class='form-control' id='name' type='text' name='name' 
value='<%=member.getName()%>'> 

</div>
</div>

<div class='form-group row'>
<label class='col-sm-2 col-form-label' for='email'>이메일</label>
<div class='col-sm-10'>
<input id='email' type='text' name='email' value='<%=member.getEmail()%>'> 
</div>
</div>

<div class='form-group row'>
<label for='date'  class='col-sm-2 col-form-label'>등록일</label>
<div class='col-sm-10'>
<input class='form-control'  readonly id='date' type='text' name='date' 
value='<%=member.getCreatedDate()%>'> 

</div>
</div>

<div class='form-group row'>
<label for='password' class='col-sm-2 col-form-label'>비밀번호</label>
<div class='col-sm-10'>
<input class='form-control' id='password' type='password' name='password' 
value='<%=member.getPassword() %>'> 

</div>
</div>

<div class='form-group row'>
<div class='col-sm-10'>
<button class='btn btn-primary btn-sm'>변경</button>
<a href='delete.jsp?no=<%=member.getNo()%>' class='btn btn-primary btn-sm'>삭제</a>
</div>
</div>
</form>
                    
<%                 
 } else {  %>
     <p>'<%=no%>'번의 회원 정보가 없습니다.</p> 
     <%
 }
 
            } catch (Exception e) {
                e.printStackTrace(); %>
                <%=e.getMessage()%>
            <% } %>

    </div>
  <jsp:include page="/footer.jsp"/>

<%@ include file="../jslib.txt" %>
</body>
</html>

