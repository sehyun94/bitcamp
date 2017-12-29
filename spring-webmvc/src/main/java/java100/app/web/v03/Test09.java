// 세션 다루기 - 세션 무효화 시키기   
package java100.app.web.v03;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;   



@Controller
@RequestMapping("/v03/test09")
//@SessionAttributes({"name","age"})
//  => 이 애노테이션이 없으면, 프론트 컨트롤러는 JSP 를 실행하기 전에
//      세션에 저장된 
public class Test09 {

    // 일부 값은 Model 객체를 통해 간접적으로 세션에 보관하고 ,
    // 일부 값은 직접 세션 객체에 보관해보자.
    @RequestMapping(value="/m1")
    public String m1(HttpSession session, Model model) {

        // 보관소에 저장된 값을 확인해보자!
        return "v03/test09/m1";
    }

    @RequestMapping(value="/m2", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m2(
            @ModelAttribute("name") String name,  
            @ModelAttribute("age") String age)   {
        
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("name=%s\n",name));
        buf.append(String.format("age=%s\n",age));


        // 보관소에 저장된 값을 확인해보자!
        return buf.toString();
    }

}