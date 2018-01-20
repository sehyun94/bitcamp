package bitcamp.java100.ch21.ex4;
// AOP 필터 적용후
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext appCtx = 
                new ClassPathXmlApplicationContext(
                        "bitcamp/java100/ch21/ex4/application-context1.xml");

        System.out.println("---------------------------");
        
        String[] names = appCtx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.printf("%s => %s\n ",
                    name, appCtx.getBean(name).getClass().getName());
        }
        
        System.out.println("------------------------------------------------");
        
        Front obj = (Front) appCtx.getBean(Front.class);
        System.out.println(obj.x.getClass().getName());
        System.out.println("------------------------------------------------");
        obj.test("홍길동");
        System.out.println("------------------------------------------------");
        
        
        obj.test(null);
    }
}
