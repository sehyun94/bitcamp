package java100.app.servlet.room;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.RoomDao;
import java100.app.domain.Room;
import java100.app.listener.ContextLoaderListener;

//urlPatterns 속성
//- 클라이언트가 "/room/xxx" URL을 요청할 때 이 서블릿을 실행하라고 표시한다.
//- /room/xxx 요청이 들어오면 서블릿 컨테이너는 이 서블릿 객체를 실행한다.
@SuppressWarnings("serial")
@WebServlet(urlPatterns="/room/list")
public class RoomListServlet extends HttpServlet {


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(RoomDao.class);
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>강의실관리</title>");
        
        out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");
        out.println("<style>");
        out.println(".container {");
        out.println("width: 680px;");
        out.println("}");
        
        out.println("footer {");
        out.println("text-align: center");
        out.println("}");

        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");

        out.println("<header>");
              
        out.println("<nav class='navbar navbar-light bg-light'>");
        out.println("<a class='navbar-brand' href='../index.html'>");
        out.println("<img src='../images/bit.svg' width='30' height='30' class='d-inline-block align-top' alt=''>"
                + "비트캠프");
        out.println("</a>");
        
        
        out.println("<nav class='navbar navbar-expand-lg navbar-light bg-light'>");
        out.println("<button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#navbarTogglerDemo03' aria-controls='navbarTogglerDemo03' aria-expanded='false' aria-label='Toggle navigation'>");
        out.println("  <span class='navbar-toggler-icon'></span>");
        out.println("</button>");

       
        
        out.println("<div class='collapse navbar-collapse' id='navbarTogglerDemo03'>");
        out.println("<ul class='navbar-nav'>");
        out.println("<li class='nav-item'>");
        out.println("<a class='nav-link' href='../score/list'>성적</a>");
        out.println("</li>");
        out.println("<li class='nav-item'>");
        out.println("<a class='nav-link' href='../member/list'>회원</a>");
        out.println("</li>");
        out.println("<li class='nav-item'>");
        out.println("<a class='nav-link' href='../board/list'>게시판</a>");
        out.println("</li>");
        out.println("<li class='nav-item'>");
        out.println("<a class='nav-link' href='../room/list'>강의실</a>");
        out.println("</li>");

        out.println(" </ul>");
        out.println("</div>");
        
        
        out.println("</nav>");
        out.println("</header>");
        
        out.println("<h1>[강의실 목록]</h1>");
        
        out.println("<p><a href='add' class='btn btn-primary btn-sm'>강의실추가</a></p>");
        out.println("<table class='table table-hover'>");
        out.println("<thead>");
        out.println("<tr>");
        out.println("<th>번호</th><th>위치</th><th>이름</th><th>수용인원</th><th></th>");
        out.println("</tr>");
        out.println("</thead>");
        out.println("<tbody>");
        

        try {
            List<Room> list = roomDao.selectList();

            for (Room room : list) {
                out.printf("<tr><td>%d</td><td>%s</td><td>%s</td><td>%s</td>"
                        + "<td><a href='delete?no=%d' class='btn btn-primary btn-sm'>삭제</a></td></tr>\n",
                        room.getNo(),
                        room.getLocation(),
                        room.getName(),
                        room.getCapacity(),
                        room.getNo());
                
            }

        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
        
        
        out.println("</tbody>");
        out.println("</table>");
        
        out.println("<footer>");
        out.println("비트캠프 자바100기@2017");
        out.println("</footer>");
        
        out.println("</div>");
        
        out.println("<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>");
        out.println("<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>");
        out.println("<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js'></script>");
        out.println("</body>");
        out.println("</html>");
    }

}
