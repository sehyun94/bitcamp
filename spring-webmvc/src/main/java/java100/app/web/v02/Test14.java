package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test14")
public class Test14 {


    // 클라이언트가 보낸 데이터는 모두 문자열이다.
    // 프론트 컨트롤러가 이 문자열을 메서드의 변수 타입에 맞게 형변환한다.
    // 단 primitive 타입만 형변환 해준다,
    @RequestMapping
    public String fileupload(
            String name,
            String[] langs) {
        System.out.println(name);

        if (langs != null) {
            for(String lang : langs) {
                System.out.println(lang);
            }
        }
        System.out.println("-------------------------");
        return "/hello.jsp";



        // name
        // age
        // working
        // 파일명
        //        return "/hello.jsp";
    }

}


