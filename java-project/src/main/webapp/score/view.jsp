<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.domain.Score"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.ScoreDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>



<!DOCTYPE html>
<html>
<head>
<title>성적관리</title>
<link rel='stylesheet'
	href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
	<div class='container'>

		<%
out.flush();

RequestDispatcher rd = request.getRequestDispatcher("/header");
rd.include(request, response);

ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(ScoreDao.class);
%>
		<h1>[성적 상세정보]</h1>

		<%
		 PrintWriter out2 = new PrintWriter(out);
 try {
            int no = Integer.parseInt(request.getParameter("no"));
            Score score = scoreDao.selectOne(no);


            if (score != null) {
                out.println("<form action='update.jsp' method='post'>");
                out.println("<div class='form-group row'>");
                out.println("<label for='no'  class='col-sm-2 col-form-label'>번호</label>");
                out.println("<div class='col-sm-10'>");
                out2.printf("<input class='form-control' readonly id='no' type='number' name='no' value='%d'>\n", 
                        score.getNo());
                out.println("</div>");
                out.println("</div>");

                out.println("<div class='form-group row'>");
                out.println("<label for='name' class='col-sm-2 col-form-label'>이름</label>");
                out.println("<div class='col-sm-10'>");
                out2.printf("<input class='form-control' id='name' type='text' name='name' value='%s'>\n", 
                        score.getName());
                out.println("</div>");
                out.println("</div>");

                out.println("<div class='form-group row'>");
                out.println("<label for='kor'  class='col-sm-2 col-form-label' >국어</label>");
                out.println("<div class='col-sm-10'>");
                out2.printf("<input class='form-control' id='kor' type='number' name='kor' value='%d'>\n", 
                        score.getKor());
                out.println("</div>");
                out.println("</div>");

                out.println("<div class='form-group row'>");
                out.println("<label for='eng' class='col-sm-2 col-form-label'>영어</label>");
                out.println("<div class='col-sm-10'>");
                out2.printf("<input class='form-control' id='eng' type='number' name='eng' value='%d'>\n", 
                        score.getEng());
                out.println("</div>");
                out.println("</div>");

                out.println("<div class='form-group row'>");
                out.println("<label class='col-sm-2 col-form-label' for='math'>수학</label>");
                out.println("<div class='col-sm-10'>");
                out2.printf("<input class='form-control' id='math' type='number' name='math' value='%d'>\n", 
                        score.getMath());
                out.println("</div>");
                out.println("</div>");

                out.println("<div class='form-group row'>");
                out.println("<label class='col-sm-2 col-form-label'  for='sum'>합계</label>");
                out.println("<div class='col-sm-10'>");
                out2.printf("<input class='form-control' readonly id='sum' type='text' value='%d'>\n", 
                        score.getSum());
                out.println("</div>");
                out.println("</div>");

                out.println("<div class='form-group row'>");
                out.println("<label class='col-sm-2 col-form-label col-form-label-sm' for='aver'>평균</label>");
                out.println("<div class='col-sm-10'>");
                out2.printf("<input class='form-control' readonly id='aver' type='text' value='%.1f'>\n", 
                        score.getAver());
                out.println("</div>");
                out.println("</div>");

                out.println("<div class='form-group row'>");
                out.println("<div class='col-sm-10'>");
                out.println("<button class='btn btn-primary btn-sm'>변경</button>");
                out2.printf("<a href='delete.jsp?no=%d' class='btn btn-primary btn-sm'>삭제</a>\n",score.getNo());
                out.println("</div>");
                out.println("</div>");
                out.println("</form>");

            } else {
                out2.printf("<p>'%d'의 성적 정보가 없습니다.</p>\n", no); 
            }

        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
        
        rd = request.getRequestDispatcher("/footer");
        rd.include(request, response);
        %>

	</div>

	<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>
	<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>
	<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js'></script>
</body>
</html>

