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
out.flush();

MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);
RequestDispatcher rd = request.getRequestDispatcher("/header");
rd.include(request, response);
%>

<h1>[회원 상세정보]</h1>

		<%
		 PrintWriter out2 = new PrintWriter(out);
		 try {
	            
	            int no = Integer.parseInt(request.getParameter("no"));
	            Member member = memberDao.selectOne(no);
	            
	            if (member != null) {
	                out.println("<form action='update.jsp' method='post'>");
	                out.println("<div class='form-group row'>");
	                out.println("<label class='col-sm-2 col-form-label' for='no'>번호</label>");
	                out.println("<div class='col-sm-10'>");
	                out2.printf("<input class='form-control' readonly id='no' type='number' name='no' value='%d'>\n", 
	                            member.getNo());
	                out.println("</div>");
	                out.println("</div>");
	                
	                out.println("<div class='form-group row'>");
	                out.println("<label class='col-sm-2 col-form-label' for='name'>이름</label>");
	                out.println("<div class='col-sm-10'>");
	                out2.printf("<input class='form-control' id='name' type='text' name='name' value='%s'>\n", 
	                            member.getName());
	                out.println("</div>");
	                out.println("</div>");
	                
	                out.println("<div class='form-group row'>");
	                out.println("<label class='col-sm-2 col-form-label' for='email'>이메일</label>");
	                out.println("<div class='col-sm-10'>");
	                out2.printf("<input id='email' type='text' name='email' value='%s'>\n", 
	                            member.getEmail());
	                out.println("</div>");
	                out.println("</div>");
	                
	                out.println("<div class='form-group row'>");
	                out.println("<label for='date'  class='col-sm-2 col-form-label'>등록일</label>");
	                out.println("<div class='col-sm-10'>");
	                out2.printf("<input class='form-control'  readonly id='date' type='text' name='date' value='%s'>\n", 
	                            member.getCreatedDate());
	                out.println("</div>");
	                out.println("</div>");
	                
	                out.println("<div class='form-group row'>");
	                out.println("<label for='password' class='col-sm-2 col-form-label'>비밀번호</label>");
	                out.println("<div class='col-sm-10'>");
	                out2.printf("<input class='form-control' id='password' type='password' name='password' >\n", 
	                            member.getPassword());
	                out.println("</div>");
	                out.println("</div>");
	                
	                out.println("<div class='form-group row'>");
	                out.println("<div class='col-sm-10'>");
	                out.println("<button class='btn btn-primary btn-sm'>변경</button>");
	                out2.printf("<a href='delete.jsp?no=%d' class='btn btn-primary btn-sm'>삭제</a>\n",member.getNo());
	                out.println("</div>");
	                out.println("</div>");
	                out.println("</form>");
	                
	               
	            } else {
	                out2.printf("<p>'%s'번의 회원 정보가 없습니다.</p>\n", no); 
	            }
	            
	        } catch (Exception e) {
	            e.printStackTrace(); // for developer
	            out.println(e.getMessage()); // for user
	        }
        %>

	</div>
	<%
	out.flush();
	rd = request.getRequestDispatcher("/footer");
    rd.include(request, response); %>

	<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>
	<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>
	<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js'></script>
</body>
</html>

