// 요청 핸들러의 리턴 값 
package java100.app.web.v03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;


@Controller
@RequestMapping("/v03/test01")
public class Test01 {

    // View 컴포넌트 URL을 리턴하는 경우
    // => 프론트 컨트롤러는 요청 핸들러가 리턴하는 Servlet/JSP를 인클루드(실행)한다.
    
    @RequestMapping("/m1")
    public String m1() {
        // 스프링에 기본 설정된 viewResolver를 사용할 경우에는 
        // 다음과 같이 전체 JSP URL 정보를 리턴하면 된다.
        // 이방식의 문제점은 나중에 JSP 파일의 경로가 바뀌게 되면,
        // 모든 페이지 컨트롤러의 소스코드를 변경해야 하는 문제가 있다.
        // 그래서 현업에서는 기본 ViewReslover 대신 다른 뷰 리졸버를 사용한다.
        // return "/hello.jsp";
        
        // 만약 기본 ViewResolver를 다른 것으로 교체하였다면, 
        // 그 리졸버 규칙에 따라 JSP URL을 리턴해야 한다.
        
        // 예를들어 , InternalREsourceViewResolver 인 경우,
        // 리턴 값은 JSP 전체 경로 대신 일부 경로만 작성하면 된다.
        // 나머지 경로는 리턴한 경로의 앞뒤에 붙임으로써
        // 전체 경로가 완성된다.
        // 이유 ?
        //   전체 경로를 모두 리턴하지 않는 이유?
        // => 나중에 JSP 경로를 바꾸기 쉽게 하기 위해
        // => 또는 리턴한 JSP의 경로를 바꾸기 쉽게 하기 위해
        
        return "v03/test01/m1"; 
        // app-servlet.xml 에 설정된 
    }
    
    // 값을 리턴하지 않는 경우
    @RequestMapping("/m2")
    public void m2() { 
        System.out.println("test01 m2()호출");
    }
    
    // URL 정보를 객체에 담아서 리턴하기 
    @RequestMapping("/m3")
    public View m3() { 
        System.out.println("test01 m3()호출");
        
        View view = new InternalResourceView("/v03/test01/m3.jsp");
        return view;
    }
}