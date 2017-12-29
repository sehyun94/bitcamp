// 요청 핸들러의 리턴 값 - View 
package java100.app.web.v03;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController 
// => HTML과 같은 UI 를 클라이언트에 출력하는 것이 아니라,
//   XML이나 JSON 형식의 

@RestController
@RequestMapping("/v03/test04")
public class Test04 {

    //직접 HttpServletRequest 보관소에 저장하기
    @RequestMapping("/m1")
    public Object m1() {
        // 보관소에 데이터 저장
        return new Member("홍길동", 20, true);
    }
    
    @RequestMapping(value="/m2", produces="text/plain;charset=UTF-8")
    public String m2() {
        // 보관소에 데이터 저장
        return "hello! 안녕";
    }
    
    
    
}