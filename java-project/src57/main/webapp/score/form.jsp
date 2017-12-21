<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

        <!DOCTYPE html>
        <html>
        <head>
        <title>성적관리</title>

        <link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
        <link rel='stylesheet' href='../css/common.css'>
        
        </head>
        <body>
        <div class='container'>

<jsp:include page="/header.jsp"/>
        
        <h1>[성적 등록]</h1>

        <form action='add.jsp' method='post'>
        <div class='form-group row'>
        <label class='col-sm-2 col-form-label col-form-label-sm' for='name'>이름</label>
        <div class='col-sm-10'>
        <input class='form-control' id='name' type='text' name='name'> 

        </div>
        </div>

        <div class='form-group row'>
        <label class='col-sm-2 col-form-label col-form-label-sm' for='kor'>국어</label>
        <div class='col-sm-10'>
        <input class='form-control' id='kor' type='number' name='kor'> 

        </div>
        </div>

        <div class='form-group row'>
        <label class='col-sm-2 col-form-label col-form-label-sm'for='eng'>영어</label>
        <div class='col-sm-10'>
        <input class='form-control' id='eng' type='number' name='eng'> 
        </div>
        </div>

        <div class='form-group row'>
        <label class='col-sm-2 col-form-label col-form-label-sm' for='math'>수학</label>
        <div class='col-sm-10'>
        <input class='form-control' id='math' type='number' name='math'> 
        </div>
        </div>


        <div class='form-group row'>
        <div class='col-sm-10'>
        <button class='btn btn-primary btn-sm'>추가</button>
        </div>
        
    </div>
    </form>       

<jsp:include page="/footer.jsp"/>      
        </div>

<%@include file="../jslib.txt" %>        

        </body>
        </html>

