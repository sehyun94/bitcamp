package bitcamp.java100.ch21.ex3;
// AOP 필터 적용후
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext appCtx = 
                new ClassPathXmlApplicationContext(
                        "bitcamp/java100/ch21/ex3/application-context1.xml");

        System.out.println("---------------------------");
        
        String[] names = appCtx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.printf("%s => %s\n ",
                    name, appCtx.getBean(name).getClass().getName());
        }
        
        System.out.println("------------------------------------------------");
        
        Front obj = (Front) appCtx.getBean(Front.class);
        obj.test("홍길동");
        System.out.println("------------------------------------------------");
        
        obj.test(null);
        //[advice 적용 위치]
        // Before => 메서드 실행 전
        // After => 메서드 실행후
        // AfterReturning => 값 리턴후
        // AfterThrowing => 예외를 던진 후 
    }
}
