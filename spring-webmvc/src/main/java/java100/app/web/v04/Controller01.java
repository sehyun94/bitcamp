package java100.app.web.v04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/v04/controller01")
public class Controller01 {
    
    @RequestMapping(value="/m1", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m1() {
        System.out.println("c1/m1 호출");
        return "/controller01/m1 실행";
    }
    
    @RequestMapping(value="/m2", produces="text/plain;charset=UTF-8")
    public String m2() {
        System.out.println("c1/m2 호출");
        return "v04/Test01";
    }

}
