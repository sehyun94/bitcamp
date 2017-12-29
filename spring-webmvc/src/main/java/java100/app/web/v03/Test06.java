// 세션 다루기 - @SessionAttribute  
package java100.app.web.v03;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/v03/test06")
public class Test06 {

    // 세션 준비하고 값 저장하기 
    @RequestMapping(value="/m1", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m1(HttpSession session) {
        
        session.setAttribute("name", "홍길동");
        session.setAttribute("age", 20); // 20 Integer객체로 오토박싱해서 저장된다.
        session.setAttribute("working", true); // auto-boxing : Boolean 객체 저장 
        
        return "세션에 값을 저장하였습니다.";
    }
    
    @RequestMapping(value="/m2", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m2(HttpSession session) {
        
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("name=%s\n", session.getAttribute("name")));
        buf.append(String.format("age=%s\n", session.getAttribute("age")));
        buf.append(String.format("working=%s\n", session.getAttribute("working")));
        
        return buf.toString();
    }
    
    
    
    
    
    
}