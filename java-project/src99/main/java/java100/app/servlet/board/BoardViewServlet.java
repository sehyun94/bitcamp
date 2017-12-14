package java100.app.servlet.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.BoardDao;
import java100.app.domain.Board;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/board/view")// 이클래스의 객체를 자동 생성해야함을 표시
public class BoardViewServlet extends HttpServlet {


    public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws ServletException, IOException {

        BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);  
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>게시판관리</title>");
        
        out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");
        out.println("<link rel='stylesheet' href='../css/common.css'>");
       
        
        out.println("<body>");
        out.println("<div class='container'>");

        RequestDispatcher rd = request.getRequestDispatcher("/header");
        rd.include(request, response);
        
        out.println("<h1>[게시물 상세 정보]</h1>");
        

        try {
            int no = Integer.parseInt(request.getParameter("no"));
            Board board = boardDao.selectOne(no);

            if (board != null) {
                
                out.println("<form action='update' method='post'>");
                out.println("<div class='form-group row'>");
                out.println("<label class='col-sm-2 col-form-label col-form-label-sm' for='no'>번호</label>");
                out.println("<div class='col-sm-10'>");
                out.printf("<input class='form-control' readonly id='no' type='number' name='no' value='%d'>\n", 
                            board.getNo());
                out.println("</div>");
                out.println("</div>");
                
                out.println("<div class='form-group row'>");
                out.println("<label  class='col-sm-2 col-form-label col-form-label-sm' for='title'>제목</label>");
                out.println("<div class='col-sm-10'>");
                out.printf("<input  class='form-control' id='title' type='text' name='title' value='%s'>\n", 
                            board.getTitle());
                out.println("</div>");
                out.println("</div>");
                
                out.println("<div class='form-group row'>");
                out.println("<label  class='col-sm-2 col-form-label col-form-label-sm' for='content'>내용</label>");
                out.println("<div class='col-sm-10'>");
                out.printf("<input class='form-control' id='content' type='text' name='content' value='%s'>\n", 
                            board.getContent());
                out.println("</div>");
                out.println("</div>");
                
                out.println("<div class='form-group row'>");
                out.println("<label class='col-sm-2 col-form-label col-form-label-sm' for='date'>등록일</label>");
                out.println("<div class='col-sm-10'>");
                out.printf("<input class='form-control' readonly id='date' type='text' name='date' value='%s'>\n", 
                            board.getRegDate());
                out.println("</div>");
                out.println("</div>");
                
                out.println("<div class='form-group row'>");
                out.println("<label class='col-sm-2 col-form-label col-form-label-sm' for='viewCount'>조회수</label>");
                out.println("<div class='col-sm-10'>");
                out.printf("<input class='form-control' readonly id=' viewCount' type='text' name='viewCount' value='%d'>\n", 
                            board.getViewCount());
                out.println("</div>");
                out.println("</div>");
                
                                
                out.println("<div class='form-group row'>");
                out.println("<div class='col-sm-10'>");
                out.println("<button class='btn btn-primary btn-sm'>변경</button>");
                out.printf("<a href='delete?no=%d' class='btn btn-primary btn-sm'>삭제</a>\n",board.getNo());
                out.println("</form>");
               
                out.println("</div>");
                out.println("</div>");
                
                
                
            } else {
                out.printf("<p>'%s'번의 게시물 정보가 없습니다.</p>\n", no);
            }

        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }

        rd = request.getRequestDispatcher("/footer");
        rd.include(request, response);
        
        out.println("</div>");
        out.println("<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>");
        out.println("<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>");
        out.println("<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js'></script>");
        out.println("</body>");
        out.println("</html>");
    } 


}









