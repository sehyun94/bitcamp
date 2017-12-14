package java100.app.servlet.board;

import java.io.IOException;
import java.io.PrintWriter;

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
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>[게시물 상세 정보]</h1>");
        

        try {
            int no = Integer.parseInt(request.getParameter("no"));
            Board board = boardDao.selectOne(no);

            if (board != null) {
                
                out.println("<form action='update' method='post'>");
                out.println("<div>");   
                out.println("<label for='no'>번호</label>");
                out.printf("<input readonly id='no' type='number' name='no' value='%d'>\n", 
                            board.getNo());
                out.println("</div>");
                
                out.println("<div>");
                out.println("<label for='title'>제목</label>");
                out.printf("<input id='title' type='text' name='title' value='%s'>\n", 
                            board.getTitle());
                out.println("</div>");

                out.println("<div>");
                out.println("<label for='content'>내용</label>");
                out.printf("<input id='content' type='text' name='content' value='%s'>\n", 
                            board.getContent());
                out.println("</div>");
                
                out.println("<div>");
                out.println("<label for='date'>등록일</label>");
                out.printf("<input readonly id='date' type='text' name='date' value='%s'>\n", 
                            board.getRegDate());
                out.println("</div>");
                
                out.println("<div>");
                out.println("<label for='viewCount'>조회수</label>");
                out.printf("<input readonly id=' viewCount' type='text' name='viewCount' value='%d'>\n", 
                            board.getViewCount());
                out.println("</div>");
                
                                
                out.println("</div>");
                out.println("<button>변경</button>");
                out.printf("<a href='delete?no=%d'>삭제</a>\n",board.getNo());
                out.println("</form>");
                
                
                
            } else {
                out.printf("<p>'%s'번의 게시물 정보가 없습니다.</p>\n", no);
            }

        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
        
        out.println("</body>");
        out.println("</html>");
    } 


}









