package java100.app.control.room;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.control.PageController;
import java100.app.dao.RoomDao;
import java100.app.domain.Room;

@Component("/room/add")
public class RoomAddController implements PageController {
    
    @Autowired RoomDao roomDao;
    
    public String service(
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
        
        Room room = new Room();
        room.setLocation(request.getParameter("location"));
        room.setName(request.getParameter("name"));
        room.setCapacity(Integer.parseInt(request.getParameter("capacity")));
        
        roomDao.insert(room);
        
        return "redirect:list.do";
    }
}








