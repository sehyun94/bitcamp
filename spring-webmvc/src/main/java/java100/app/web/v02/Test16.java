package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test16")
public class Test16 {

    //테스트 방법:
    // =>http://localhost:9999/spring-webmvc/app/v02/test16
    
    //클라이언트가 보낸 CSV 데이터 꺼내기 
    @RequestMapping("/m1")
    public String m1(@RequestBody String body) {
        System.out.println(body);
        System.out.println("------------------------------");
        return "/hello.jsp";
    }
  //클라이언트가 보낸' application/json' 데이터 꺼내기 
    @RequestMapping("/m2")
    public String m2(@RequestBody String body) {
        System.out.println(body);
        System.out.println("------------------------------");
        return "/hello.jsp";
    }
    @RequestMapping("/m3")
    public String m3(@RequestBody String body) {
        System.out.println(body);
        System.out.println("------------------------------");
        return "/hello.jsp";
    }
    @RequestMapping("/m4")
    public String m4(@RequestBody String body) {
        System.out.println(body);
        System.out.println("------------------------------");
        return "/hello.jsp";
    }


}


