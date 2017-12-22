
package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test09")
public class Test09 {
    
    //GET/POST/DELETE 등을 구분하는 또 다른 방법
    
    //@RequestMapping(method=RequestMethod.GET)
    @GetMapping // 위의 애노테이션과 같은 의미
    public String get() {
        System.out.println("get 호출됨");
        return "/hello.jsp";
    }
    
    //@RequestMapping(method=RequestMethod.POST)
    @PostMapping
    public String post() {
        System.out.println("post 호출됨");
        return "/hello.jsp";
    }
    
    
}
