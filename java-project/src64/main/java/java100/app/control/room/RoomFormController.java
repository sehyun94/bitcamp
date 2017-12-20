package java100.app.control.room;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import java100.app.annotation.RequestMapping;

@Component("/room/form")
public class RoomFormController  {
    
    
    
    @RequestMapping
    public String form (HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        response.setContentType("text/html;charset=UTF-8");
        
        // 이 값을 출력할 JSP로 인클루딩 한다.
        
        return "/room/form.jsp";
        
    }
}
