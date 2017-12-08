
package java100.app;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java100.app.util.DataSource;


@WebServlet(
        urlPatterns="/init",
        name="ApptInitSerlvet",
        loadOnStartup=1)
@Configuration // 이 클래스가 스프링 IoC 컨테이너를 위한 설정 클래스임을 표시
@ComponentScan("java100.app") // @Component 붙은 클래스가 어느 패키지에 있는지 표시
public class AppInitServlet implements Servlet {
    

    
    ServletConfig servletConfig;
    // Spring Ioc 컨테이너 객체
    public static AnnotationConfigApplicationContext iocContainer;

    // Spring Ioc 컨테이너에게 getDataSource() method를 호출해서 
    // 이 method 가 리턴한 객체를 꼭 컨테이너에 보관해달라고 표시! => @Bean 
    @Bean
    DataSource getDataSource() {
        DataSource ds = new DataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/studydb");
        ds.setUsername("study");
        ds.setPassword("1111");
        return ds;
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("AppInitServlet.inti()'");
        
        this.servletConfig = config;
        iocContainer = new AnnotationConfigApplicationContext(AppInitServlet.class);
    }

    @Override
    public void service(ServletRequest req, ServletResponse res)
            throws ServletException, IOException {
        System.out.println("AppInitServlet.init()'");
        // 이메서드는 클라이언트가 요청할 때 마다 호출되는 메서드이다.
        // AppInitServlet의 역활은 다른 서블릿이 사용할 도구를 준비하는 일을 한다.
        // 직접적으로 Client 요청을 처리하는 일을 하지 않는다.
        // 따라서 이 메서드 안에 코드를 넣지 않는다.
    }
    
    @Override
    public void destroy() {
        System.out.println("AppInitServlet.init()'");
        // 이 메서드는 웹 애플르케이션을 종료할 때 서블릿 컨테이너가 호출하는 메서드이다
        // 왜 ? 
        // 웹 애플리케이션을 시작할 때 서블릿들이 사용하기 위해 준비한 자원을 
        // 해제시키라고 호출하는 것이다.
        // 즉 서블릿 컨테이너를 종료하기 전에 각각의 서블릿들이 자신들이 사용한 자원을 해제시키는 코드를 둔다 
        
            DataSource ds = iocContainer.getBean(DataSource.class);
            ds.close();
    }

    @Override
    public ServletConfig getServletConfig() {
        // 이 메서드는 init() 가 호출 되었을 때 넘겨 받은 
        // ServletConfig 객체를 리턴하는 메서드 이다.
        // 서블릿 컨테이너가 호출 하기도 하고
        // 서블릿을 작성하는 개발자가 필요에 따라 호출 하기도 한다.
        // 따라서 init() 메서드를 작성할 때 
        return this.servletConfig;
    }
    
    @Override
    public String getServletInfo() {
        // 이 메서드는 서블릿 정보를 출력할 때 호출된다
        // 간단히 서블릿 정보를 문자열로 리턴한다.
        // 서블릿 컨테이너가 관리 화면에서 서브릿 정보를 출력하기 위해 호출 하는 경우도 있고,
        // 개발자가 사용된 정보를 출력하고 할 때 호출 하는 경우도 있따../
        // 그러나 
        return "이 서플릿은 다른 서플릿을 위한 스프릥 ioc 컨테이너";
    }
}

















