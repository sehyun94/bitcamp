// 세션 다루기 - @SessionAttribute  
package java100.app.web.v03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;   


 
@Controller
@RequestMapping("/v03/test07")

// @SessionAttributes에 이름을 지정하면 요청이 들어올 때 다음과 같이 동작한다.
//  => 요청 핸들러의 실행이 끝났을 때
//    1) 요청 핸들러에서 Model 객체에 그 이름으로 값을 보관했을 경우
//      - Model 객체에 보관된 값은  ServletRequest 보관소에 복사를 한다.
//      - @SessionAttributes에 지정된 값은 HttpSession 보관소에도 복사한다.
//    2) 요청 
// Model 객체에 보관되는 값은 프론트 컨트롤러가 JSP를 실행하기 전에
// ServletRequest 보관소에 복사를 하는데,
// 다음 애노테이션에 지정된 값은 세션 보관소에도 복사한다.

@SessionAttributes({"name","age"})
public class Test07 {

    // 세션에 저장하고 싶은 값이 있으면 , Map/Model 객체에 주로 담는다 
    @RequestMapping(value="/m1", produces="text/plain;charset=UTF-8")
    public String m1(Model model) {
        
        // 프론트 컨트롤러가 준 Model 객체에 값을 저장하면,
        // 이 값은 ServletRequest 저장소에 보관된다.
        // 만약 Model에 저장되는 값의 이름이
        // 클래스 선언부에 @SessionAttributes에 설정되어 있다면 
        // 그 값은 HttpSession 객체에 보관된다.
        model.addAttribute("name", "홍길동");
        model.addAttribute("age", 20); 
        model.addAttribute("working", true); 
        
        // Model에 보관된 값이 ServletRequest에 저장되었는지 확인해보자
        return "v03/test07/m1";
    }
    
    @RequestMapping(value="/m2", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m2(
            @ModelAttribute("name")String name,
            @ModelAttribute("age") int age) {
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("name=%s\n", name));
        buf.append(String.format("age=%s\n", age));
        
        // Model에 보관된 값이 ServletRequest에 저장되었는지 확인해보자
        return buf.toString();
    }
    
    @RequestMapping(value="/m3", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m3(
            @ModelAttribute String name,
            @ModelAttribute  int age) {
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("name=%s\n", name));
        buf.append(String.format("age=%d\n", age));
        
        // Model에 보관된 값이 ServletRequest에 저장되었는지 확인해보자
        return buf.toString();
    }
    
    @RequestMapping(value="/m4", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m4(
            @ModelAttribute("working") String working) {
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("working=%s\n", working));
        
        // Model에 보관된 값이 ServletRequest에 저장되었는지 확인해보자
        return buf.toString();
    }
    
    // 요청 핸들러의 호출이 끝난 후,
    // 프론트 컨트롤러는 JSP가 세션 값을 사용할 수 있도록 
    // 세션에 있는 값 중에서 @SessionAttributes 에서 지정된 값을 
    // ServleRequest 보관소에 복사해준다
    // => 다만 이미 ServletRequest에 그 이름을 갖는 값이 있다면,
    //    그 값은 그대로 둔다
    @RequestMapping(value="/m5")
    public String m5() {
        
        //  여기에서 Model 객체에 name 과 age값을 저장하지 않더라도,
        //  (즉 ServletRequest에 name과 age가 없다)
        // 세션에 보관된 값 중에서 @sessionattributes 에 지정된 값은
        // JSP를 실행하기 전에 ServletRequest에 담아 준다.
        return "v03/test07/m1";
    }
    
    
    
    
}