package java100.app.servlet.room;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
        out.println("<link rel='stylesheet' href='../css/common.css'>");
       

        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");

        RequestDispatcher rd = request.getRequestDispatcher("/header");
        rd.include(request, response);
        
        out.println("<h1>[강의실 목록]</h1>");
        
        out.println("<p><a href='form.jsp' class='btn btn-primary btn-sm'>강의실추가</a></p>");
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

