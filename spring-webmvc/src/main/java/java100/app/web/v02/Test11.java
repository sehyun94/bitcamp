package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/v02/test11")
public class Test11 {
    
    // @RequestParam
    // => 클라이언트가 보낸 값을 받을 변수에 붙인다.
    // => 
    
    @RequestMapping("m1")
    public String m1(@RequestParam("name")String name) {
        System.out.println(name);
        return "/hello.jsp";
    }

    // => 클라이언트가 해당 name값을 보내지 않았으면 실행 오류!
    // => 해결책? 
    // @RequestParam의 required 속성을 false 설정하라!
    @RequestMapping("m2")
    public String m2(@RequestParam (value="name", required=false) String name) {
        System.out.println(name);
        return "/hello.jsp";
    }
    
    // => 클라이언트가 해당 name값을 보내지 않았을 경우 사용할 기본값 설정할 수 있다.
    @RequestMapping("m3")
    public String m3(@RequestParam (value="name", defaultValue="오호라") String name) {
        System.out.println(name);
        return "/hello.jsp";
    }
    
    // => @RequestParam을 붙이지 않으면,
    // 클라이언트가 보낸 데이터 중에서 변수명과 일치하는값을 찾아 넘겨준다
    @RequestMapping("m4")
    public String m4(String name) {
        System.out.println(name);
        return "/hello.jsp";
    }
    
}
