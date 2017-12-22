
package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test08")
public class Test08 {
    
    // 클라이언트가 무슨타입의 콘텐츠를 원하는 지에 따라 구분하여 처리할 수 있다.
    // =>produces 속성에 MIME 타입을 지정하면 된다.
    
    @RequestMapping(produces="text/csv")
    public String m1() {
        System.out.println("m1 호출됨");
        return "/hello.jsp";
    }
    
    @RequestMapping(produces="application/json")
    public String m2() {
        System.out.println("m2 호출됨");
        return "/hello.jsp";
    }
    
    @RequestMapping
    public String m3() {
        System.out.println("m3 호출됨");
        return "/hello.jsp";
    }
}
