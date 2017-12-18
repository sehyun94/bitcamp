package java100.app.servlet.room;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.RoomDao;
import java100.app.domain.Room;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet("/room/add")
public class RoomAddServlet extends HttpServlet {
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(
                RoomDao.class);
        
        Room room = new Room();
        room.setLocation(request.getParameter("location"));
        room.setName(request.getParameter("name"));
        room.setCapacity(Integer.parseInt(request.getParameter("capacity")));

        int count = roomDao.insert(room);
        // 작업한 결과를 JSP에 넘겨주기 위해 ServletRequest 보관소에 저장한다,
        request.setAttribute("count", count);
        
        response.setContentType("text/html;charset=UTF-8");
        
        // 이 값을 출력할 JSP로 인클루딩 한다.
        RequestDispatcher rd = request.getRequestDispatcher("/room/add.jsp");
        rd.include(request, response);
        
    }
}
