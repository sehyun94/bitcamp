package java100.app.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java100.app.annotation.RequestMappingHandlerMapping;
import java100.app.util.DataSource;

// @WebListener <= 스프링 설정 클래스 정보를 DD FIle 에서 받기 위해 
                // @annotaiton을 제거한다 . 대신 DD File 에 선언한다
public class ContextLoaderListener implements ServletContextListener {
        public static AnnotationConfigApplicationContext iocContainer;
        public static RequestMappingHandlerMapping handlermapping;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("contxet loaderlister 실행1");
        ServletContext webApplication = sce.getServletContext();
        String configClassName = webApplication.getInitParameter(
                "contextConfigLocation");
        
        //웹 애플리케이션이 시작될 때 
        // AppConfig클래스에 설정된대로
        // spring ioc를 준비한다 .
        
        try {
            
            Class<?> configClass = Class.forName(configClassName);
            iocContainer = new AnnotationConfigApplicationContext(configClass);
           
            // 스프링IoC 컨테이너에 들어있는 페이지 컨트롤러를 찾는다.
            // 그리고 페이지 컨트롤러에서 요청 핸들러를 찾아 맵을 구성한다.
            // 이렇게 구성된 맵은  
            handlermapping = new RequestMappingHandlerMapping(iocContainer);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


   
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // 웹 애플리케이션이 종료할 때 DB 커넥션 풀에 저장된 
        // 모든 커넥션을 닫는다. 
        DataSource ds = iocContainer.getBean(DataSource.class);
        ds.close();
    }

}
