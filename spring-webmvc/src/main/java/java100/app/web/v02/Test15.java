package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test15")
public class Test15 {


    // 클라이언트가 보낸 데이터는 모두 문자열이다.
    // 프론트 컨트롤러가 이 문자열을 메서드의 변수 타입에 맞게 형변환한다.
    // 단 primitive 타입만 형변환 해준다,
    @RequestMapping("/board/{no}")
    public String m1(@PathVariable("no") int no) {
        System.out.println(no);
        System.out.println("------------------------------");
        return "/hello.jsp";
    }

    // 조회할때 이 방법을 사용한다 
    // url:: http://localhost:9999/spring-webmvc/app/v02/test15/category/800/product/900
    @RequestMapping("/category/{catno}/product/{prodno}")
    public String m2(@PathVariable("catno") int catno,
            @PathVariable("prodno") int prodno) {
        System.out.println(catno);
        System.out.println(prodno);
        System.out.println("------------------------------");
        return "/hello.jsp";
    }
    
    @RequestMapping("/category2/{catno}/product2/{prodno}")
    public String m3(@PathVariable("catno") int catno,
            @PathVariable("prodno") int prodno) {
        System.out.println(catno);
        System.out.println(prodno);
        System.out.println("------------------------------");
        return "/hello.jsp";
    }
    
    // test:) http://localhost:9999/spring-webmvc/app/v02/test15/software/java-sdk-8.0.151.exe
    //                        /d = 0~9  . 어느문자 이기때문에 \\ 를 이용해 .을 표현  
    @RequestMapping("/software/{name:[a-z-]+}-{version:\\d\\.\\d\\.\\d+}{ext:\\.[a-z]+}")
    public String m4(
            @PathVariable String name,
            @PathVariable String version,
            @PathVariable String ext ) {
        System.out.println(name);
        System.out.println(version);
        System.out.println(ext);
        System.out.println("------------------------------");
        return "/hello.jsp";
    }

}


