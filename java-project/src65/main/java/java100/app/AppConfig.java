package java100.app;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java100.app.util.DataSource;

    @Configuration // 이 클래스가 스프링 IoC 컨테이너를 위한 설정 클래스임을 표시
    @ComponentScan("java100.app") // @Component 붙은 클래스가 어느 패키지에 있는지 표시
    public class AppConfig {
        
        @Bean
        DataSource getDataSource() {
            DataSource ds = new DataSource();
            ds.setDriverClassName("com.mysql.jdbc.Driver");
            ds.setUrl("jdbc:mysql://localhost:3306/studydb");
            ds.setUsername("study");
            ds.setPassword("1111");
            return ds;
        }
    }

