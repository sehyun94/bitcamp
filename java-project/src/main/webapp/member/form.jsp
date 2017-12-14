<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<!DOCTYPE html>
<html>
<head>
<title>회원관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
<body>
<div class='container'>

<%
RequestDispatcher rd = request.getRequestDispatcher("/header");
rd.include(request, response);
%>

<h1>[회원 등록]</h1>
<form action='add.jsp' method='post'>
<div class='form-group row'>
<label class='col-sm-2 col-form-label' for='name'>이름</label>
<div class='col-sm-10'>
<input class='form-control' id='name' type='text' name='name'>

</div>
</div>
<div class='form-group row'>
<label class='col-sm-2 col-form-label' for='email'>이메일</label>
<div class='col-sm-10'>
<input class='form-control' id='email' type='text' name='email'>

</div>
</div>
<div class='form-group row'>
<label for='password' class='col-sm-2 col-form-label'>비밀번호</label>
<div class='col-sm-10'>
<input class='form-control' id='password' type='password' name='password'>

</div>
</div>
<div class='form-group row'>
<div class='col-sm-10'>
<button class='btn btn-primary btn-sm'>추가</button>
</div>
</div>
</form>

<%
out.flush();
rd = request.getRequestDispatcher("/footer");
rd.include(request, response);
%>

<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>
<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>
<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js'></script>
</div>
</body>
</html>
    