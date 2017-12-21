package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test03")
public class Test03 {
    
    @RequestMapping("m1")
    public String m1() {
        System.out.println("m1() 호출됨");
        return "/hello.jsp";
    }
    
    @RequestMapping("m2")
    public String m2() {
        System.out.println("m2() 호출됨");
        return "/hello.jsp";
    }
    
    @RequestMapping(value="m3")
    public String m3() {
        System.out.println("m3() 호출됨");
        return "/hello.jsp";
    }
    
    // value는 path 와 같다
    @RequestMapping(path="m4")
    public String m4() {
        System.out.println("m4() 호출됨");
        return "/hello.jsp";
    }
    
    
}
