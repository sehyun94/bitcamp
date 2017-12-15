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
<header>
<nav class='navbar navbar-light bg-light'>
<a class='navbar-brand' href='../index.html'>
<img src='../images/bit.svg' width='30' height='30' class='d-inline-block align-top' alt=''>비트캠프
</a>
<nav class='navbar navbar-expand-lg navbar-light bg-light'>
<button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#navbarTogglerDemo03' aria-controls='navbarTogglerDemo03' aria-expanded='false' aria-label='Toggle navigation'>
  <span class='navbar-toggler-icon'></span>
</button>
<div class='collapse navbar-collapse' id='navbarTogglerDemo03'>
<ul class='navbar-nav'>
<li class='nav-item'>
<a class='nav-link' href='../score/list'>성적</a>
</li>
<li class='nav-item'>
<a class='nav-link' href='../member/list'>회원</a>
</li>
<li class='nav-item'>
<a class='nav-link' href='../board/list'>게시판</a>
</li>
<li class='nav-item'>
<a class='nav-link' href='../room/list'>강의실</a>
</li>
 </ul>
</div>
</nav>
</header>
<h1>[회원 등록]</h1>
<form action='add' method='post'>
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
</form>
<footer>
비트캠프 자바100기@2017
</footer>
</div>
<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>
<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>
<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js'></script>
</div>
</body>
</html>
    