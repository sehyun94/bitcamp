package bitcamp.java100.ch20.ex1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args) {

        //1)  XML 설정 파일을 읽어서 객체를 준비하는 컨테이너
        // => XML 설정 파일은 자바 클래스 경로에 존재한다.
        ClassPathXmlApplicationContext  appCtx = 
                new ClassPathXmlApplicationContext(
                        "bitcamp/java100/ch20/ex1/application-context.xml");
        
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
