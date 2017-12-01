package bitcamp.java100.ch20.ex1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Test4 {
    @Bean("str1") // 스프링 Ioc 컨테이너가 호출해야 할 메ㅓ드 표시!
    // 이 메서드의 리턴 값은 컨테이너에 표시
    String getString1() {
        return new String();
    }

    @Bean("str2")
    String getString2() {
        return new String("Hello!");
    }

    public static void main(String[] args) {

        //1) 클래스의 애노테이션을 정보를 참고하여 빈을 관리하는 컨테이너 준비
        // => 빈의 정보는 XML 파일에 없다.
        // => 생성자에 지젛안 클래스에 에노테이션이로 존재한다.

        AnnotationConfigApplicationContext appCtx = 
                new AnnotationConfigApplicationContext(Test4.class);

        // 2) bean container에 보관된 객체 조회하기

        System.out.printf("빈 개수 = %d\n", appCtx.getBeanDefinitionCount());

        String[] names = appCtx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.printf("%s\n     -----> %s\n", name, appCtx.getBean(name).getClass().getName() );
        }

        System.out.println("-------------------------------");

        //3) 빈 값 꺼내서 출력하기
        String s1 = (String) appCtx.getBean("str1");
        String s2 = (String) appCtx.getBean("str2");

        System.out.println(s1);
        System.out.println(s2);

    }
}
