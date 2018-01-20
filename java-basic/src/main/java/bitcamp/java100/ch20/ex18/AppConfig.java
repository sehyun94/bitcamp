package bitcamp.java100.ch20.ex18;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 스프링 IoC 컨테이너 중에서
@Configuration
@ComponentScan("bitcamp.java100.ch20.ex18")
public class AppConfig {
    
    // @ComponentScan 애노테이션은 다음의 XML 설정과 같다.
    //  <context:component-scan base-package="org.example"/>
    
}
