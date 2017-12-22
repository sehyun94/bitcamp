
package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test07")
public class Test07 {
    
    @RequestMapping(consumes="text/csv")
    public String m1() {
        System.out.println("m1 호출됨");
        return "/hello.jsp";
    }
    
    // =>aaa 헤더가 있는 경우
    @RequestMapping(consumes="application/json")
    public String m2() {
        System.out.println("m2 호출됨");
        return "/hello.jsp";
    }
    // =>bbb 헤더가 있는 경우
    @RequestMapping(consumes="application/x-www-form-urlencoded")
    public String m3() {
        System.out.println("m3 호출됨");
        return "/hello.jsp";
    }
    
 // =>aaa 헤더와 , bbb 헤더가 있는 경우
    @RequestMapping
    public String m4() {
        System.out.println("m4 호출됨");
        return "/hello.jsp";
    }
}
