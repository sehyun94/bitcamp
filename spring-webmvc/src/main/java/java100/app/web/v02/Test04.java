package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/v02/test04")
public class Test04 {
    
    @RequestMapping(method=RequestMethod.GET)
    public String Get() {
        System.out.println("Get 호출됨");
        return "/hello.jsp";
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public String Post() {
        System.out.println("Post 호출됨");
        return "/hello.jsp";
    }
    @RequestMapping(value="m1", method=RequestMethod.GET)
    public String m1() {
        System.out.println("m1()Get 호출됨");
        return "/hello.jsp";
    }
    
    @RequestMapping(path="m1", method=RequestMethod.POST)
    public String m2() {
        System.out.println("m2() Post 호출됨");
        return "/hello.jsp";
    }
    
   
}
