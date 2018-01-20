package bitcamp.java100.ch21.ex7;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// 특정 위치에 삽입될 코드를 갖고 있는 클래스를 정의한다.
// 
@Component
@Aspect

public class MyAdvice {
    
    // XML 설정 파일 대신에 애노테이션을 사용하여 advice를 지정할 수 있다.
    // 

    @Before("execution(* bitcamp..X.*(..)) and args(name)")
    public void doBefore(String name) {
        System.out.printf("MyAdvice.doBefore: %s\n", name);
    }
    
    @After("execution(* bitcamp..X.*(..))")
    public void doAfter() {
        System.out.println("MyAdvice.doAfter()");
    }
    
    // 리턴 값 받기 
    @AfterReturning(value="execution(* bitcamp..X.*(..))",
                    returning="returnValue")
    public void doAfterReturning(Object returnValue) {
        System.out.printf("MyAdvice.doAfterReturning(): %s\n", returnValue);
    }
    
    @AfterThrowing(value="execution(* bitcamp..X.*(..))",
                   throwing="error")
    public void doAfterThrowing(Exception error) {
        System.out.printf("MyAdvice.doAfterThrowing(): %s\n", error.getMessage());
    }
    
    public void doAround() {
        System.out.println("MyAdvice.doAround()");
    }

}
