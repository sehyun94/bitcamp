package java100.app.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java100.app.dao.RoomDao;
import java100.app.domain.Room;

@Controller
public class RoomController  {
    @Autowired RoomDao roomDao;

    @RequestMapping("/room/list")
    public String list (HttpServletRequest request, HttpServletResponse response) throws Exception {

        List<Room> list = roomDao.selectList();

        // 작업한 결과를 JSP에 넘겨주기 위해 ServletRequest 보관소에 저장한다,
        request.setAttribute("list", list);

        return "/room/list.jsp";
    }
    
    @RequestMapping("/room/delete")
    public String delete (
            @RequestParam("no") int no,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        roomDao.delete(no);

        return "redirect:list.do";


    }
    @RequestMapping("/room/add")
    public String add (
            Room room,
            HttpServletRequest request, HttpServletResponse response) throws Exception {

        roomDao.insert(room);

        return "redirect:list.do";
    }

    @RequestMapping("/room/form")
    public String form (HttpServletRequest request, HttpServletResponse response) throws Exception {

        response.setContentType("text/html;charset=UTF-8");

        // 이 값을 출력할 JSP로 인클루딩 한다.

        return "/room/form.jsp";
    }
}
