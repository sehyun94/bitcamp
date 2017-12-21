package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test01 {
    
    @RequestMapping("/v02/test01")
    public String m() {
        
        //request hadnler가 리턴하는 JSP를  프론트 컨트롤러가 include 할 것이다.
        return "/hello.jsp";
    }
}
