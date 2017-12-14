package java100.app.servlet.room;

import java.io.IOException;
import java.io.PrintWriter;

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
@WebServlet(urlPatterns="/room/add")
public class RoomAddServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
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
        out.println("</style>");
        
        
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h1>[강의실 등록]</h1>");

        out.println("<form method='post'>");

        out.println("<div class='form-group row'>");
        out.println("<label class='col-sm-2 col-form-label col-form-label-sm'  for='location'>위치</label>");
        out.println("<div class='col-sm-10'>");
        out.println("<input class='form-control' id='location' type='text' name='location'>"); 
        out.println("</div>");
        out.println("</div>");

        out.println("<div class='form-group row'>");
        out.println("<label class='col-sm-2 col-form-label col-form-label-sm' for='name'>이름</label>");
        out.println("<div class='col-sm-10'>");
        out.println("<input  class='form-control' id='name' type='text' name='name'>"); 
        out.println("</div>");
        out.println("</div>");


        out.println("<div class='form-group row'>");
        out.println("<label class='col-sm-2 col-form-label col-form-label-sm' for='capacity'>수용인원</label>");
        out.println("<div class='col-sm-10'>");
        out.println("<input  class='form-control' id='capacity' type='text' name='capacity'>"); 
        out.println("</div>");
        out.println("</div>");

        out.println("<div class='form-group row'>");
        out.println("<div class='col-sm-10'>");
        out.println("<button class='btn btn-primary btn-sm'>추가</button>");
        out.println("</div>");
        out.println("</div>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");

    }


    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(RoomDao.class);
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        
        out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");
        out.println("<style>");
        out.println(".container {");
        out.println("width: 680px;");
        out.println("}");
        out.println("</style>");
        
        out.println("<title>강의실관리</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h1>[강의실 등록결과]</h1>");

        try {
            Room room = new Room();
            room.setLocation(request.getParameter("location"));
            room.setName(request.getParameter("name"));
            room.setCapacity(Integer.parseInt(request.getParameter("capacity")));

            roomDao.insert(room);

            out.println("<p>저장하였습니다.</p>");

        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }


        out.println("<p><a href='list' class='btn btn-primary btn-sm'>목록</a></p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    } 


}

