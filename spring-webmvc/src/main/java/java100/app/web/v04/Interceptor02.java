package java100.app.web.v04;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Interceptor02 implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        System.out.println("HandlerInterceptor02 .preHandle() 호출 ");
        return true; // 다음 인터섭테가 있다면 계속 실행하라
        // false 를 리턴한다면 더이상 인터셉터를 실행하지 않고 응답한다.
    }
    
     @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
         // 페이지 컨트롤러의 요청 핸들러가 호출된 후 실행된다.
         // 즉 JSP가 실행되기 전에 호출된다.
         System.out.println("Interceptor02. postHandle() 호출");
    }
     
     @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
         
         // 요청 처리를 완료한 후 호출한다.
         // 즉 JSP 실행 완료후 호출 
         System.out.println("Interceptor02.afterCompletion()호출");
    }
}
